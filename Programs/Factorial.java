import java.util.Scanner;

class Factorial
{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        int fact=1;
        while(temp!=0)
        {
            fact=fact*temp;
            temp=temp-1;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}