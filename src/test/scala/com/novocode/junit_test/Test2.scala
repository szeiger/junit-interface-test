package com.novocode.junit_test

import org.junit.Test
import org.junit.BeforeClass
object Test2 {
  var x = 0
  @BeforeClass
  def setUp {
    x = 42
  }
}
class Test2 {
  @Test
  def test2 {
    println ("Test2.test2 is here!")
  }
}
