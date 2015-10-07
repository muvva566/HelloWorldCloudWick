package Multithreading;

public class One extends Thread {
	public void run()
	{
		System.out.println("First Thread");
		int i=0;
		while(i<25)

		{
			System.out.println("First");
			i++;
		}
	}

}
