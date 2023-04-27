package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearch;
import utils.SeleniumDriverUtil;

public class StepDef extends SeleniumDriverUtil {
	//SeleniumDriverUtil sd;
	GoogleSearch gs = new GoogleSearch();
	
	@Given("I open chrome")
	public void i_open_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		setUpDriver();
		//sd.infoLog("Chrome Browser launched");
	}

	@Given("I go to appUrl")
	public void i_go_to_app_url() {
	    // Write code here that turns the phrase above into concrete actions
		launchApplication();
		//sd.infoLog("URL is opened");
	    
	}

	@When("^I type (.*) in searchbar  field$")
	public void i_type_apple_in_searchbar_field(String data) throws Exception {
		gs.submit(data);
		//sd.infoLog("Found the searched item");
	}

		@Then("^I verify the (.*) as first item in the results$")
		public void i_verify_the_apple_as_first_item_in_the_results(String searchText) {
			//sd.infoLog("Verify the text of first item from searched list");
			WebDriver driver = getDriver();
			WebElement searchterm = driver.findElement(By.partialLinkText(searchText));
			if (searchterm.getText().contains(searchText)){
				System.out.println("1st Searched Item was found");
			}
			else{
				System.out.println("Nothing was found in the results");
			}
		
	    
	}

}
