package StreamAPI.Stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class stream
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,3,2,6,7,8);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);        // we use n because in lambda expression it is equivalent to writing for(int n : nums)
        Stream<Integer> s3 = s2.map(n -> n *2);

//        s1.forEach(n -> System.out.println(n));  //stream can be used once
//        s2.forEach(n -> System.out.println(n));   //since we are using s3 cant use s2 again stream principle

          s3.forEach(n -> System.out.println(n));

    }
}
