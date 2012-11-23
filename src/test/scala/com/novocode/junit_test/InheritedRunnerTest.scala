package com.novocode.junit_test

import org.junit.runner.RunWith
import org.junit.Test

@RunWith(classOf[FakeApplicationRunner])
abstract class FixturesTest

class InheritedRunnerTest extends FixturesTest {
  @Test
  def test1 {
    println("In FixturesTest.test1")
  }
}
