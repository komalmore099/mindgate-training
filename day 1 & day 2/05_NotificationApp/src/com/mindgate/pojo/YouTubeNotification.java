package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class YouTubeNotification implements Notification {
	public void sendNotification(String to,String message)
	{
		System.out.println("Sending YouTube notification");
		System.out.println("To : "+to);
		System.out.println("Message :"+message);
	}


}
