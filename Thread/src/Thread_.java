
public class Thread_ {

	public static void main(String[] args) {
		Thread t1= new Thread(new Learn("1"));
		Thread t2= new Thread(new Learn("2"));
		Thread t3= new Thread(new Learn("3"));
		t1.start();
		t2.start();
		t3.start();

	}

}
