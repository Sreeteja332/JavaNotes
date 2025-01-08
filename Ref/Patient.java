import java.util.Scanner;

public class Patient {

    public void bmi(String na,double we, double he){
        double bmi=we/(he*he);
        System.out.println("BMI of "+na +" is "+bmi);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Name of the Patient: ");
        String n=sc.next();
        System.out.print("Enter the Height(in meters) of the Patient: ");
        double h=sc.nextDouble();
        System.out.print("Enter the Weight(in kgs) of the Patient: ");
        double w=sc.nextDouble();
        Patient obj=new Patient();
        obj.bmi(n,h,w);

    }
}
