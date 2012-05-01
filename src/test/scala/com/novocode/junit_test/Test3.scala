package com.novocode.junit_test

import org.junit.Test
import org.junit.BeforeClass
object Test3 {
  var x = 0
  @BeforeClass
  def setUp {
    x = 42
  }
}
class Test3 {
  @Test
  def test3 {
    println ("Test3.test3 is here!")
  }
}