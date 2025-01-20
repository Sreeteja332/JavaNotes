class MyException extends Exception // to get the charcteristics of the Expetions class 
{
    public MyException(String s)// created a constructor because we are sending a message
    {
        super(s);
    }
}

public class D20 {
    public static void main(String[] args) {
        int a =18;
        int b=0;
        
        try{
            b=18/a;
            if(b==1){
                throw new MyException("New Exception");
            }
        }
        catch(MyException e){
            System.out.println("Custom Exceptions went wrong" +e);
        }

        System.out.println(b);
        System.out.println("Bye");
    }
}
