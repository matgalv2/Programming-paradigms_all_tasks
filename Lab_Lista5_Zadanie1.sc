sealed trait BT[+A]
case object Empty extends BT[Nothing]
case class Node [A](element:A, left:BT[A], right:BT[A]) extends BT[A]




def rotate [A](bt:BT[A]):BT[A] =
  bt match
  {
    case Empty => Empty
    case Node (v,l,r) => Node (v,rotate(r), rotate(l))
  }

val t = Node(1,Node(2,Empty,Node(3,Empty,Empty)),Empty)

rotate(t) == Node(1,Empty,Node(2,Node(3,Empty,Empty),Empty))



def preorder[A](bt:BT[A]):List[A] = bt match
{
  case Node(v,l,r) => v :: preorder(l)::: preorder(r)
  case Empty => Nil
}