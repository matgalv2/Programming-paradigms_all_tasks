package Lista13.Zadanie_1

class ParametrizedPair[T,E](private var _fst: T,private var _snd: E)
{
  def fst:T = _fst
  def fst_=(newFst: T): Unit = _fst = newFst

  def snd:E = _snd
  def snd_=(newSnd: E): Unit = _snd = newSnd

  override def toString: String = s"($fst,$snd)"
}



object Zadanie1 extends App
{
  var k = new ParametrizedPair[Int,String](4," ")

}