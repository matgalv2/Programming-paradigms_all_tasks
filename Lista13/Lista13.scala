package Lista13

//Zadanie 1
class ParametrizedPair1[T,E](private var _fst: T,private var _snd: E)
{
  def fst:T = _fst
  def fst_=(newFst: T): Unit = _fst = newFst

  def snd:E = _snd
  def snd_=(newSnd: E): Unit = _snd = newSnd

  override def toString: String = s"($fst,$snd)"
}

// Obiekt będzie typu nominalnego dodatkowo skonretyzowanego przez typy T i E.
// Klasa jest sparametryzowana typami T i E.

//Zadanie 3


class Pracownik1(private val _nazwisko: String)
{
  Pracownik1._liczbaPracownikow += 1
  private var zwolniony = false

  def nazwisko: String = _nazwisko

  def zwolnij():Unit = {
    zwolniony = true
    Pracownik1._liczbaPracownikow -= 1
  }

  override def toString: String = s"$nazwisko: ${if(zwolniony) "zwolniony" else "zatrudniony"}"

}

object Pracownik1
{
  private var _liczbaPracownikow = 0

  def apply(nazwisko: String) = new Pracownik(nazwisko)

  def liczbaPracownikow:Int = _liczbaPracownikow

}



//Zadanie 4

class Point1(private var _x:Int, private var _y:Int)
{
  def x: Int = _x
  def x_=(newX:Int):Unit = _x = newX
  def setX(newX: Int): this.type ={ x = newX; this}

  def y: Int = _y
  def y_=(newY:Int): Unit = _y = newY
  def setY(newY: Int): this.type = {y = newY; this}
}

class Circle1(private var _x:Int, private var _y:Int, private var _r: Int) extends Point(_x, _y)
{

  def r: Int = _r
  def r_=(newR:Int): Unit = _r = newR
  def setR(newR: Int): this.type ={r = newR; this}

}

class Cylinder1(private var _x:Int, private var _y:Int, private var _r: Int, private var _h: Int) extends Circle(_x, _y, _r)
{
  def h: Int = _h
  def h_=(newH:Int): Unit= _h = newH
  def setH(newH:Int): this.type = {h = newH; this}
}

// this.type - typ singletonowy. Jest to typ dokładnie tego obiektu, czyli wywołując x_= dla obiektu typu Cylinder,
// zostanie zwrócony obiekt typu Cylinder. Gdybyśmy określili zwracany typ wyłącznie jako this, to metoda zwracałaby obiekt klasy Point.

// Notacja this.type zwraca nam typ singletonowy, czyli typ tego jedynego obiektu na rzecz, którego wywołaliśmy metodę.