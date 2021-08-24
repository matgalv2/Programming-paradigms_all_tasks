
// Zadanie 1.

class Time1(var hour: Int)
{
  if (hour < 0)
    hour = 0
}

object Time1
{
  def apply(hour: Int) = new Time1(hour)
}


// Zadanie 2.

// a

class Time2(private var hourField: Int, private var minuteField: Int)
{
  require(hourField >= 0 && hourField < 24, s"hour = $hourField")
  require(minuteField >= 0 && minuteField < 60, s"minute = $minuteField")

  def hour: Int = hourField

  def hour_(newHour: Int): Unit = {
    if (newHour < 0 || newHour >= 24) throw new IllegalArgumentException("newHour")
    else hourField = newHour
  }

  def minute: Int = minuteField

  def minute_(newMinute: Int): Unit =
  {
    if(newMinute < 0 || newMinute >= 60) throw new IllegalArgumentException("newMinute")
    else minuteField = newMinute
  }

  def before(other: Time2): Boolean = {
    hourField * 60 + minuteField < other.hourField * 60 + other.minuteField
  }
}

// b


class Time3(private var hourField: Int, private var minuteField: Int)
{
  require(hourField >= 0 && hourField < 24, s"hour = $hourField")
  require(minuteField >= 0 && minuteField < 60, s"minute = $minuteField")

  private var passedMinutesField = hour * 60 + minute

  def hour: Int = hourField

  def hour_(newHour: Int) : Unit =
  {
    if(newHour < 0 || newHour >= 24) throw new IllegalArgumentException
    else
    {
      hourField = newHour
      passedMinutesField = hourField * 60 + minuteField
    }
  }

  def minute: Int = minuteField

  def minute_(newMinute: Int): Unit =
  {
    if(newMinute < 0 || newMinute >= 60) throw new IllegalArgumentException
    else
    {
      minuteField = newMinute
      passedMinutesField = hourField * 60 + minuteField
    }
  }

  def passedMinutes: Int = passedMinutesField

}



// Zadanie 3.


class Pojazd(private val producent: String, private val model: String,
             private val rok_produkcji: Int = -1, private var numer_rejestracyjny: String = "")
{
//  def this(producent: String, model: String, numer_rejestracyjny: String) =
//    this(producent, model, -1, numer_rejestracyjny)
}


// Zadanie 4.


object UzycieWyjatkow
{
  def metoda1(): Unit =
    metoda2()
  def metoda2(): Unit =
    metoda3()
  def metoda3(): Unit =
    throw new Exception("Wyjatek zgloszony w metoda3")

  def main(args: Array[String]): Unit =
  {
    try
      {
        metoda1()
      }
    catch
      {
        case e: Exception => System.err.println(e.getMessage + "\n")
          e.printStackTrace()
      }

  }

}