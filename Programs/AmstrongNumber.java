import java.util.Scanner;

class AmstrongNumber
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int n=num%10;
            sum=sum+(n*n*n);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("AmstrongNumber");
        }
        else{
            System.out.println("Not AmstrongNumber");
        }
    }
}   