package org.knoldus

import org.scalatest.FunSuite

class MathOperationTest extends FunSuite {
  var operations = new MathOperations

  test("add should return sum of two numbers") {
    assert(operations.add(9, 6) == 15)
  }

  test("sub should return difference of two numbers") {
    assert(operations.sub(9, 6) == 3)
  }

  test("mul should return product of two numbers") {
    assert(operations.mul(9, 6) == 54)
  }
}
