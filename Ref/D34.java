import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student implements Comparable<Student> //here comparable has unimplimented method compareto 
{
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


    @Override
    public int compareTo(Student that) {
        {
            if(this.age>that.age) //this is current object ie we are current student with the other student So here we are using directly the class to compare themself where as before wwe used to need third person.
                return 1;
            else
                return -1;
        }
    }

    
}

public class D34 {
    public static void main(String[] args) {

        // Comparator<Student> com = new Comparator<Student>() {   //here we should use Student class becasue we used Student variables
        //     public int compare(Student i , Student j)
        //     // {
        //     //     if(i.age>j.age)
        //     //         return 1;
        //     //     else
        //     //         return -1;
        //     // }
        // };

        List<Student> studs = new ArrayList<Student>();

        studs.add(new Student(23, "Sree"));
        studs.add(new Student(24, "Sai"));
        studs.add(new Student(24, "Bhanu"));
        studs.add(new Student(22, "Sasank"));
        studs.add(new Student(22, "Sandeep"));

        Collections.sort(studs);    // if u dont want to pass comp here its becasue we are not specifiing the logic for the student becasue by default Integer class by default implements comparable class So by default sort works with integers 
        // So if u want to implement natural sorting u can implement Comparable interface to the Student class
        // here if u use comma u will get comparator what it does it it will help u have ur own logic for sorting
        for (Student s : studs)
            System.out.println(s);
        
    }
}

