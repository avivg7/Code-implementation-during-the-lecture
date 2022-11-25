package model;

import java.util.Observable;
import controller.Controller;

public class MyModel extends Observable  implements Model {
	
	String data;
	
	public MyModel() {}

	@Override
	public void convert(String fileName) {
		
		this.data =  fileName.toUpperCase();
		System.out.println(fileName + " has coverted");
		
		setChanged();

		System.out.println("Notify Observer From Model");
		
		notifyObservers();
		
	}

	@Override
	public String getData() {
		return this.data;	
	}

}
