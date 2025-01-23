class Z
{
	
}

class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class D23 {
    public static void main(String[] args) throws NumberFormatException {   
    	
//    	A obj1=new A();
//    	B obj2=new B();
        Runnable obj1=new A(); // instead of A we can use reference of the Interface and object of a class
    	Runnable obj2=new B();

    	
    	Thread t1=new Thread(obj1); // if u got to thread constructor one of it will take Runnable object. 
    	Thread t2=new Thread(obj2);

        t1.start();// start method wont work because it not the of Runnable So u have to make the upar changes now it will know which start to call
    	t2.start();
    }
    
}