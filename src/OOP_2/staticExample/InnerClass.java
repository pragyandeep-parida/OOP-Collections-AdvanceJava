package OOP_2.staticExample;

public class InnerClass
{
    static class test
    {
        String name;        // if you make it static the op will be kunal kunal noy pragyandeep kunal
                            // short answer - if static then it will have shared value  for all objects but if non static it will have different values for all objects
        public test(String name)
        {
            this.name = name;
        }
    }

    public static void main(String[] args)
    {
        test a = new test("pragyandeep");
        test b = new test("kunal");

        System.out.println(a.name);   // see by putting static it will show op kunal and kunal
        System.out.println(b.name);    //  but if you make string non-static it will show pragyandeep & kunal
    }
}
