package nestedClasses;

import java.util.Random;

@SuppressWarnings("unused")
public class Patient {
	
	
	private int id;
	private String name;
	
	public Patient(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	class BloodPressure implements Listener{
		private int bp;
		
		public BloodPressure(int bp){
			this.bp = bp;
		}
		
		public int getBp() {
			return bp;
		}

		public void setBp(int bp) {
			this.bp = bp;
		}
		
		@Override
		public void callBack() {
			System.out.println("Alert: Blood Pressure is above 140!" );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient(5, "Zara");
		Random r = new Random();
		Patient.BloodPressure bloodPressure = p.new BloodPressure(70);
		Listener l = p.new BloodPressure(70);
		int bpLevel = r.nextInt(180);
		System.out.println("Blood Pressure: " + bpLevel);
		bloodPressure.setBp(bpLevel);
		if(bloodPressure.getBp() > 140) {
			l.callBack();
		}
	
	}

}
