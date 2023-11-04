package enums;

public enum Status {
	
	NEW(2), REJECTED(-1), ACCEPTED(1), COMPLETED(0);
	
	@SuppressWarnings("unused")
	private int status;
	
	Status(int status) {
		this.status = status;
	}
	
}
