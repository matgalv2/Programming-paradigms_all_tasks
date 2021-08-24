import scala.collection.mutable


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