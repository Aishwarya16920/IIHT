package com.spring_core4;

import java.util.Map;

public class ChatApplication {
	
	private Map<String, ChatRoom> chatrooms;
	
	public Map<String, ChatRoom> getChatrooms() {
		return chatrooms;
	}
	
	public void setChatrooms(Map<String, ChatRoom> chatrooms) {
		this.chatrooms = chatrooms;
	}
}
