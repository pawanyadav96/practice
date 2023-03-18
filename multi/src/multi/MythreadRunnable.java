package multi;

public class MythreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String []args)
	{
		MythreadRunnable t=new MythreadRunnable();
		Thread tt=new Thread(t);
		tt.start();
		
	}

}
