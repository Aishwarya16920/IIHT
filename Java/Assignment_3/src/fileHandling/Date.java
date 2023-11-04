package fileHandling;

public class Date {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 4596395896503931430L;
	private int day;
	private int month;
	private int year;
	
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
