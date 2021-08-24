import scala.collection.mutable

// Seq są niemutowalne, dlatego używamy mutable.Seq .
def copy[T](destination: mutable.Seq[T], source: mutable.Seq[T]): Unit =
{
  if(source.length > destination.length)
  {
    throw new IllegalArgumentException
  }

  var index = 0

  for(value <- source)
  {
    destination.update(index, value)
    index += 1
  }

}




val k = mutable.Seq(1,2,3,4)
val p = mutable.Seq(5,5,5,5,5)

copy(p,k)

p == mutable.Seq(1,2,3,4,5)
