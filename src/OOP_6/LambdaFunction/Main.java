package OOP_6.LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student(1,85.60f));
        list.add(new Student(2,55.80f));
        list.add(new Student(3,73.88f));
        list.add(new Student(4,95.32f));
        list.add(new Student(5,45.90f));

        System.out.println("Before sorting the list: ");
        System.out.println(list);

        System.out.println();

        //After sorting in ascending order
        Collections.sort(list, (a,b) -> Float.compare(a.marks, b.marks));

        System.out.println("The list after sorting is: ");
        System.out.println(list);

        System.out.println();

        //After sorting in descending order
        Collections.sort(list, (a,b) -> Float.compare(b.marks, a.marks));

        System.out.println("The list after sorting is: ");
        System.out.println(list);

        System.out.println();

        //After sorting rollno wise
        Collections.sort(list, (a,b) -> Integer.compare(a.rollno, b.rollno));

        System.out.println("The list after sorting rollno wise is: ");
        System.out.println(list);
    }
}


/*
Collections.sort(list, (a, b) -> Float.compare(a.marks, b.marks));

HOW JAVA UNDERSTANDS THIS:

1. "Sort the list using this rule"

2. Picks two elements:
   a = one Student
   b = another Student

3. Applies lambda:
   Float.compare(a.marks, b.marks)

4. Gets result:
   negative → a comes before b
   positive → b comes before a
   0        → no change

5. Repeats this many times until list is sorted


ONE-LINE MEANING:
"Sort students based on marks (ascending order)"
*/
