import java.util.Iterator;
import java.util.Observable;

public class MyView extends Observable implements View {
	
	String userRequest;
	
	public MyView() {}
	
	@Override
	public void display(String fileName) {
		System.out.println(fileName + " has displayed");

	}
	@Override
	public void start(String userRequest) {
		this.userRequest = userRequest;
		System.out.println(userRequest + " has been requested by the user");
		System.out.println("Notify Observer from View");
		
		setChanged();
		notifyObservers();
			
	}

	@Override
	public String getUserRequest() {
		return this.userRequest;	
	}
	




}
