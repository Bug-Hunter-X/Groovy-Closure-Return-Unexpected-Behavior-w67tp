```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

myMethod { println "Inside closure" }

myMethod { 
  def x = 10
  println "x = $x"
  x = 20
  println "x = $x"
}

myMethod { 
  def y = 10
  println "y = $y"
  return 30
  println "This won't execute"
}
```