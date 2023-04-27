package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import locators.HomePageLocators;
import utils.SeleniumDriverUtil;

public class GoogleSearch {

	public GoogleSearch() {
		PageFactory.initElements(SeleniumDriverUtil.getDriver(), HomePageLocators.class);
	}

	

	public void submit(String testdata) {

		HomePageLocators.searchbar_xpath.sendKeys(testdata, Keys.ENTER);
		
	}
}