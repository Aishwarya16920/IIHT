package abstractClasses;

public class DatabasePersistence extends Persistence{

	@Override
	public void persist() {
		System.out.println("Date persisted into database");
	}

}
