package bound;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> studentsMap = new HashMap<>();
		
		studentsMap.put("Dorian", 45);
		studentsMap.put("Ophelia", 65);
		
		System.out.println(StudentUtil.computeAverageScore(studentsMap));
	}

}
