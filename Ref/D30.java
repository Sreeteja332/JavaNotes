import java.util.Map;
import java.util.HashMap;
public class D30 {
    public static void main (String args[]){
        Map<String,Integer> students= new HashMap<String,Integer>();

        students.put("Teja", 0);
        students.put("Sai", 2);
        students.put("Bhanu", 3);
        students.put("Sasank", 4);

        System.out.println(students.keySet());

        for (String key :students.keySet())
        {
            System.out.println(key+" :  "+students.get(key));
        }

    }
}
