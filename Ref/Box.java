
import java.util.Scanner;

public class Box {
    int width,height,depth;

    public void boxDim(int wi,int he, int de)
    {
        width=wi;
        height=he;
        depth= de;
    }

    public void boxVol()
    {
        int vol=height*width*depth;
        System.out.println("Volume of the box is: "+vol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the box");
        int w = sc.nextInt();
        System.out.println("Enter the height of the box");
        int h=sc.nextInt();
        System.out.println("Enter the depth of the box");
        int d=sc.nextInt();
        
        Box obj=new Box();
        obj.boxDim(w,h,d);  
        obj.boxVol();

    }
    
}
