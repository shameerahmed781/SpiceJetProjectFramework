package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports getExtentReport() {
		
		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("SpiceJet Automation Report");
		reporter.config().setDocumentTitle("SpiceJet Automation Testing");
		
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		return extentReport;
		
	}

} 
