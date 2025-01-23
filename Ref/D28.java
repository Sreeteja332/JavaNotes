
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class D28 {
    public static void main(String[] args) {
        //Collection<Integer> nums = new ArrayList<Integer>(); // here if u want to work with indexing u can use List in place of Collection
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        System.out.println(nums.get(2));

        for (int n:nums){
            System.out.print(n);
        }
    }
}
