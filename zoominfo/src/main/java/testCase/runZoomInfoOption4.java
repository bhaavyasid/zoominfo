package testCase;
import org.testng.annotations.Test;

import Pages.Chatbot;
import base.baseClass;

public class runZoomInfoOption4 extends baseClass{
	@Test
	public void runtestcases() throws InterruptedException
	{
	Chatbot cb=new Chatbot();
	cb.chatbot4().talkToSupport().mailId().button().yeahClick().Rating4();

	}
}
