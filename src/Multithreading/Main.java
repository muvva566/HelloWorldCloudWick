package Multithreading;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Thread t1=new Thread(new One());
		Thread t2=new Thread(new Two());
		t1.start();
		t2.start();

	}

}
