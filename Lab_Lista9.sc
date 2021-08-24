final class ComplexNumbers(val re: Double, val im: Double)
{

  def conjugate(): ComplexNumbers =
    new ComplexNumbers(re, -im)

  def add(cNum: ComplexNumbers): ComplexNumbers =
    new ComplexNumbers(re + cNum.re, im + cNum.im)

  def subtract(cNum: ComplexNumbers): ComplexNumbers =
    new ComplexNumbers(re - cNum.re, im - cNum.im)

  def multiply(cNum: ComplexNumbers): ComplexNumbers =
    new ComplexNumbers(re * cNum.re - im * cNum.im, re * cNum.im + cNum.re * im)

  def divide(cNum: ComplexNumbers): ComplexNumbers =
    new ComplexNumbers((re * cNum.re + im * cNum.im)/(re*cNum.re + im*cNum.im),
                        (im * cNum.re - re * cNum.im)/(re*cNum.re + im*cNum.im))

  override def equals(obj: Any): Boolean =
    if(!obj.isInstanceOf[ComplexNumbers])
      false
    else
        if(obj.asInstanceOf[ComplexNumbers].re == re &&
          obj.asInstanceOf[ComplexNumbers].im == im) true
        else false


  override def toString: String = {
    if (im >= 0)
      s"$re + $im i"
    else
      s"$re - ${Math.abs(im)} i"
  }
}
/* Komentarz do kostruktora:

* Podstawowy konstruktor wymaga podania części rzeczywistej i urojonej,
* więc nie trzeba sprawdzać, czy zostały podane, bo jeśli się nie poda 2 wartości,
* to nie da się stworzyć obiektu.
*
* Ale jeśli w zadaniu chodziło o to, że można stworzyć obiekt z podanymi 0 lub 1 wartością,
* a potem należy sprawdzić ich poprawność, to tu są dodatkowe konstruktory:
*
* def this() =
    {
      this(0.0, 0.0)
      throw new Exception("wrong parameters")
    }
  def this(x: Double)
  {
    this(0.0, 0.0)
    throw new Exception("wrong parameters")
  }
*
* */

val k = new ComplexNumbers(3,4)
val i = new ComplexNumbers(3,4)
val j = new ComplexNumbers(1.5, 2)


k.conjugate() //3.0 - 4.0 i
k.add(j) // 4.5 + 6.0 i
k.subtract(j) //1.5 + 2.0 i
k.multiply(j) //-3.5 + 12.0 i
k.divide(j) //1.0 + 0.0 i

k.equals(j)
k.equals(i)

k.toString

