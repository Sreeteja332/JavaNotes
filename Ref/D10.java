enum Status{
    Running,Failed,Pening,Sucess;
}

public class D10 {
    public static void main(String[] args) {
        int i=5;
        Status s =Status.Running;
        Status ss[]= Status.values(); //to print all the constants it gives output in array to print that values u have to use for loop or else it will show only address as output.
        System.out.println(s);
        for (Status s1 :ss)
        {
            System.out.println(s1+" : "+s1.ordinal());
        }

    }
}
