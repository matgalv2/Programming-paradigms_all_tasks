/* Mateusz Galicki */

def ltake [A](lazyList: LazyList[A], n:Int):List[A] =
  (lazyList, n) match
  {
    case (_, 0) => List()
    case (LazyList(), _) => List()
    case (hd #:: _, _) => hd :: ltake(lazyList.tail, n-1)
  }


/*Zadanie 1.*/
def lrepeat[A](lazyList: LazyList[A], k: Int): LazyList[A] =
  {
    def repeatHelper(lList: LazyList[A], n: Int): LazyList[A] = {
      (n, lList) match
      {
        case (0, _#:: tl) => repeatHelper(tl, k)
        case (_, LazyList()) => LazyList()
        case (_,hd #:: _) => hd #:: repeatHelper(lList, n-1)
      }
    }
    repeatHelper(lazyList, k)
  }

lrepeat(LazyList(0,1,2,3,4), 2) == LazyList(0,0,1,1,2,2,3,3,4,4)
lrepeat(LazyList(-1,-2),0) == LazyList()
lrepeat(LazyList(),3) == LazyList()







/*Zadanie 2.*/
val fib =
  {
    def fibRec (x: BigInt, y: BigInt): LazyList[BigInt] =
      x #:: fibRec(y, x+y)

    fibRec(1,1)
  }

ltake(fib,6) == List(1,1,2,3,5,8)