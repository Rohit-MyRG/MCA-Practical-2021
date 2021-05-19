class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try{
				sleep(500);
			}catch(Exception e){ System.out.println(e); }
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{  
		ThreadDemo td = new ThreadDemo(); 
		td.start();  
 }  
}