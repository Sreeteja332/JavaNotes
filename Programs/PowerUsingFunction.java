import java.util.Scanner;

class PowerUsingFunction{

    static int powerFuntion(int n, int p)
        {
            int res=1;
            for (int i=0;i<p;i++)
            {
                res=res*n;
            }
            return res;
        }
    public static void main(String args[])
    {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the power: ");
        int power=sc.nextInt();
        int result=powerFuntion(num,power); //calling static method/function using the name of the method/function
        System.out.println(result);
    }
}