class ThreadRunnable implements Runnable
{
	public void run()
	{
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
	public static void main(String args[])
	{
		ThreadRunnable tr1 = new ThreadRunnable();
		ThreadRunnable tr2 = new ThreadRunnable();
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		
		t1.start();
		t2.start();
	}
}