package com.mindgate.Factory;

import com.mindgate.pojo.EMailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.pojo.WhatsAppNotification;
import com.mindgate.pojo.YouTubeNotification;
import com.mindgate.service.Notification;

public class NotificationFactory {
	public static Notification getNotification(int choice) {
		Notification notification=null;
		switch(choice)
		{
		case 1:
			notification=new SMSNotification();
			break;
		case 2:
			notification=new EMailNotification();
			break;
		case 3:
			notification=new WhatsAppNotification();
			break;
		case 4:
			notification=new YouTubeNotification();
			break;
		}
		return notification;
	}
}
