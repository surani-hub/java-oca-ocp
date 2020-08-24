package wrapperClassObjects;

import java.util.function.DoubleUnaryOperator;

public class DemoClasses {
    public static void main(String[] args) {

        Boolean bool = true;
        Integer int1 = 20;
        Long long1 = 102923993l;
        Double double1 = 10.20293;

        System.out.println(bool);
        System.out.println(int1);
        System.out.println(long1);
        System.out.println(double1);

        int1 = 30;

        System.out.println("primitive double value of "+double1.doubleValue());

        System.out.println("-----------"+int1);
        System.out.println("-------------------------------------------------------------------");
        Boolean bool1 = new Boolean(true);
        Integer int2 = new Integer(30);

        Boolean bool2 = new Boolean("true");
        Character char1 = new Character('s');
        Integer int3 = new Integer("20");
        Double double3 = new Double("20.201920");

        System.out.println(bool2);
        System.out.println(char1);
        System.out.println(int3);
        System.out.println(double3);

        int3 = 4039;
        System.out.println("-------------"+int3);

        System.out.println("String value of wrapper classes " + Boolean.parseBoolean("true"));
        System.out.println("String value of double primitive " + Double.parseDouble("12920.282929"));
        System.out.println("Integer value " + Integer.parseInt("292838"));
       // NumberFormatException
        //  System.out.println(Long.parseLong("10.23"));
      //  System.out.println(Byte.parseByte("1234"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Boolean.parseBoolean("1020"));





        System.out.println("------------------------------------------------------------------");
        Boolean bool4 = Boolean.valueOf("true");
        Boolean bool5 = Boolean.valueOf("True");
        Boolean bool6 = Boolean.valueOf("TrUe");
        Boolean bool7 = Boolean.valueOf(false);

        Double double5 = Double.valueOf(29.0656);
        System.out.println(double5);
        System.out.println(bool4);
        System.out.println(bool5);
        System.out.println(bool6);
        System.out.println(bool7);


        System.out.println("*****************************************************************************");

        Long var1 = Long.valueOf(127); // Integer, Long, Byte, Short only
        Long var2 = Long.valueOf("127");
        System.out.println(var1 == var2); // caches objects within range 0 to 127 and returns predefined object

        Long var3 = Long.valueOf(374);
        Long var4 = Long.valueOf("374");
        System.out.println(var3 == var4); // otherwise create new object and return its reference

        Float var5 = Float.valueOf(127);
        Float var6 = Float.valueOf("127"); // For Float and Double
        System.out.println("Float values " + (var5 == var6)); // does not caches any values. It always creates new object and returns reference

        Boolean var7 = Boolean.valueOf(true);
        Boolean var8 =  Boolean.valueOf("TrUE");
        System.out.println("Boolean values " + (var7 ==  var8));



    }
}
