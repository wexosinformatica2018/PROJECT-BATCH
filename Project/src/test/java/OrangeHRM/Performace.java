package OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Performace extends LoginTest {
	  @Test(priority=3)
  
  public void fss() {
		  
		  driver.findElement(By.xpath(".//*[@id='menu__Performance']/b")).click();
		  driver.findElement(By.xpath(".//*[@id='menu_performance_Configure']")).click();
		  driver.findElement(By.xpath(".//*[@id='menu_performance_searchKpi']")).click();
	  
	  
  }
}
