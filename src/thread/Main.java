package thread;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass obj=new ThreadClass();
		Thread t=new Thread(obj);
		t.start();

	}

}
