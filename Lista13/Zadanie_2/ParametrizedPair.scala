package Lista13.Zadanie_2

trait ParametrizedPairT
{
  type T
  type E
  private var _fst:T = _
  def fst:T = _fst
  def fst_=(newFst: T) = _fst = newFst

  private var _snd:E = _
  def snd:E = _snd
  def snd_=(newSnd: E) = _snd = newSnd

}

abstract class ParametrizedPair
{
  type T
  type E

  private var _fst:T = _
  private var _snd:E = _

  def fst:T = _fst
  def fst_=(newFst: T) = _fst = newFst

  def snd:E = _snd
  def snd_=(newSnd: E) = _snd = newSnd


  override def toString: String = s"($fst,$snd)"
}
// Obiekt będzie typu strukturalnego, uszczegółowiony typami T i E.
// Obiektu klasy abstrakcyjne nie da się stworzyć, chyba że uszczegółowimy typ albo jakaś klasa odziedziczy po niej.
// Tak samo będzie z traitem.


object Zadanie2 extends App
{
  var b = new ParametrizedPair(){type T = String; type E = Int}

  var g = new ParametrizedPairT{type E = String}
  print(b.fst)
}