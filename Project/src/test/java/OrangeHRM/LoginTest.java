package OrangeHRM;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginTest {
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='menu_recruitment_viewCandidates']")).click();
	  
	  driver.findElement(By.xpath("//*[@id='candidateSearch_jobTitle']")).click();
	  
	  WebElement mySelectElement = driver.findElement(By.id("candidateSearch_jobTitle"));
	  Select dropdown= new Select(mySelectElement);
	  dropdown.selectByValue("9");
	  
	  WebElement mySelect = driver.findElement(By.id("candidateSearch_status"));
	  Select dropdown1= new Select(mySelect);
	  dropdown1.selectByValue("SHORTLISTED");
	  
	  driver.findElement(By.name("candidateSearch[candidateName]")).sendKeys("Naresh Thota");
	  
	  
	  
  }
}
