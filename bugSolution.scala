```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
  def myMethodSafe(y: Int): Int = {
    x + y
  }
  def myMethodOption(y: Option[Int]): Int = {
    y match {
      case Some(value) => x + value
      case None => x //or throw an exception, etc.
    }
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethodSafe(10)) //this will return 15, which is expected.
  println(obj.myMethodOption(Some(10))) //this will return 15
  println(obj.myMethodOption(None)) //this will return 5, without exception
  //println(obj.myMethod(null)) //this will still throw exception
}
```