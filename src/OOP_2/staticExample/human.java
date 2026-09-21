package OOP_2.staticExample;

public class human
{
        int age;
        String name;
        float salary;
        boolean married;
        static long population;

        human(int age, String name, int salary, boolean married)
        {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;

            human.population +=1;         // while java does allow this.population its not a good practice use ClassName.method(human.population)
        }


}
