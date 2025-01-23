import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D31 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(112);
        nums.add(23);
        nums.add(7);
        nums.add(44);
        nums.add(69);

        Collections.sort(nums);

        System.out.println(nums);
        
    }
}
