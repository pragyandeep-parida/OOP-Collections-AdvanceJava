package StreamAPI.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Naveen","Laxmi","Keerthi","Suresh");  // replace laxmi with Lakshmi and see what happens

        Optional<String>  name= names.stream()
                .filter(str -> str.contains("x")).findFirst();

        System.out.println(name.orElse("Not found"));
    }
}
