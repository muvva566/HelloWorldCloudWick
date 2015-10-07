package Multithreading;

public class Two extends Thread {
	public void run()
	{
		System.out.println("Second Thread");
		int i=0;
		while(i<5)

		{
			System.out.println("Second");
			i++;
		}
	}
}
