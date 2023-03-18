package multi;

public class MythreadThread extends Thread {
	
	public void run()
	{
		for(int i=10;i>=0;i--)
		{
			System.out.println("another thread"+i);
			try {
				Thread.sleep(123);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	public void run1()
//	{
//		for(int i=10;i>=0;i--)
//		{
//			System.out.println("pawan thread"+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

}
