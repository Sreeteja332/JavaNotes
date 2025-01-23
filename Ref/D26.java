class Test{
    int count;
    public void incr(){
        count++;
    }
}
public class D26{
    public static void main (String args[]) throws InterruptedException
    {  
        Test t = new Test();

        Runnable obj1=() ->{
            for (int i=1;i<1000;i++)
            {
                t.incr();
            }
        };
        Runnable obj2 =() ->{
            for(int i=1;i<1000;i++)
            {
                t.incr();
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t.count);
    }
}
