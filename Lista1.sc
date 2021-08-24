// Mateusz Galicki

//zadanie 1.
def flatten [A](list: List[List[A]]): List[A] =
  if (list.length == 0) Nil else list.head ::: flatten(list.tail)


flatten(List(List(2,3),List(4),List(5,6))) == List (2,3,4,5,6)
flatten(List(List())) == Nil
flatten(List(List("Ala", "ma"),List("kota"))) == List("Ala","ma","kota")
flatten(List(List(List(true, 6),5),List("String"))) == List(List(true, 6), 5, "String")



//zadanie 2.
def count [A](element: A,list: List[A]): Int =
  if (list.length == 0) 0
  else (if (list.head == element) 1 else 0 ) + count(element, list.tail)


count(0, List()) == 0
count("a",List("a","l","a")) == 2
count(Nil, List(List())) == 1
count(3,List(1,2,3,3,3,3,3)) == 5



//zadanie 3.
def replicate [A](element: A, x: Int): List[A] =
  if (x < 0) throw new Exception(s"Negative argument: $x ")
  else (if (x == 0) Nil else element::replicate(element, x -1))


replicate(Nil, 3) == List(List(),List(),List())
replicate("al", 2) == List("al", "al")
replicate(4, 0) == Nil



//zadanie 4.
def sqrList (list: List[Int]): List[Int] =
  if (list.length == 0) Nil
  else list.head*list.head :: sqrList(list.tail)


sqrList(List(2,3,4)) == List(4,9,16)
sqrList(List(0,-3,4)) == List(0,9,16)
sqrList(List(-1, -2,-3)) == List(1,4,9)
sqrList(Nil) == Nil



















//zadanie 5.
def palindrome [A](list: List[A]): Boolean =
  if (list == list.reverse) true
  else false


palindrome(Nil) == true
palindrome(List("k","a","j","a","k")) == true
palindrome(List(3.0,4.0,5.6)) == false
palindrome(List(3.0,4.5,3.0)) == true



//zadanie 6.
def listLength[A](list: List[A]): Int =
  if(list == Nil) 0
  else 1+listLength(list.tail)


listLength(List(3,4,5,5,6)) == 5
listLength(List("A","l","a")) == 3
listLength(Nil) == 0