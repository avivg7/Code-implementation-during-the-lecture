import java.io.IOException;
import java.util.Timer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Ping ping = new Ping();
		Pong pong = new Pong();
		
		Timer t = new Timer();
		
		t.scheduleAtFixedRate(ping, 0, 1000);
		t.scheduleAtFixedRate(pong, 500, 1000);
		
		int i;
		if((i = System.in.read()) == 13) {
			System.out.println("The user pushed on " + i + " (Enter)");
			ping.cancel();
			pong.cancel();
			t.cancel();			
		}	
	}
}
