class PriorityThread extends Thread
{
	public void run()
	{
		System.out.println("Thread name:"+Thread.CurrentThread().getName());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
	}
	public class PriorityThreadExample{
	public static void main(String args[])
{
	Prioritythread t1=new Prioritythread();
	Prioritythread t2=new Prioritythread();
	Prioritythread t3=new Prioritythread();
	
	Thread.setName("low priority thread");
	Thread.setName("normal priority thread");
	Thread.setName("high priority thread");

	Thread.setPriority(Thread.MIN_PRIORITY);
	Thread.setPriority(Thread.NORM_PRIORITY);
	Thread.setPriority(Thread.MAX_PRIORITY);

	t1.start();
	t2.start();
	t3.start();
}	
}
}

