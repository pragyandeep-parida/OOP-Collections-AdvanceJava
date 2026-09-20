package OOP_1;

public class Student
{
    public static void main(String[] args)
    {
        student pragyandeep = new student();                    // if i use Capita S for student to create object as Student class does not have parameters
                                                                // the small student class(inner class has ) so object will be referring to inner class parameters. See chatgpt if you dont understand

//        pragyandeep.rollno = 97;                              // we can put all this inside constructor to make it easier to code
//        pragyandeep.name = " Pragyandeep Parida";             // then use 'this' keyword to access all the info and print it
//        pragyandeep.marks = 75.50f;                           // this keyword below is basically doing this code

        System.out.println( pragyandeep.rollno + " " + pragyandeep.name + " " + pragyandeep.marks);
    }

     public static class student
    {
        int rollno;
        String name;
        float marks;

        //we need a way to add the value of above properties object by object
        //we need a word to access all object

        student()                   //constructor created explicitly
        {
            this.rollno = 97;                       // this keyword is being used in constructor.
            this.name = "Pragyandeep Parida";
            this.marks = 75.50f;
        }
    }
}

