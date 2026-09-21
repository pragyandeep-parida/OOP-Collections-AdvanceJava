package OOP_3.polymorphism;

public class Shapes
{
    void area()
        {
            System.out.println("I am the area");
        }
}

/*
this is early binding, check your notes or ask chatgpt this and also early and late binding concepts are important

here 'final' keyword is used know how the final keyword works // ask GPT
If a method is final, the parent’s version is ALWAYS executed — regardless of the object type.

 Shapes
 {
     final void area()
        {
            System.out.println("I am the area");
        }
 }

 // also put final and see how the code works when you put final only the parent method will run you have to comment all the child methods
 */
