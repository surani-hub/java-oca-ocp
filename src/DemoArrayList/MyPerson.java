package DemoArrayList;

public class MyPerson {
    String name;

    MyPerson(String name){
        this.name = name;

    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof MyPerson){
            MyPerson person = (MyPerson)obj;
            boolean isValue = person.name.equals(this.name);
            return isValue;
        } else {
            return false;
        }
    }
}
