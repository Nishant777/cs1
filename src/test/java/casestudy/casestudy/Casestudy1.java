package casestudy.casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Casestudy1 {
	WebDriver driver;
	@Given("He opens url of the application")
	public void he_opens_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Then("He click on SignUp link")
	public void he_click_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	}

	@Given("he enters user name {string}")
	public void he_enters_user_name(String z) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(z);
	}

	@Then("he enters first name {string}")
	public void he_enters_first_name(String m) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(m);
	}

	@Then("he enters last name {string}")
	public void he_enters_last_name(String w) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(w);
	}

	@Then("He provide password {string}")
	public void he_provide_password(String y) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(y);
	}

	@Then("He confirm password {string}")
	public void he_confirm_password(String l) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(l);
	}

	@Then("he selects gender")
	public void he_selects_gender() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@Then("he provides email address {string}")
	public void he_provides_email_address(String n) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(n);
	}

	@Then("he enters Mobile number {string}")
	public void he_enters_Mobile_number(String j) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(j);
	}

	@Then("he enters date of birth {string}")
	public void he_enters_date_of_birth(String q) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(q);
	}
	@Then("He enters address {string}")
	public void he_enters_address(String a) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(a);
	}

	@Then("he provides the answer {string}")
	public void he_provides_the_answer(String f) {
	    // Write code here that turns the phrase above into concrete actions
	   /// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys(f);
	}

	@Then("I click on submit to register")
	public void i_click_on_submit_to_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.close();
	}

}
