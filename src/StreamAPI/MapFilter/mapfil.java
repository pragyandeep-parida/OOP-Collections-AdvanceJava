package StreamAPI.MapFilter;

import java.util.*;
import java.util.function.Predicate;

public class mapfil
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,3,2,6,7,8);

        int result = nums.stream().filter(n -> n%2 ==0).map(n -> n * 2).reduce(0,(c,e) -> c+e);  //instead of n%2 == 0 we wrote p

        System.out.println(result);
    }
}
