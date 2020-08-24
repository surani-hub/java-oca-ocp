package varScope;

public class Student {
    private double marks1, marks2, marks3;
    private double maxMarks = 100;
    double weight;

    Student(){

    }

    public double getAverage(){
        double avg = 0;
        avg =( (marks1+marks2+marks3)/(maxMarks*3)) * 100;
        return  avg;
    }

    public void setAverage(double val){
        //avg =  val;

    }
    void setWeight(double val){
        if(val<1) return;
        weight = val;
    }

    void setWeightTwo(double val1){
    if (val1<1) return;
    else
        weight = val1;
    }




    public static void main(String[] args) {
        Student s = new Student();
    }
}
