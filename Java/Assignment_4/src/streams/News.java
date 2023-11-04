package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class News {
	
	private int newsId; 
	private String postedByUser; 
	private String commentByUser; 
	private String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	 
	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		News n1 =new News(1, "Steven", "Lee", "Budget is quite good.");
		News n2 =new News(2, "Lisa", "Henseley", "Good budget description.");
		News n3 =new News(1, "George", "Stevens", "Informative..");
		News n4 =new News(2, "Nancy", "Peterson", "Absolutely true!");
		News n5 =new News(2, "James", "Bond", "Very useful.");
		News n6 =new News(3, "Zara", "Zyanna", "Good");
		
		List<News> newsList = new ArrayList<News>();
		newsList.add(n1);
		newsList.add(n2);
		newsList.add(n3);
		newsList.add(n4);
		newsList.add(n5);
		newsList.add(n6);
		
		List<Integer> list= newsList.stream().map(i->i.getNewsId()).collect(Collectors.toList());
		TreeMap<Integer,Integer> map = new TreeMap<>();

	    for(int i=0;i<list.size();i++){
           map.put(list.get(i),Collections.frequency(list,list.get(i)));
	     }
	    int j = map.values().stream().max(Integer::compareTo).get();

	    Set<Integer>s = map.keySet();
	    System.out.println("Newsid which has recieved maximum comments : ");
	    for(Integer i : s){
	      if(map.get(i) == j){
	          System.out.println(i);
	          break;
	      }
	    }
	    System.out.println();
	    
	    List<String> arr = newsList.stream().map(i->i.getComment()).collect(Collectors.toList());
	    String str = "";
	    int count = 0;
        for (int i = 0; i <arr.size() ; i++) {
           str =  arr.get(i);
           if(str.indexOf("Budget") != -1){
               count++;
           }
        }
        System.out.println("The word budget has arrived "+ count + " time.");
        System.out.println();
        
        List<String> users =   newsList.stream().map(i->i.getCommentByUser()).collect(Collectors.toList());
        Map<Object, Long> map1=   users.stream().collect( Collectors.groupingBy(i->i,Collectors.counting()));

        System.out.println("Number of Comments given by each user are: ");
        System.out.println(map1);
        System.out.println();
        
        System.out.println("User with maximum comments:");
        String post = newsList.stream().collect(Collectors.groupingBy(News::getPostedByUser,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
		System.out.println(post);
	    

	}

}
