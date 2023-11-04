package com.spring_core4;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ChatRoom {
	
	private Set<String> users;
	private Properties user_message;
	private List<String> messages;
	
	public Set<String> getUsers() {
		return users;
	}
	
	public void setUsers(Set<String> users) {
		this.users = users;
	}
	
	public Properties getUser_message() {
		return user_message;
	}
	
	public void setUser_message(Properties user_message) {
		this.user_message = user_message;
	}
	
	public List<String> getMessages() {
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
