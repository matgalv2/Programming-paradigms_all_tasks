sealed trait BT[+A]
case object Empty extends BT[Nothing]
case class Node [A](element:A, left:BT[A], right:BT[A]) extends BT[A]



def minVal(bt:BT[Int]): Int = {
  def minValRec(bt: BT[Int], list: List[Int]): List[Int] = {
    bt match
    {
      case Empty  =>Nil
      case Node (v,l,r) => list ::: v :: minValRec(l, list)::: minValRec(r, list)
    }
  }
  minValRec(bt,Nil).min
}








def min (list: List[Int]): Int =
  list match
  {
    case Nil => throw new Exception("Empty list!")
    case h::Nil => h
    case h::t => if (h < min(t)) h else min(t)
  }

def minValBT(bt:BT[Int]) = {


    def minValRec(bt: BT[Int], list: List[Int]): List[Int] =
      {
       bt match
        {
          case Empty  =>Nil
          case Node (v,l,r) => list ::: v :: minValRec(l, list)::: minValRec(r, list)
        }
      }

  def min (list: List[Int]): Int =
    list match
    {
      case Nil => throw new Exception("Empty list!")
      case h::Nil => h
      case h::t => if (h < min(t)) h else min(t)
    }

  min(minValRec(bt,Nil))

}



val t = Node(11,Node(2,Empty,Node(3,Empty,Empty)),Empty)

minValBT(t)

min(List(0,4,3,-2,7,-1))

