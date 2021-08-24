package Lista10.Zadanie1


//class GenericCellMut[+T](var x: T) // jeśli var, to klasa nie może być kowariantna
class GenericCellMut[+T](val x: T)

class A{}
class B extends A{}


object Test
{
  def main(args: Array[String]): Unit = {
    var c = new GenericCellMut[A](new B())
    c = new GenericCellMut[B](new B)
    var p = 4
  }
}
