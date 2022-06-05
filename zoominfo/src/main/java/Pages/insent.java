package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class insent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		   
		    //to handle notifications in websites
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		        
			ChromeDriver driver = new ChromeDriver(options);
			//Entering url
			driver.get("https://insent-recruitment.web.app/05312022");
			//maximize the window
			driver.manage().window().maximize();
			
			//wiats
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement frame = driver.findElement(By.id("insent-iframe"));
			driver.switchTo().frame(frame);
			driver.findElement(By.id("insent-launcher-icon-container")).click();		
			
			
		
			
	//yes please
			driver.findElement(By.xpath("//div[text()='Yes please!']")).click();
			
		  //if yes two options
			driver.findElement(By.xpath("//div[text()='Yeah! Connect me with someone now']")).click();

			try {
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhav@sid.com"); 
				} catch(NoSuchElementException e)
				{
					System.out.println("No email request found");
				}
			driver.findElement(By.tagName("button")).click();
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// driver.findElement(By.xpath("//div[@id='insent-input-message-input-box-body']")).sendKeys("bhavya@tcs.com",Keys.ENTER);
			
	                                   //1.yeah if we click then it shows
	       driver.findElement(By.xpath("//div[text()=\"Yes, that'll help\"]")).click();
	                                           
	                                     //2.then rating page it will enter
//	                                           driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
//	                                           driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();
	                      //nah im good
	       try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	        driver.findElement(By.xpath("//img[@id='insent-rating-card-rating-icon']")).click();
	        
	     
	        driver.findElement(By.id("//div[text()=\"Nah, I'm good\"]")).click();
            // if no then rating  page it will enter
	 
	        
	//no i would like this product
			
	       driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][2]")).click();
	                                 //1.yeah if we click then it shows
	                       driver.findElement(By.xpath("//div[text()='Yes, that'll help']")).click();
	                 //2.then rating page it will enter
	                       // driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
	
	         driver.findElement(By.id("//div[text()='Talk to a Someone about [Product]']")).click();
                                
			
			driver.findElement(By.xpath("//div[text()='Show me a video to get me started']")).click();
	//no id like support
			driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][3]")).click();
			// rating in no id like support
			  driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
	//talk to support
			driver.findElement(By.xpath("//div[@id='insent-buttons-message-button'][4]")).click();
	                                    //1.yeah if we click then it shows
	                                           driver.findElement(By.xpath("//div[text()='Yes, that'll help']")).click();
	                                     //2.then rating page it will enter
	                                           driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
			
	}

}
