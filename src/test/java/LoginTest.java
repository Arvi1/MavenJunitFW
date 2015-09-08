import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	WebDriver driver;

  @Before
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
  }  
	  @Test
	  public void FacebookTest() {
		  driver.findElement(By.id("email")).sendKeys("Selenium");
		  driver.findElement(By.id("pass")).sendKeys("Selenium");
  
		  driver.findElement(By.id("u_0_x")).click();
		  
		  System.out.println(driver.getTitle());
	  }
	  @After
	  public void afterTest() {
		  driver.quit();
	  }


}
