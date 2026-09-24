package StreamAPI.constructorReference;

import java.util.*;

public class conRef
{
    public static class Student
    {
        private int age;
        private String name;

        public Student(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Naveen","Harry","Denis");

        List< Student> students = new ArrayList<>();

//        students = names.stream()
//                .map(name -> new Student(name)).toList();

        students = names.stream()
                .map(Student :: new).toList();      // instead of name -> new Student(name) we use constructor ref Student :: new

        System.out.println(students);
    }
}

//Student :: new tells java this:
//Whenever you receive an element from the stream, use it as an argument to the Student constructor and return the created object