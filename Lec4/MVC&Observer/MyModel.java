import java.util.Observable;

public class MyModel extends Observable implements Model {
	String fileName;
	
	public MyModel() {}

	@Override
	public void convert(String fileName) {
		this.fileName = fileName.toUpperCase();
		System.out.println("Notify Observer from Model");
		
		setChanged();
		notifyObservers();

	}

	@Override
	public String getData() {
		return this.fileName;	
	}

}
