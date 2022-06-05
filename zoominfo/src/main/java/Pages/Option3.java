package Pages;

import org.openqa.selenium.By;

import base.baseClass;

public class Option3  extends baseClass{

	//no id like support
	public Option3 noSupport()
	{
		 driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][3]")).click();
	return this;
	}
	
	// rating in no id like support
	public Option3 rating3()
	{
		 driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][2]")).click();
	  return new Option3();
	}
}
