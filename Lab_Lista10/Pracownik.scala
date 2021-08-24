package Lab_Lista10

class Pracownik(var imie: String,var nazwisko: String, var pesel: String, var _placa: Double)
{

//  def this() =
//    this("Jan","Kowal", "000",1300)


//  def placa:Double = _placa
//
//  def placa_=(nowaPlaca: Int): Unit =
//    _placa = nowaPlaca



  def podwyzka(procent: Double) = {
    _placa= (procent + 100)/100 * _placa
  }

  override def toString: String =
    s"$imie $nazwisko $pesel ${_placa}"
}