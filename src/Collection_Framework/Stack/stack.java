package Collection_Framework.Stack;

import java.util.Stack;

public class stack
{
    public static void main(String[] args)
    {
        Stack<String> st = new Stack<>();

        st.push("Lion");
        st.push("Tiger");
        st.push("Elephant");
        st.push("Monkey");

        System.out.println("Stack: " + st);
        System.out.println( st.peek());

        st.pop();

        System.out.println("Stack: " + st);
        System.out.println( st.peek());

        st.push("Hippo");
        System.out.println("Stack: " + st);

    }
}

/*
basically in LIFO

[Lion, Tiger, Elephant, Monkey]

last is monkey and if we have to remove an element the first will be the last element which is the monkey
 */