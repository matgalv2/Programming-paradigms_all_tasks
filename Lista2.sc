import scala.annotation.tailrec
//Mateusz Galicki

//zadanie 2.a
def fib(n:Int):Int =
  if (n<0) throw new Exception ("Negative argument")
  else n match
  {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-2) + fib(n - 1)
  }


fib(6) == 8
fib(0) == 0
fib(1) == 1




//zadanie 2.b
def fibTail(n:Int):Int =
{
  if (n<0) throw new Exception ("Negative argument")

  @tailrec
  def fibRec(n:Int, f1:Int, f2:Int): Int =
  n match
  {
    case 0 => f1
    case 1 => f2
    case _ => fibRec(n-1, f2, f1+f2)
  }
  fibRec(n,0,1)
}


fibTail(6) == 8
fibTail(0) == 0
fibTail(2) == 2



fib(40)
fibTail(40)


//zadanie 5.
def initSegment [A](segment:List[A], list:List[A]): Boolean =
  (segment, list) match{
    case (Nil,_) => true
    case (_,Nil) => false
    case _ => if(segment.head == list.head) initSegment(segment.tail, list.tail)
      else false
  }

initSegment(List(1,2,3),List(1,2,3,4))


