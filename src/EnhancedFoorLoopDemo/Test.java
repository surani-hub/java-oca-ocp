package EnhancedFoorLoopDemo;

public class Test {

    public static void main(String[] args) {
        User u1 = new User(11, "child");
        System.out.println(u1);
        int contactNo = 100;
        change(u1, contactNo);
        System.out.println(u1);
        System.out.println(contactNo);

        User u2 = new User(11, "child");

    }


 static void change(User u1, int contactNo){

        contactNo = 200;
        u1.name = "amit";
     System.out.println(u1);

 }



}

class User {

    int age = 10;
    String name = "Sudha";

    User(int age, String name){
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}