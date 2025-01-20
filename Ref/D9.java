interface Computer{
    void code();    
}
class Laptop implements Computer{
    public void code()
    {
        System.out.println("Coding in Laptop");
    }
}

class Desktop implements  Computer{
    public void code()
    {
        System.out.println("Coding in Desktop");
    }
}

class Developer {
    public void devApp(Computer work){
        work.code(); //depending on the reference name we called it will call that particular class (Laptop or Desktop)
    }
}
public class D9  {
    public static void main(String[] args) {
        Computer lap = new Laptop(); //creating  object of Laptop class using Computer interface as reference 
        Computer desk= new Desktop(); //creating  object of Desktop class using Computer interface as reference

        Developer sree = new Developer();
        sree.devApp(lap);
        sree.devApp(desk);
    }




    
}
