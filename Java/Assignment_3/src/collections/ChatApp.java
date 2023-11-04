package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ArrayList<ChatRoom> rooms = new ArrayList<ChatRoom>();
		System.out.println("Java Chat Application "
				+ "\n Options: "
				+ "\n (A) Create a chatroom "
				+ "\n (B) Add the user "
				+ "\n (C) User login "
				+ "\n (D) Send a message "
				+ "\n (E) Display the messages from a specific chatroom "
				+ "\n (F) List down all users belonging to the specified chat room. "
				+ "\n (G) Logout "
				+ "\n (H) Delete an user "
				+ "\n (I) Delete the chat room. "
				+ "\n Please enter your option:");
		String choice = " ";
		while(!choice.equals("G")) {
			choice = s.next();
			switch(choice) {
			
			case "A": 
				System.out.println("Enter chatroom name:");
				String r1 = s.next();
				ChatRoom newRoom = new ChatRoom(r1);
				rooms.add(newRoom);
				System.out.println("Created Chatroom!");
				break;
				
			case "B":
				System.out.println("Enter username:");
				String username1 = s.next();
				System.out.println("Enter password:");
				String password1 = s.next();
				System.out.println("Enter chatroom name:");
				String chatroom1 = s.next();
				ChatRoom foundRoom1 = ChatRoom.findChatRoom(rooms,chatroom1);
				if(foundRoom1 instanceof ChatRoom) {
					foundRoom1.addUser(username1, password1);
					System.out.println("Added User!");
				}
				else {
					System.out.println("User not added!");
				}
				break;
			case "C": 
				System.out.println("Enter ChatRoom name:");
				String chatroom2 = s.next();
				ChatRoom foundRoom2 = ChatRoom.findChatRoom(rooms,chatroom2);
				System.out.println("Enter user name:");
				String username2 = s.next();
				System.out.println("Enter password:");
				String password2 = s.next();
				if(foundRoom2 instanceof ChatRoom) {
					boolean cond = foundRoom2.userLogin(username2,password2);
					if(cond){
						System.out.println("Logged In!");
					}
					else {
						System.out.println("Invalid Input, Try again!");
					}
				}
				else {
					System.out.println("Chatroom Not Found!");
				}
				break;
			case "D":
				System.out.println("Enter chatroom name:");
				String chatroom3 = s.next();
				System.out.println("Enter message:");
				String message = s.next();
				ChatRoom foundRoom3 = ChatRoom.findChatRoom(rooms,chatroom3);
				if(foundRoom3 instanceof ChatRoom) {
					foundRoom3.sendMessage(message);
					System.out.println("Message Sent!");
				}
				else {
					System.out.println("Chatroom Not Found!");
				}
				break;
			case "E": 
				System.out.println("Enter chatroom name:");
				String chatroom4 = s.next();
				ChatRoom foundRoom4 = ChatRoom.findChatRoom(rooms,chatroom4);
				if(foundRoom4 instanceof ChatRoom) {
					System.out.println(chatroom4 + "Messages: ");
					foundRoom4.displayMessage();
				}
				else{
					System.out.println("Chatroom Not Found!");
				}
				break;
			case "F":
				System.out.println("Enter chatroom name:");
				String chatroom5 = s.next();
				ChatRoom foundRoom5 = ChatRoom.findChatRoom(rooms,chatroom5);
				if(foundRoom5 instanceof ChatRoom){
					System.out.println("List of users:");
					foundRoom5.listUsers();
				}
				else
					System.out.println("User Not Found!");
				break;
			case "G": 
				break;
			case "H":
				System.out.println("Enter username:");
				String username6 = s.next();
				System.out.println("Enter password:");
				@SuppressWarnings("unused") 
				String password6 = s.next();
				System.out.println("Enter chatRoom name:");
				String chatroom6 = s.next();
				ChatRoom found6 = ChatRoom.findChatRoom(rooms,chatroom6);
				if(found6 instanceof ChatRoom) {
					found6.deleteUser(username6);
					System.out.println("Deleted User!");
				}
				else {
					System.out.println("User Not Found!");
				}
				break;
			case "I": 
				System.out.println("Enter chatroom name:");
				String roomName = s.next();
				ChatRoom.deleteChatRoom(rooms, roomName);
				System.out.println("ChatRoom Deleted");
				break;
			default:
				System.out.println("Invalid Input, Try Again!");
				break;
			}
	   }
		s.close();
	}
}
