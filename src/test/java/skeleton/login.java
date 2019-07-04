package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;

@Given("user open login page")
public void user_open_login_page() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
}

@When("user enters loginusername as {string}")
public void user_enters_loginusername_as(String un) {
	WebElement user=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	user.sendKeys(un);
}

@When("user enters password as {string}")
public void user_enters_password_as(String pwd) {
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	pass.sendKeys(pwd);
}

@Then("Click login button")
public void click_login_button() {
	WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	login.click();
}

@Then("verify successful login")
public void verify_successful_login() {
  String title=driver.getTitle();
  System.out.println(title);
 
  Assert.assertEquals(title,"Home");
  driver.close();

}


}
