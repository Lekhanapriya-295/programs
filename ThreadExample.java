class myThread extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++){
            System.out.println("Thread using Thread class:"+i);
	}
	}
}
class myRunnable implements Runnable
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	    System.out.println("Thread using myrunnable interface:"+i);
	}
	}
}
public class ThreadExample{
public static void main(String args[])
{
	myThread t1=new myThread();
	t1.start();
	myRunnable r=new myRunnable();
	Thread t2=new Thread(r);
	t2.start();
}
}