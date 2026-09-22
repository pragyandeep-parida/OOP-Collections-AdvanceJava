package OOP_6.comparing;

public class Student implements Comparable<Student>
{
    int rollno;
    float marks;

    public Student(int rollno, float marks)
    {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other)
    {
        return Float.compare(this.marks, other.marks);
    }
}

/*
STEP-BY-STEP FLOW OF THE CODE:

1. Two Student objects are created:
   s1 → marks = 78.32
   s2 → marks = 97.32

2. compareTo() is called:
   s1.compareTo(s2)

3. Inside compareTo():
   this  = s1
   other = s2

4. Comparison happens:
   Float.compare(this.marks, other.marks)
   → Float.compare(78.32, 97.32)

5. Return value:
   -1 (means s1 < s2)

6. Condition check:
   if (s1.compareTo(s2) > 0)
   → if (-1 > 0) → false

7. Output:
   "S2 has the highest marks"

KEY POINTS:
- compareTo() compares current object (this) with another object (other)
- returns:
    negative → smaller
    0        → equal
    positive → greater
*/
