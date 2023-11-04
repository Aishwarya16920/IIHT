package com.spring_core4;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		ChatApplication chatapp = (ChatApplication) context.getBean("chatapp");
		String cname;
		for(Entry<String, ChatRoom> chatroom : chatapp.getChatrooms().entrySet())
		{
		cname = chatroom.getKey();
		System.out.println("chat room name : " + cname);
		System.out.println("messages in chat room " + cname + " are :");
		chatroom.getValue().getMessages().stream().forEach(mes ->
		System.out.println("=> " + mes));
		System.out.println("users in chat room " + cname + " are :");
		chatroom.getValue().getUsers().stream().forEach(user ->
		System.out.println("=> " + user));

		}

	}
}
