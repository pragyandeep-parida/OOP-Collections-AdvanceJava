package OOP_6.LambdaFunction;

public class Student
{
    int rollno;
    float marks;

    public Student(int rollno, float marks)
    {
        this.rollno =rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
