package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {

	static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
		driver = new ChromeDriver();

		String BaseURL = "http://www.letskodeit.com/";

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(BaseURL);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

	}

	@When("^User Enters UserName and Password$")
	public void user_Enters_UserName_and_Password() {
		WebElement loginSignup = driver.findElement(By.xpath("//button[@id='comp-iiqg1vggactionTitle']"));
		loginSignup.click();

		WebElement LoginLink = driver.findElement(By.xpath("//a[@id='signUpDialogswitchDialogLink']"));
		LoginLink.click();

		WebElement Email = driver.findElement(By.xpath("//input[@id='memberLoginDialogemailInputinput']"));
		Email.sendKeys("test@email.com");

		WebElement Pwd = driver.findElement(By.xpath("//input[@id='memberLoginDialogpasswordInputinput']"));
		Pwd.sendKeys("abcabc");
	}

	@When("^Clicks Go Button$")
	public void clicks_Go_Button() throws Exception {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='memberLoginDialogokButton']"));
		LoginBtn.click();

		Thread.sleep(3000);
	}

	@Then("^He can visit the Practice Page$")
	public void he_can_visit_the_Practice_Page() {
		WebElement PracticeLink = driver.findElement(By.xpath("//p[@id='DrpDwnMn04label']"));
		PracticeLink.click();

	}

	@Then("^A Message is displayed$")
	public void a_Message_is_displayed() throws Throwable {
		System.out.println("Login Successful");
	}

}
