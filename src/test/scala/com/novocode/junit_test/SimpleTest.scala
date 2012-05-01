package com.novocode.junit_test

import org.junit.Test
import org.junit.Assert._

class SimpleTest {
  @Test def testDist {
    println("In SimpleTest.testDist")
    val p = new Point(3, 4)
    assertEquals(5.0, p.distance, 0.0001)
  }
}
