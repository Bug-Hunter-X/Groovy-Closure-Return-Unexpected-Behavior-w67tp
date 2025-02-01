```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  def result = closure.call()
  println "After closure execution: result = $result"
}

myMethod { println "Inside closure"; return null }

myMethod { 
  def x = 10
  println "x = $x"
  x = 20
  println "x = $x"
  return x
}

myMethod { 
  def y = 10
  println "y = $y"
  return 30
}
```