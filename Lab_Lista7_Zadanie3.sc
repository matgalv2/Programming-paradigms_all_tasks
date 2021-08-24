def duplicate [A](list1: List[A], list2:List[Int]):List[A] = {
  def helper [A](element: A, counter: Int):List[A] = {
    if (counter > 0) List(element) ::: helper(element, counter -1)
    else Nil
  }
  if (list1 != Nil && list2 != Nil) helper(list1.head, list2.head) ::: duplicate(list1.tail, list2.tail)
  else Nil
}


duplicate(List(3,2,2), List(2,6,1,3))

duplicate(Nil,Nil)


def duplicate2 (array1: Array[Int], array2: Array[Int]): Array[Int] =
{
  var z: Array[Int] = Array()

  for(i <- array1.indices)
  {
    var counter2 = array2(i)
    while (counter2 != 0)
    {
      z = z :+ array1(i)
      counter2 = counter2 -1
    }
  }
  z
}



duplicate2(Array(1,2,3,4),Array(1,0,2,4))

duplicate2(Array.emptyIntArray, Array.emptyIntArray)