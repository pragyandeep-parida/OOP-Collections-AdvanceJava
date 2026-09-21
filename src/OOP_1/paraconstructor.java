package OOP_1;

// PARAMETERISED CONSTRUCTOR

public class paraconstructor
{
    public static class student
    {
        int roll_no;
        String name;
        float marks;

        student(int roll_no, String name, float marks)
        {
            this.roll_no = roll_no;
            this.name = name;
            this.marks = marks;
        }

        student()
        {
            //this is how you call a constructor from another constructor
            //internally: this() is -> student(12,"ajay", 55.80f)

            this(12,"ajay", 55.80f);  // calling a constructor you can use this() constructor
        }
    }
    public static void main(String[] args)
    {
//        student random = new student();   // this wont work as the class is not empty student(rollno,etc ) is there in random() it is asking empty class

        student random2 = new student();     //calling constructor's ref variable

        student s1 = new student(12,"Pragyandeep",86.5f);
        student s2 = new student(13,"Rahul", 76.45f);

        System.out.println(s1.name + "  " + s1.roll_no + "  " + s1.marks);
        System.out.println(s2.name + "  " + s2.roll_no + "  " + s2.marks);

        System.out.println(random2.roll_no + " " + random2.name + " " + random2.marks);
    }
}
