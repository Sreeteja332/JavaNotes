import java.util.*;


public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if (n%2==0)
            System.out.println("notprime");
        else{
            System.out.println("prime");
        }
    }
}