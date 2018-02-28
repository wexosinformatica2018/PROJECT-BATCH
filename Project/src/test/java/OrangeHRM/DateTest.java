package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DateTest extends LoginTest {
  @Test(priority=2)
  public void fs() {
  
 driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
 driver.findElement(By.xpath(".//*[@id='frmSrchCandidates']/fieldset/ol/li[7]/img")).click();
 while(true) {
	 try{
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
        driver.findElement(By.xpath("//a[text()='20']")).click();
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
        driver.findElement(By.xpath("//a[text()='22']")).click();
        
		
		
	 }
 catch(Exception e)
	 {
	 
	 }
 }
  
  
  }
  
  
}
