package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){

        Employee e1 = new Employee("Shreya", 5, 9999.0);
        Employee e2 = new Employee("Paul", 4, 1234.0);
        Employee e3 = new Employee("Harry",5,8769.0);
        Employee e4 = new Employee("Selvan",1,2769.0);

        ArrayList<Employee> empArrayList = new ArrayList<>();
        empArrayList.add(e1);
        empArrayList.add(e2);
        empArrayList.add(e3);
        empArrayList.add(e4);

        for(Employee e:empArrayList){
            System.out.println(e);
        }

        /*Predicate<Employee> predicate = e -> e.getPerformanceRating() >=5;
        filter(empArrayList, predicate);*/

        /*   Multline Comments
         */


        empArrayList.removeIf(e->e.getName().startsWith("S"));
        System.out.println("************************************");
        for(Employee e:empArrayList){
            System.out.println(e);
        }
    }


    /*static void filter(ArrayList<Employee> list, Predicate<Employee> rule){
        for(Employee e:list){
            if(rule.test(e)){
                System.out.println(e);
            }
        }
    }*/
}
