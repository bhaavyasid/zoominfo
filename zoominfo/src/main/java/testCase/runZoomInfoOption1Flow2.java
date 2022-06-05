package testCase;
import org.testng.annotations.Test;

import Pages.Chatbot;
import base.baseClass;

public class runZoomInfoOption1Flow2 extends baseClass{
	@Test
	public void runtestcases() throws InterruptedException

	{
	Chatbot cb=new Chatbot();

	cb.chatbot1flow2().yesPlease().nahImGood().ratingUser();

	}
}
