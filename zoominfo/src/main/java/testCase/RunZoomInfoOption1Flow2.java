package testCase;
import org.testng.annotations.Test;

import Pages.Chatbot;
import base.baseClass;

public class RunZoomInfoOption1Flow2 extends baseClass{
	@Test
	public void runtestcases() throws InterruptedException{
	try {
	
	Chatbot cb=new Chatbot();

	cb.chatbot1flow2().yesPlease().nahImGood().ratingUser();
	  }
	catch(Exception e)
	
	{    Chatbot cb=new Chatbot();
		cb.chatbot1flow2().yesPlease().nahImGood().ratingUser();
	}
	
}
}


