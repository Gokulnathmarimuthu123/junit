package org.adaptin_junit_runnerclass;

import org.adaptin_junit_testclass.Testclass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Testclass.class})
public class RunnerClass {

}
