package testCase;

import org.testng.annotations.Test;

import Pages.Chatbot;

import base.baseClass;


public class RunZoomInfoOption2  extends baseClass{
	
	
	
	@Test
public void runtestcases() throws InterruptedException

{
Chatbot cb=new Chatbot();

cb.chatbot2().noProduct().talkProduct().mailId().button().yeah().Rating2();//.yeah().Rating2().talkProduct().showVideo().Rating22()

}
}