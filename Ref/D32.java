import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D32 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i , Integer j)// here u should use the class names not int use Integer.
            {
                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            }
        };

        nums.add(112);
        nums.add(23);
        nums.add(7);
        nums.add(44);
        nums.add(69);

        Collections.sort(nums,com); // here if u use comma u will get comparator what it does it it will help u have ur own logic for sorting

        System.out.println(nums);
        
    }
}

