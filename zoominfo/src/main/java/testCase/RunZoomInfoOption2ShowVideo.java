package testCase;
import org.testng.annotations.Test;

import Pages.Chatbot;

import base.baseClass;


public class RunZoomInfoOption2ShowVideo extends baseClass{
	@Test
	public void runtestcases() throws InterruptedException

	{
	Chatbot cb=new Chatbot();
	cb.chatbot2flow2().noProduct().showVideo().Rating2();

	}
	}
