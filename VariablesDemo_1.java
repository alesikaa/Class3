package Class3;

import java.sql.SQLOutput;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10;//requesting the comp to create a box of type int and store a variable
        int salary;//only create a box of type int and don't assign any value to it.
        salary =12000;//updating a variable or reassigning a value
        System.out.println(salary);
       /* String name;
        String city;
        String country;*/
        String name,city,country;//we can create multiple empty boxes in a single line of code
        char gender,letter;
        name="Daria";//storing a value in the variable
        //System.out.println(city); I have not stored anything inside the city variable that's why java is confused
        //what to print
        System.out.println(name);

    }
}