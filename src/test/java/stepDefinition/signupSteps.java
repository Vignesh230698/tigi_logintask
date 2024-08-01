package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class signupSteps {
	
	WebDriver driver;
	
	@Given("I am on the sign up page")
	public void i_am_on_the_sign_up_page() {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]")).click();
	    
	}

	@When("I enter valid account details")
	public void i_enter_valid_account_details() {
		
		driver.findElement(By.name("firstname")).sendKeys("Vignesh");
		
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		driver.findElement(By.name("email")).sendKeys("vignesh1234@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		
		driver.findElement(By.name("password_confirmation")).sendKeys("Test@1234");
	   
	}

	@And("I submit the sign up form")
	public void i_submit_the_sign_up_form() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	   
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		
		String Expected = "Thank you for registering with Main Website Store.";
		
		String Actual = driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']")).getText();
		
		Assert.assertEquals(Actual, Expected, "Test Passed");
	    
	}




}
