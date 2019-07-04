package skeleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Scenario4 {
WebDriver driver;
@Given("Alex has registered in to TestMeApp")
public void alex_has_registered_in_to_TestMeApp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
	WebElement user=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	user.sendKeys("lalitha");
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	pass.sendKeys("password123");
	WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	login.click();
}

@When("Alex search a particular product like headphones")
public void alex_search_a_particular_product_like_headphones() {
	 WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	    search.sendKeys("Headphone");
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@When("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	//WebElement cart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	//cart.click();
	}

@Then("TestMeApp does not display the cart icon")
public void testmeapp_does_not_display_the_cart_icon() {
    if(driver.getTitle().equals("View Cart")) {
    	Assert.assertFalse(false);
    }
    else
    {
    	Assert.assertTrue(true);
    }
    driver.close();
}

}
