# Groovy Closure Return Issue

This repository demonstrates an unexpected behavior of closures in Groovy. When a closure contains a `return` statement, it might not behave as expected depending on how it's called.

The `bug.groovy` file shows how the return statement in the closure doesn't stop execution within the closure, but seems to return from the `myMethod` itself, producing unexpected output.

The `bugSolution.groovy` offers a solution illustrating how to handle returns within closures correctly and how to differentiate between returning from the closure and from the encompassing method.