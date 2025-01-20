interface A{
    public void show();
}

// class B implements A{
//     // public void show(){
//     //     System.out.println("Working fine");
//     // }
// }

public class D14 {
    public static void main(String args[]){
        A a= new A(){
            public void show(){
                System.out.println("Should also work");
            }
        };
        a.show();
    }
}
