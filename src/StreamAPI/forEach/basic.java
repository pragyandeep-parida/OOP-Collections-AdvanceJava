package StreamAPI.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic
{
    public static void main(String[] args)
    {
       List<Integer> nums = Arrays.asList(4,3,6,5,7,8);

//       for (int n : nums)   // Basic printing
//       {
//           System.out.println(n);
//       }

        nums.forEach(n -> System.out.println(n)); //print using forEach
    }
}
