package CucumberTest.CucumberFramework;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
 features="C:/Users/ankur.dixit/Desktop/Workspace/CucumberFramework/src/test/java/CucumberTest/CucumberFramework/testing.feature",
 glue= "CucumberTest.CucumberFramework",
 plugin ="com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
// plugin={"pretty","com.cucumber.listener.ExtentCucumberFormatter:Extent Reports/report.html"},
 monochrome = true
 )

public class RunnerClass 
{

	@AfterClass
	 public static void writeExtentReport()
	{
	 Reporter.loadXMLConfig(new File("src/test/resources/Extent-config.xml"));
	}
		
}
