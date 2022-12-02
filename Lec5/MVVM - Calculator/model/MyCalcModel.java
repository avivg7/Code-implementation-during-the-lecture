package model;

import java.util.Observable;

public class MyCalcModel extends Observable implements CalcModel {
	
	double result;

	@Override
	public void plus(double x, double y) {
		this.result = x + y;
		setChanged();
		notifyObservers();
	}

	@Override
	public double getResult() {return this.result;}

}
