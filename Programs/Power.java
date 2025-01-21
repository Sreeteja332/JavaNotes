import java.util.Scanner;

public class Power {
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        int a=myObj.nextInt();
        int p=myObj.nextInt();
        int result=1;
        for (int i=1;i<=p;i++)
        {
            result=result*a;
        }
        System.out.println(result);
    }
    
}