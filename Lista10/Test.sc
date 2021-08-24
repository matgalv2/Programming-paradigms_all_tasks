//class GenericCellMut[+T](val x: T)

class A{}
class B extends A{}


class GenericCellImm[T] (val x: T) {}
class GenericCellImm[+T] (val x: T) {}
//class GenericCellMut[T] (var x: T) {}
class GenericCellMut[T] (var x: T){}

val k = new GenericCellMut[Double](3)
k.x = 3.asInstanceOf[Int]
