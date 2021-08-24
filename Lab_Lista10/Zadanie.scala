package Lab_Lista10

class Zadanie(val nazwa: String, val tryb: String, var status: String , var pracownik: Pracownik)
{
  def this(nazwa: String, tryb: String)=
    this(nazwa, tryb, "WPrzygotowaniu", null)

  def uruchomZadanie(pracownik: Pracownik): Unit =
  {
    this.pracownik = pracownik
    status = "WToku"
  }

  def zakonczZadanie(): Unit =
  {
    if (status.equals("WToku"))
      status = "Zakonczone"
    else
      throw new Exception("Zadanie wciaz jest przygotowywane")
  }

  override def toString():String =
  {
    if(pracownik == null)
      s"$nazwa, $tryb, $status, Brak przypisanego pracownika"
    else
      s"$nazwa, $tryb, $status, ${pracownik.pesel}"
  }

}
