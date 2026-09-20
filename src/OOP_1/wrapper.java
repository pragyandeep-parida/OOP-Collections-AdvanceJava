package OOP_1;

import OOP_2.Package2.test;

public class wrapper
{
    public static void main(String[] args)
    {
        int a = 10;
        Integer b = 20;

        System.out.println(a);
        System.out.println(b);

        test.message();

    }
}

/*
here i imported message() method from another package

but if i write - import OOP_2.Package2.test.greeting(); it wont work

type this- import OOP_2.Package2.test;

then use ClassName.method which is this-    test.message(); to call this method which is message() which has its contents

 */