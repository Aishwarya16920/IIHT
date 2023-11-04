package fileHandling;

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Date dob;
	private int id;

	Account(int id,Date dob){
		this.id = id;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Account [dob=" + dob + ", accid=" + id + "]";
	}

}
