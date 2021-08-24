import scala.annotation.tailrec
import scala.collection.mutable


//zadanie 5




def wordCounter(text: String):scala.collection.mutable.Map[String,Int] =
{
  val map: mutable.Map[String,Int] = mutable.Map()
  val words = text.split(" ")


  for(word <- words)
  {
    var counter = 0
    for(element<-words)
    {
      if(element == word)
        counter += 1
    }
    map.addOne(word,counter)
  }
  map
}

wordCounter("A A b a")

var a = Some

//def wordCounter2(text: String):scala.collection.mutable.Map[String,Int] =
//{
//  @tailrec
//  def countRepeats(word: String, allWords: Array[String], counter: Int): Int =
//    allWords match
//    {
//      case Array.empty =>counter
//      case hd ::: _ => if(word == hd) countRepeats(word, allWords, counter+1) else countRepeats(word, allWords, counter)
//    }
//
//
//  val map: mutable.Map[String,Int] = mutable.Map()
//  val words = text.split(" ")
//
//  for(word <- words)
//  {
//    map.addOne(word,countRepeats(word,words,0))
//  }
//  map
//}