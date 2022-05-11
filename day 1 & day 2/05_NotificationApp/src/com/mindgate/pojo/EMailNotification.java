package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EMailNotification implements Notification{
	public void sendNotification(String to,String message)
	{
		System.out.println("Sending EMail notification");
		System.out.println("To : "+to);
		System.out.println("Message :"+message);
	}

}
