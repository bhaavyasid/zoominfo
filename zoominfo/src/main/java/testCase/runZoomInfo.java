package testCase;

import org.testng.annotations.Test;

import Pages.Chatbot;
import base.baseClass;


public class runZoomInfo  extends baseClass{
	
	
	
	@Test
public void runtestcases() throws InterruptedException

{
Chatbot cb=new Chatbot();

cb.chatbot1().yesPlease().connectMeSomeone().mailId().button().yeahClick().ratingYesPart();

}
}