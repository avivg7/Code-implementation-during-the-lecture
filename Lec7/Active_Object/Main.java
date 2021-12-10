
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyActiveModel am = new MyActiveModel();
		
		am.generateString();
		
		am.solve();
		
		am.stopRunning();

	}

}
