package Cucumber.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSeleniumTest {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		String BaseURL = "http://www.letskodeit.com/";

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(BaseURL);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		WebElement loginSignup = driver.findElement(By.xpath("//button[@id='comp-iiqg1vggactionTitle']"));
		loginSignup.click();

		WebElement LoginLink = driver.findElement(By.xpath("//a[@id='signUpDialogswitchDialogLink']"));
		LoginLink.click();

		WebElement Email = driver.findElement(By.xpath("//input[@id='memberLoginDialogemailInputinput']"));
		Email.sendKeys("test@email.com");

		WebElement Pwd = driver.findElement(By.xpath("//input[@id='memberLoginDialogpasswordInputinput']"));
		Pwd.sendKeys("abcabc");

		WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='memberLoginDialogokButton']"));
		LoginBtn.click();

		Thread.sleep(3000);

		WebElement PracticeLink = driver.findElement(By.xpath("//p[@id='DrpDwnMn04label']"));
		PracticeLink.click();

	}

}
