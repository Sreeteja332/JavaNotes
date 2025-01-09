class A{
    void displayA(){
        System.out.println("A Class");
    }
}
class B extends A{
    void displayB(){
        System.out.println("B Class");
    }
}
class C extends B {
    void displayC(){
        System.out.println("C Class");
    }
    public static void main(String[] args) {
        A obj1=new A();
        obj1.displayA();
        //obj1.displayB(); wont work
        B obj2=new B();
        obj2.displayA();
        obj2.displayB();
        //obj2.displayC(); wont work
        C obj3=new C();
        obj3.displayA();
        obj3.displayB();
        obj3.displayC();
    }
}
