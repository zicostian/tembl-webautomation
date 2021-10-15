package stepDefinition;

import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;

import com.photon.UIconstants.HomeBLConstants;
import com.photon.UIconstants.SearchBLConstants;
import com.photon.library.CommonLibrary;

import cucumber.api.java.en.Then;

public class SearchBLStepDefinition extends CommonLibrary {
	
	public SearchBLStepDefinition() throws ConfigurationException, IOException{
		super();
	}
	
	@Then("User should be able to see a list of searched products in PLP")
	public void check_plp_page() throws Throwable{
		CommonLibrary.longTime();
		Assert(CommonLibrary.isElementPresentVerification(SearchBLConstants.PLP_IDENTIFIER),
				"PLP is displayed");
	}
	
	@Then("^User enter keywords on Search text field \"([^\"]*)\"$")
	public void user_input_username(String arg1) throws Throwable {
		Assert(CommonLibrary.clearAndEnterText(SearchBLConstants.SEARCH_KEYWORDS, arg1),"Keywords are entered");
//		driver.hideKeyboard();
		CommonLibrary.shortTime();
	}
	
	@Then("User click one of the product")
	public void click_product_thumbnail_homepage() throws Throwable{
		CommonLibrary.isElementPresentVerifyClick(SearchBLConstants.PRODUCT_THUMBNAIL);
		Thread.sleep(5000);
	}
	
	@Then("Click search icon button")
	public void click_search_icon_homepage() throws Throwable{
		CommonLibrary.isElementPresentVerifyClick(SearchBLConstants.SEARCH_ICON);
		Thread.sleep(5000);
	}
	
	@Then("User should be navigated to PDP page")
	public void check_pdp_page() throws Throwable{
		CommonLibrary.longTime();
		Assert(CommonLibrary.isElementPresentVerification(SearchBLConstants.PDP_IDENTIFIER),
				"PDP is displayed");
	}

}
