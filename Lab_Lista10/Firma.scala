package Lab_Lista10

class Firma(var pracownicy: List[Pracownik], var listaZadan: List[Zadanie])
{
  def this() =
  this(List(),List())
//  this(Nil,Nil)

  def dodajPracownika(pracownik: Pracownik):Unit =
     pracownicy = pracownik :: pracownicy


  def dodajZadanie(nazwa: String, tryb: String): Unit =
    listaZadan = new Zadanie(nazwa, tryb) :: listaZadan

  def dodajZadanie(zadanie: Zadanie): Unit =
    listaZadan = zadanie :: listaZadan

  def wyszukajPracownika(pesel: String): Pracownik =
  {
    for(pracownik <- pracownicy)
    {
      if (pracownik.pesel == pesel) pracownik
    }
    null
  }

  def podwyzszPlaceWszystkim(procent: Double): Unit =
    for(pracownik <- pracownicy)
    {
      pracownik.podwyzka(procent)
    }


  def podwyzszPlaceSpecjaliscie(specjalista: Specjalista, premia: Double): Unit =
    specjalista.podwyzszPlacePremia()

// przefiltrujListeZadań  nazwa-pracownik-status


  def przefiltrujListeZadan(): List[Zadanie] =
    listaZadan.sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(nazwa: String,  pracownik: Pracownik, status: String): List[Zadanie] =
    listaZadan.filter(_.nazwa.equals(nazwa)).filter(_.status.equals(status)).filter(_.pracownik.eq(pracownik)).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(nazwa: String, pracownik: Pracownik): List[Zadanie] =
    listaZadan.filter(_.nazwa.equals(nazwa)).filter(_.pracownik.eq(pracownik)).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(status: String, boolean: Boolean): List[Zadanie] =
    listaZadan.filter(_.status.equals(status)).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(pracownik: Pracownik): List[Zadanie] =
    listaZadan.filter(_.pracownik == pracownik).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(nazwa: String, status: String): List[Zadanie] =
    listaZadan.filter(_.nazwa.equals(nazwa)).filter(_.status.equals(status)).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(nazwa: String): List[Zadanie] =
    listaZadan.filter(_.nazwa.equals(nazwa)).sortBy(_.tryb)(Ordering[String].reverse)

  def przefiltrujListeZadan(pracownik: Pracownik, status: String): List[Zadanie] =
    listaZadan.filter(_.status.equals(status)).filter(_.pracownik.eq(pracownik)).sortBy(_.tryb)(Ordering[String].reverse)


  override def toString():String =
  {
    var all = "Pracownicy: \n"
    for (pracownik <- pracownicy)
    {
      all = all + pracownik.toString + "\n"
    }

    all = all + "Lista zadań:\n"


    for (zadanie <- listaZadan)
    {
      all = all + zadanie.toString + "\n"
    }
    all
  }

}