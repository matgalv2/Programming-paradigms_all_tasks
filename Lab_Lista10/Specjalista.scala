package Lab_Lista10

class Specjalista(imie: String, nazwisko: String, pesel: String, placa: Double, var premia: Double) extends Pracownik(imie, nazwisko, pesel, placa)
{
  def podwyzszPlacePremia(): Unit =
    _placa = _placa + premia


  def podwyzszPlacePremia(premia: Double):Unit =
    _placa = _placa + premia

  override def toString: String =
    super.toString + s" $premia"
}
