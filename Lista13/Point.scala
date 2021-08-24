package Lista13

class Point(private var _x:Int = 0, private var _y:Int = 0)
{
  def x: Int = _x
  def x_=(newX:Int):Unit = _x = newX
  def setX(newX: Int): this.type ={ x = newX; this}

  def y: Int = _y
  def y_=(newY:Int): Unit = _y = newY
  def setY(newY: Int): this.type = {y = newY; this}
}

class Circle(private var _x:Int= 0, private var _y:Int= 0, private var _r: Int= 0) extends Point(_x, _y)
{

  def r: Int = _r
  def r_=(newR:Int): Unit = _r = newR
  def setR(newR: Int): this.type ={r = newR; this}

}

class Cylinder(private var _x:Int= 0, private var _y:Int= 0, private var _r: Int= 0, private var _h: Int= 0) extends Circle(_x, _y, _r)
{
  def h: Int = _h
  def h_=(newH:Int): Unit= _h = newH
  def setH(newH:Int): this.type = {h = newH; this}
}

object Zadanie4 extends App
{
  var k = new Cylinder(1,1,1,1)

  k.setX(3).setH(3).setR(3)
}
