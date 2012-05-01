package com.novocode.junit_test

import org.junit.Test
import org.junit.runner.{Runner, RunWith, Description}
import org.junit.runner.notification.RunNotifier

@RunWith(classOf[MyRunner])
class RunWithTest {
  def myTest() {
    println("In RunWithTest.myTest")
  }

  @Test def otherMethod {
    sys.error("In RunWithTest.otherMethod")
  }
}

class MyRunner(clazz: Class[_]) extends Runner {
  def getDescription =
    Description.createSuiteDescription(clazz.getName)
  def run(notifier: RunNotifier) {
    println("Running with MyRunner")
    val spec = Description.createTestDescription(clazz, "myTest")
    notifier.fireTestStarted(spec)
    clazz.newInstance().asInstanceOf[{ def myTest(): Unit }].myTest()
    notifier.fireTestFinished(spec)
  }
}
