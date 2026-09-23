package Collection_Framework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        Map<Integer, String> num = new TreeMap<>();

        num.put(1,"One");
        num.put(2,"Two");
        num.put(3,"Three");
        num.put(4,"Four");

        num.remove(4);      //.remove will remove the key

        System.out.println(num);

        System.out.println(num.containsValue("Three"));

        System.out.println(num.isEmpty());

    }
}
