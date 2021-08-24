def accumulate (fun:(Int, Int) => Int, list:List[Int], startingValue: Int): Int =
  list match
  {
    case Nil => startingValue
    case _ => fun(startingValue, accumulate(fun,list.tail,list.head))
  }


def accumulateTail (fun:(Int, Int) => Int, list:List[Int], startingValue: Int): Int =
{
  def accumulateTailRec(fun: (Int, Int) => Int, list: List[Int], accumulator: Int, startingValue: Int): Int =
    list match {
      case Nil => accumulator
      case _ => accumulateTailRec(fun, list.tail, fun(list.head, accumulator), startingValue)
    }
  if (list == Nil) startingValue
  else
  accumulateTailRec(fun,list, startingValue, startingValue)
}

val sum = (x: Int, y: Int) => x+y
val multiplication = (x: Int, y: Int) => x*y

val list1 = List(1,2,3,4,5)
val list2 = Nil
val list3 = List(0,-1,-2,5,6)

accumulate (sum, list1,0) == 15
accumulateTail(sum,list1,0) == 15

accumulate(multiplication, list2, 1) == 1
accumulateTail(multiplication, list2, 1) == 1

accumulate(sum,list3, 0) == 8
accumulateTail(sum,list3,0) == 8


