package Pages;

import org.openqa.selenium.By;

import base.baseClass;

public class Option2 extends baseClass {

	public Option2 noProduct()
      
//no i would like this product
	{
     driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][2]")).click();
     return this;
	}
	public Option2 yeah()
	{//1.yeah if we click then it shows
                     driver.findElement(By.xpath("//div[text()=\"Yes, that'll help\"]")).click();
                     return this;
	}
	
	public Option2 Rating2()
	{
               //2.then rating page it will enter
                      driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][1]")).click();
                      return this;
                    		  }
	public Option2 talkProduct()
	{
	
       //driver.findElement(By.id("//div[text()='Talk to a Someone about [Product]']")).click();
		driver.findElement(By.xpath("//div[text()='Talk to a Someone about [Product]']")).click();
       return this;
       }
		public Option2 mailId()
		{
		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhav@sid.com"); 
			return this;
			}
		public Option2 showVideo()
		{
		
		driver.findElement(By.xpath("//div[text()='Show me a video to get me started']")).click();
		return this;
		}
		public Option2 Rating22()
		{
	               //2.then rating page it will enter
	                      driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][1]")).click();
	                      return new Option2();
	                    		  }
		public Option2 button()
		{
			driver.findElement(By.tagName("button")).click();
		return this;	
		}
		public void browserClose()
	     {
	    	 driver.close();
	     }
		
		
}
