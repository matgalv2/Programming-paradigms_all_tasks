package Lista13

class Pracownik(private val _nazwisko: String)
{
  Pracownik._liczbaPracownikow += 1
  private var zwolniony = false

  def nazwisko: String = _nazwisko

  def zwolnij():Unit = {
    if(!zwolniony)
    {
      zwolniony = true
      Pracownik._liczbaPracownikow -= 1
    }
  }


  override def toString: String = s"$nazwisko, zwolniony: $zwolniony"
}

object Pracownik
{
  private var _liczbaPracownikow = 0

  def apply(nazwisko: String) = new Pracownik(nazwisko)

  def liczbaPracownikow:Int = _liczbaPracownikow

}


object  Zadanie3 extends App
{
  var k = Pracownik("Who")
  println(k)
  println(Pracownik.liczbaPracownikow)
  k.zwolnij()
  println(Pracownik.liczbaPracownikow)
}