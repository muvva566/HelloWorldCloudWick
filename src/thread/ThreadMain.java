package thread;

public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExtended obj=new ThreadExtended();
		Thread t_extended=new Thread(obj);
		t_extended.start();

	}

}
