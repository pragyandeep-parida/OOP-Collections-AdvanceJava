package Collection_Framework.Map;

import java.util.Map;

public class HashMap
{
    public static void main(String[] args)
    {
        Map<String, Integer> num = new java.util.HashMap<>();

        num.put("one",1);
        num.put("two",2);
        num.put("three",3);

//        if (!num.containsKey("two"))   //instead of if statement there is another method below
//        {
//            num.put("two", 22);
//        }

        num.putIfAbsent("four",4);   //we didnt had 4 so it added 4

        System.out.println(num);

        System.out.println(num.containsKey("three"));

        System.out.println(num.isEmpty());

        //iterate
        for (Map.Entry<String, Integer> e: num.entrySet())
        {
            System.out.println("The key and the value is: " + e);

            System.out.println("The key is: " + e.getKey());
            System.out.println("The value is: " + e.getValue());

            System.out.println();
        }

        for (String key : num.keySet())
        {
            System.out.println(key);
        }

        for(Integer values : num.values())
        {
            System.out.println(values);
        }
    }
}
