package Lab_Lista10

object Main extends App {


  val firma = new Firma()

  val pracownik1 = new Pracownik("Jan", "Kowal", "000", 1300)
  val pracownik2 = new Specjalista("Jn", "Koal", "001", 1300, 200)
  val pracownik3 = new Pracownik("Ja", "Kal", "002", 1300)

  firma.dodajPracownika(pracownik1)
  firma.dodajPracownika(pracownik2)
  firma.dodajPracownika(pracownik3)

  val task1 = new Zadanie("task1", "Pilny")
  val task2 = new Zadanie("task2", "Normalny")
  val task3 = new Zadanie("task3", "Pilny")

  task1.uruchomZadanie(pracownik1)
  task2.uruchomZadanie(pracownik2)
  //    task3.uruchomZadanie(pracownik3)

  firma.dodajZadanie(task1)
  firma.dodajZadanie(task2)
  firma.dodajZadanie(task3)

  firma.podwyzszPlaceWszystkim(5)
  task1.zakonczZadanie()

  pracownik2.podwyzszPlacePremia()

  println(firma.przefiltrujListeZadan("WToku", true))
  println(firma.przefiltrujListeZadan("task1"))

  print(firma)
}
