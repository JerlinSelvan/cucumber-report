package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario3 {
WebDriver driver;
@Given("user opens login page")
public void user_opens_login_page() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
}

@When("user enter loginusername as {string}")
public void user_enter_loginusername_as(String un) {
	WebElement user=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	user.sendKeys(un);
   
}

@And("user enter password as {string}")
public void user_enter_password_as(String pwd) {
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	pass.sendKeys(pwd);
}

@And("Click on login button")
public void click_on_login_button() {
	WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	login.click();
}


@And("user enter the product as {string}")
public void user_enter_the_product_as(String name) {
    WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
    search.sendKeys(name);
   
}

@And("select the product")
public void select_the_product() {
   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Then("verify")
public void verify() {
	WebElement product=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4"));
	String name=product.getText();
   if (name.equals("Headphone"))
   {
	   Assert.assertTrue(true);
   }
   else
   {
	   Assert.assertFalse(false);
   }
   driver.close();
}

}
