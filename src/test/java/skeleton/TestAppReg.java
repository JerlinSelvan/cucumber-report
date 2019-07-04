package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestAppReg {
	WebDriver driver;
	@Given("user opens the signup page of TestMe Application")
	public void user_opens_the_signup_page_of_TestMe_Application() {
	  // System.out.println("Signup page is opened");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String un) {
		WebElement uname=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	   uname.sendKeys(un);
	}

	@When("user enters fname as {string}")
	public void user_enters_fname_as(String fn) {
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		fname.sendKeys(fn);
	}

	@When("user enters lname as {string}")
	public void user_enters_lname_as(String ln) {
		WebElement lname=driver.findElement(By.xpath("//*[@id='lastName']"));
		lname.sendKeys(ln);
	}

	@When("user enters pass as {string}")
	public void user_enters_pass_as(String pwd) {
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys(pwd);
	}

	@When("user enters cpass as {string}")
	public void user_enters_cpass_as(String cpwd) {
		WebElement cpass=driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]"));
		cpass.sendKeys(cpwd);
	}

	@When("user select gender")
	public void user_select_gender() {
		WebElement gen= driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		gen.click();
	}

	@When("user enters e-mail as {string}")
	public void user_enters_e_mail_as(String mail) {
		WebElement email=driver.findElement(By.xpath("//*[@id=\"emailAddress\"]"));
		email.sendKeys(mail);
	}

	@When("user enters num as {string}")
	public void user_enters_num_as(String phn) {
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
		phone.sendKeys(phn);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		WebElement date=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
		date.sendKeys(dob);
		
	}

	@When("user enters add as {string}")
	public void user_enters_add_as(String address) {
		WebElement add=driver.findElement(By.xpath("//*[@id=\"address\"]"));
		add.sendKeys(address);
	}

	//@When("user select security question")
	//public void user_select_security_question() {
	  
	//}

	@When("user answer the question as {string}")
	public void user_answer_the_question_as(String ans) {
		WebElement que=driver.findElement(By.xpath("//*[@id=\"answer\"]"));
		que.sendKeys(ans);
	}

	@Then("click on register button")
	public void click_on_register_button() {
	  WebElement reg= driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]"));
	  reg.click();
	}

	@Then("verify successful registration")
	public void verify_successful_registration() {
	//  WebElement tit=getTitle();
		System.out.println("Registered");
		  driver.close();
	}
	
}
