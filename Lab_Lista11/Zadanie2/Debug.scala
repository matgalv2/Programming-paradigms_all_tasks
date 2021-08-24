package Lab_Lista11.Zadanie2

trait Debug {
  def debugVars(): Unit = {
    val fields = getClass.getDeclaredFields

    for (field <- fields) {
      field.setAccessible(true)
      println("Pole: " + field.getName + " => " + field.getType + ", " + field.get(this))
    }
  }
}
