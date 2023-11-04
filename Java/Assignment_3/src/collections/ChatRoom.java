package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("unused")
public class ChatRoom {
	
	String name;
	static Map<String, String> userDetails = new HashMap<String, String>();
	static ArrayList<String> messages = new ArrayList<String>();
	
	public ChatRoom(String roomName) {
		this.name = roomName;
	}

	public static void addUser(String username, String password) {
		userDetails.put(username, password);
	}

	public static ChatRoom findChatRoom(ArrayList<ChatRoom> rooms, String roomName){
		ChatRoom found= null;
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).name.equals(roomName)) {
				found = rooms.get(i);
				break;
			}
		}
		return found;
	}
	
	public static boolean userLogin(String username, String password) {
		if(password.equals(userDetails.get(username))){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void sendMessage(String message) {
		messages.add(message);
	}

	public static void displayMessage() {
		for(int i = 0; i < messages.size(); i++){
			System.out.println(messages.get(i));
		}
	}

	public static void listUsers() {
		Set<String> userNames = userDetails.keySet();
		Iterator<String> itr = userNames.iterator();
		for(int i = 0; i < userDetails.size(); i++){
			System.out.println(itr.next());
		}
	}

	public static void deleteUser(String username) {
		userDetails.remove(username);
	}

	public static void deleteChatRoom(ArrayList<ChatRoom> rooms, String roomName) {
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).name.equals(roomName)) {
				rooms.remove(i);
				break;
			}
		}
	}

}
