package Collection_Framework.ArrayClass;

import java.util.Arrays;

public class arrayclass
{
    public static void main(String[] args)
    {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(arr, 4);
//
//        System.out.println(index);  // the index of 4 in the array is arr[3] which is 3

        Integer[] numbers ={12,43,56,32,11,23,18,37};
        Arrays.sort(numbers);

//        Arrays.fill(numbers, 17);  //.fill() changes all the elements in the number to 17

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
