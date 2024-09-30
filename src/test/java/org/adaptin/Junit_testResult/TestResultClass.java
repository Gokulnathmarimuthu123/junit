package org.adaptin.Junit_testResult;

import org.adaptin_junit_runnerclass.RunnerClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestResultClass {
	
	public static void main(String[] args) {
		
		
		Result runClasses = JUnitCore.runClasses(RunnerClass.class);
		
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("Failure count "+failureCount);
		
		
	}

}
