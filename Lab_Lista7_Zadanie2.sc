def lpolacz(l1:LazyList[Int], l2:LazyList[Int]): LazyList[Int] =
//  def lpolaczHelper(l1:LazyList[Int], l2:LazyList[Int]): Int =
    if(l1.head  <= l2.head) l1.head #:: lpolacz(l1.tail,l2)
    else l2.head #:: lpolacz(l1,l2.tail)

val k = LazyList(1,3,5,7)
val i = LazyList(2,4,6,8)

val p = lpolacz(i,k)

p.tail.head

// dla Scali 2.12, w 2.13 już nie działa

def lpolacz(s1:Stream[Int], s2:Stream[Int]): Stream[Int] =
  if(s1.head <= s2.head) s1.head #:: lpolacz(s1.tail, s2)
  else s2.head #:: lpolacz(s1, s2.tail)


val j = Stream(1,3,5,7)
val n = Stream(2,4,6,8)

val l = lpolacz(j,n)

l.tail.head