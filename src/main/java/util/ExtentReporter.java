package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	public static ExtentReports getExtentReport() {
		
		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html"; 
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportPath);
		sparkReporter.config().setReportName("TMGPortal Automation Results");	
		sparkReporter.config().setDocumentTitle("TMGPortal Automation Test Results");
	
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("Selenium Version","4.8.3");
		extentReport.setSystemInfo("Operating System","Windows 10 Pro");
		extentReport.setSystemInfo("Executed By","Subahan Basha");
		
		return extentReport;
	
	}

}
