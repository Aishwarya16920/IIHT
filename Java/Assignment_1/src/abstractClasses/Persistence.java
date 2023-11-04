package abstractClasses;

public abstract class Persistence {
	
	public abstract void persist();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p;
		p = new FilePersistence();
		p.persist();
		p= new DatabasePersistence();
		p.persist();
	}

}
