package dwp.DWPTestAutomation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeSuite
	public void reportInitialize() {
		String reportName = "./reports/api_" + System.currentTimeMillis() + ".html";
		htmlReporter = new ExtentHtmlReporter(reportName);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Priyanka");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Priyanka");
		htmlReporter.config().setDocumentTitle("Demo Project");
		// Name of the report
		htmlReporter.config().setReportName("Priyanka ");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	@BeforeClass
	public static void before() {
		htmlReporter = new ExtentHtmlReporter("./reports/api_" + System.currentTimeMillis() + ".html");
		// Create an object of Extent Reports
		extent = new ExtentReports();
		extent.setSystemInfo("Host Name", "DWP");
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("User Name", "KomalNanda");
		htmlReporter.config().setDocumentTitle("DWP Project");
		// Name of the report
		htmlReporter.config().setReportName("DWP Api Automation");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent.attachReporter(htmlReporter);
	}

	@AfterSuite
	public void closeReport() {
		extent.flush();
	}
}
