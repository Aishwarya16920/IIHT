package collections;

public class Parked_CarOwner_Details {
	
	private String ownerName;
	private String carModel;
	private int carNo;
	private String ownerMobileNo;
	private String ownerAddress;
	
	public Parked_CarOwner_Details(String ownerName, String carModel, int carNo, String ownerMobileNo, String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	  public String toString() {
	        return "Parked_CarOwner_Detail[" +
	                "ownerName='" + ownerName + '\'' +
	                ", carModel='" + carModel + '\'' +
	                ", carNo=" + carNo +
	                ']';
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parked_CarOwner_Details pc1 = new Parked_CarOwner_Details("Karishma", "Audi", 1609, "9343278478", "New Delhi");
		Parked_CarOwner_Details pc2 = new Parked_CarOwner_Details("Abhishek", "BMW", 2303, "9372238467", "Chennai");
		Parked_CarOwner_Details pc3 = new Parked_CarOwner_Details("Ram", "Ferrari", 0105, "9348748939", "Pune");
		Parked_CarOwner_Details pc4 = new Parked_CarOwner_Details("Shyam", "Hundai", 2201, "9362748939", "Bangalore");
		
		Parked_CarOwnerList pcList = new Parked_CarOwnerList();
		pcList.add_new_car(pc1);
		pcList.add_new_car(pc2);
		pcList.add_new_car(pc3);
		pcList.add_new_car(pc4);
		pcList.getParkedCarDetails();
		pcList.get_parked_car_location(2);
		pcList.remove_car(3);
		pcList.getParkedCarDetails();
		
	}

}
