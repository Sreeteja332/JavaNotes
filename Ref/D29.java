import java.util.*;

public class D29 {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();// u can use Collection in place of Set
        Set<Integer> nums2 = new TreeSet<Integer>(); //This gives u the sorted values.

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        Iterator<Integer> values = nums.iterator(); // here no need of doing iteration u can use interator method directly from the Interator interface which is implemented by the Collection interface.

        while(values.hasNext())
            System.out.println(values.next());

        // for (int n:nums)
        //     System.out.println(n);
    }
}
