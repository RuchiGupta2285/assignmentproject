package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.XPATH, using="//textarea[@id='APjFqb']")
	public static WebElement searchbar_xpath;
	
	

}
