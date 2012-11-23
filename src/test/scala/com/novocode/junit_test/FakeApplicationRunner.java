package com.novocode.junit_test;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

public class FakeApplicationRunner extends BlockJUnit4ClassRunner {

  public FakeApplicationRunner(Class<?> clazz) throws InitializationError {
    super(clazz);
  }

  public void run(final RunNotifier notifier) {
    System.out.println("Entering FakeApplicationRunner.run");
    super.run(notifier);
    System.out.println("Leaving FakeApplicationRunner.run");
  }
}
