import java.util.Observable;
import java.util.Observer;

import controller.*;
import view.*;
import model.*;

public class Main {

	public static void main(String[] args) {
		Model m = new MyModel();
		View v = new MyView();
		
		Controller c = new MyController(v, m);
		
		((Observable)v).addObserver((Observer)c);
		((Observable)m).addObserver((Observer)c);
		
		v.start("upper-case-request");

	}

}
