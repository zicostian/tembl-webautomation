package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.photon.UIconstants.HomeBLConstants;
import com.photon.library.CommonLibrary;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeBLStepDefinition extends CommonLibrary {
	
	public HomeBLStepDefinition() throws ConfigurationException, IOException{
		super();
	}
	
	@After
	public void close_web_browser(Scenario scenario) throws Throwable{
		CommonLibrary.closeApplication();
	}
	
	@Given("^User Launches the Website$")
	public void user_Launches_the_Application() throws Throwable{
		CommonLibrary.App_Launch();
		CommonLibrary.driver.manage().window().maximize();

	}
	

	@Then("^User should be able to check Home page$")
	public void user_should_able_to_land_on_homescreen() throws Throwable{
		CommonLibrary.longTime();
		Assert(CommonLibrary.isElementPresentVerification(HomeBLConstants.HOME_PAGE),
				"The Home page is Displayed");
		Thread.sleep(100);
	}
	
	@Then("^Close Website$")
	public void Close_Website() throws Throwable {
	Thread.sleep(1000);
	driver.quit();
	}

}
