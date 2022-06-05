package Pages;

import org.openqa.selenium.By;

import base.baseClass;

public class Option4 extends baseClass {

	//talk to support
	public Option4 talkToSupport()
	{
	driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][4]")).click();
	return this;
	}
	public Option4 mailId()
	{
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhav@sid.com"); 
		return this;
		} 
	public Option4 button()
	{
		driver.findElement(By.tagName("button")).click();
	return this;	
	}
	//1.yeah if we click then it shows
	public Option4 yeahClick()
	{
		driver.findElement(By.xpath("//div[text()=\"Yes, that'll help\"]")).click();	
		return this;
	}
	public Option4 Rating4()                               
                                 //2.then rating page it will enter
	{
                                       driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][4]")).click();
                                       return this;
}
}