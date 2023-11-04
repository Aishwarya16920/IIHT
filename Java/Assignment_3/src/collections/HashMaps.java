package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMaps {
	
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String, String> map = new HashMap<>();
        map.put("16-09-2000", "Aishu");
        map.put("16-09-2005", "Zara");
        map.put("01-05-2000", "Sathish");
        map.put("23-03-2005", "Akshay");
        System.out.println("Enter the date(dd-mm-yyyy)");
        String target = sc.next();
        String[] targetDate = target.split("-");
        int totalFound = 0;
        for(Map.Entry<String, String> m : map.entrySet()) {
            String[] date = m.getKey().split("-");
            if(date[0].equals(targetDate[0])){
                if(date[1].equals(targetDate[1])){
                    totalFound +=1;
                }
            }
        }
        System.out.println();
        if(totalFound >=2)
        {
            System.out.println("Failed!");
        }
        else {
            System.out.println(map.get(target));
        }
    }

}
