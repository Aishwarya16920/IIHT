package abstractClasses;

public class FilePersistence extends Persistence{

	@Override
	public void persist() {
		System.out.println("Data persisted into file");
	}

}
