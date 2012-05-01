package com.novocode.junit_test

import org.junit.Test
import org.junit.runner.{Runner, RunWith, Description}
import org.junit.runner.notification.RunNotifier

@RunWith(classOf[MyRunner])
class RunWithTest2 {
  def myTest() {
    println("In RunWithTest2.myTest")
  }

  def otherMethod {
    sys.error("In RunWithTest2.otherMethod")
  }
}
