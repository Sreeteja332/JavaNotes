public class Employee {
    String name;//  name and id are instance variables
    int id;

    public Employee(String name, int id) {
        this.name=name;
        this.id=id;
    }
    
    public static void main(String[] args) {
        Employee obj = new Employee("Yash",101);// Employee() is a constructor

    }
}
