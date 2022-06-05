package Pages;

import org.openqa.selenium.By;


import base.baseClass;

public class Option1 extends baseClass {
	
	public Option1 yesPlease()
	{

	driver.findElement(By.xpath("//div[text()='Yes please!']")).click();
	return this;
	}
	
	  //if yes two options
	public Option1 connectMeSomeone()
	{
		driver.findElement(By.xpath("//div[text()='Yeah! Connect me with someone now']")).click();
		return this;
	}

		//try {
	public Option1 mailId()
	{
		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhav@sid.com"); 
			return this;
			}
	// catch(NoSuchElementException e)
			//{
				//System.out.println("No email request found");
			//}
	
	
	public Option1 button()
	{
		driver.findElement(By.tagName("button")).click();
	return this;	
	}
	
		//try {
			//Thread.sleep(9000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	public Option1 yeahClick()
	{
		 
                                 //1.yeah if we click then it shows
     driver.findElement(By.xpath("//div[text()=\"Yes, that'll help\"]")).click();
      return this;                                   
	}                         
	//2.then rating page it will enter
	public Option1 ratingUser()
	{                                         driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
                                 driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();
return this;
}
                    //nah im good
   /*  try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	public Option1 nahImGood()
	{
	  driver.findElement(By.xpath("//div[text()=\"Nah, I'm good\"]")).click();
	  return this;
	}

	// if no then rating  page it will enter
     public Option1 ratingYesPart()
     {
      driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][1]")).click();
      return this;
     }
     public Option1 refresh()
     {
    	 driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();
    	 return this;
     }
     public void browserClose()
     {
    	 driver.close();
     }
     
}
