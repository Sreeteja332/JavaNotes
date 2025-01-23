import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
    int age;
    String name;

    
    public Student(int age, String name) // created constructor 
    { 
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";  //to get the string values
    }

    
}

public class D33 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {   //here we should use Student class becasue we used Student variables
            public int compare(Student i , Student j)
            {
                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<Student>();

        studs.add(new Student(23, "Sree"));
        studs.add(new Student(24, "Sai"));
        studs.add(new Student(24, "Bhanu"));
        studs.add(new Student(22, "Sasank"));
        studs.add(new Student(22, "Sandeep"));

        Collections.sort(studs,com);      
        // here if u use comma u will get comparator what it does it it will help u have ur own logic for sorting
        for (Student s : studs)
            System.out.println(s);
        
    }
}

