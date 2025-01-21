import java.util.Scanner;

class Add{
    public int add(int n1,int n2)
    {
        int res=n1+n2;
        return res;
    }
}

class Addtion{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2=sc.nextInt();

        Add sum= new Add();//object creation : class name(assume add as a type like int,double), ref variable like num1,So every time you create a object u consume a sapce so we create space using new ,next u have to specify to JVM in which design So name your design i.e, Calculator()
        int ans=sum.add(num1,num2);//calling add function by using ref variable sum and storing it in ans.
        System.out.println("The total sum is: "+ans);

    }
}