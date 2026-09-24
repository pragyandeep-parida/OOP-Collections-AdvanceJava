package StreamAPI.MethodReference;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx
{
    public static void main(String[] args)
    {
        List<String> Names = Arrays.asList("Navin", "Sohit", "Nakul");

        List<String> uNames = Names.stream()
                .map(String :: toUpperCase).toList();       //we used method reference (::)

        uNames.forEach(i -> System.out.println(i));  // you can use method reference here aswell - forEach( System.out :: println)

    }
}

