
@FunctionalInterface
interface A{
    void run();
}


public class D25 {
    public static void main (String args[])
    {
        A obj = () ->
            {
                System.out.println("Working");
            };
        obj.run();
    }
}
