package org.example.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        String testName = "Simple Login";
        ExtentReportManager.createTest(testName);
        Utils.logInfo("This is test name: " + testName);
        Utils.logInfo("This is method name: " + result.getMethod().getMethodName());

//        System.out.println("Test Started: " + result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Utils.logPass("Test Passed");

//        String testName = result.getMethod().getMethodName();
//        ExtentReportManager.createTest(testName);
//        Utils.logPass("Test Passed: " + testName);
//        System.out.println("Test Passed: " + result.getName());
    }


    @Override
    public void onTestFailure(ITestResult result) {
        Utils.logFail("Test Failed: " + result.getName() + "full error code: " + result.getThrowable());
        System.out.println("Test Failed: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
                System.out.println("Test Skipped: " + result.getName());

    }


    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        ExtentReportManager.flushReports();
    }
}




