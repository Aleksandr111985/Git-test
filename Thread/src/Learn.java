import java.util.Random;

public class Learn implements Runnable{
	int time;
	String name;
	Random r= new Random();
	public Learn(String name) {
		this.name=name;
		time= r.nextInt(999);
	}
		
	public void run() {
	System.out.printf("Thread %s is sleaping %d|\n", name,time);
	try {
		Thread.sleep(time);
	} catch (Exception e) {	}
	System.out.printf("Thread %s is compleated and woke up\n", name);
	
		
	}
	
	

}
