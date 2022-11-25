package view;

import java.util.Observable;

import controller.Controller;

public class MyView extends Observable implements View {
	
	String userRequest;
	
	public MyView() {}

	@Override
	public void display(String fileName) {
		System.out.println(fileName + " has displayed"); 
	}

	@Override
	public String getUserRequest() {
		return this.userRequest;
	}

	@Override
	public void start(String userRequest) {
		this.userRequest = userRequest;
		System.out.println(userRequest + " has been requested by the user");
		
		setChanged();

		System.out.println("Notify Observer From View");
		
		notifyObservers();
		
	}

}
