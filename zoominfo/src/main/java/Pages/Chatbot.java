package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class Chatbot  extends baseClass {

	public Option1 chatbot1() {
	
	WebElement frame = driver.findElement(By.id("insent-iframe"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("insent-launcher-icon-container")).click();
	return new Option1();
	}
	public Option1 chatbot1flow2() {
		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-launcher-icon-container")).click();
		return new Option1();
		}
	
	public Option2 chatbot2() {
		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-launcher-icon-container")).click();
	     
		return new Option2();
	}
	public Option2 chatbot2flow2() {
		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-launcher-icon-container")).click();
	     
		return new Option2();
	}
	public Option3 chatbot3() {
		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-launcher-icon-container")).click();
	     
		return new Option3();
	}
		public Option4 chatbot4() {
		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-launcher-icon-container")).click();
	     
		return new Option4();
	}
}