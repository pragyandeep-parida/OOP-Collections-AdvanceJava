package OOP_4;

public class Main
{
    public static void main(String[] args)
    {
        A obj = new A(10,"PRAGYAN");

        //need to do few things
        //1- access the data members
        //2-modify the data members

//      int m = obj.num;                    //it will show error when the num in A is private to access you need to use getter and setter


        int n =  obj.getnum();              // also see obj.xyz why we are not writing directly why we reference it to int n. check chatgpt
        System.out.println(n);

        System.out.println(obj.name);       //name is protected but is accessible as it is in the same package but in other package it wont work

    }
}


/*
paste the code in singleton main.java and see how access modifiers work

import OOP_4.A;

A ob = new A(10,"PRAGYAN")

ob.int   - it wont happen as int is private
ob.name  - it wont happen as name is protected and it can be accessed in the same package OOP_4 only

 */

