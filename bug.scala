```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) //this will return 15, which is expected.
  println(obj.myMethod(null))
}
```