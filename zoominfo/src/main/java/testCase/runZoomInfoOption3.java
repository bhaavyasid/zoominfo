package testCase;
import org.testng.annotations.Test;

import Pages.Chatbot;
import base.baseClass;


public class runZoomInfoOption3 extends baseClass{
	@Test
	public void runtestcases() throws InterruptedException
	{
	Chatbot cb=new Chatbot();

	cb.chatbot3().noSupport().rating3();

	}
}
