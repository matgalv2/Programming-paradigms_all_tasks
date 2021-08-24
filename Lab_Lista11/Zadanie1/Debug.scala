package Lab_Lista11.Zadanie1

trait Debug {
  def debugName(): Unit = {
    println("Klasa: " + getClass)
  }
}
