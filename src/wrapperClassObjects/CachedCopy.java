package wrapperClassObjects;

public class CachedCopy {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);

        Integer i5 = 10;
        Integer i6 = 10;

        // compares references
        System.out.println(i1==i2); // false
        System.out.println(i3==i4); // true
        System.out.println(i5==i6); // true
        System.out.println(i3==i6); // true
        System.out.println(i4==i5); // true

        System.out.println("*****************************************************************************");
        // compares values

        System.out.println(i1.equals(i2)); // true
        System.out.println(i3.equals(i4));
        System.out.println(i5.equals(i6));
        System.out.println(i3.equals(i6));


        Integer d1 = new Integer(200);
        Integer d2 = new Integer(200);

        Integer d3 = Integer.valueOf(200);
        Integer d4 = Integer.valueOf(200);

        Integer d5 = 200;
        Integer d6 = 200;

        System.out.println(d1==d2); // false
        System.out.println(d3==d4); // false
        System.out.println(d5==d6); // false
        System.out.println(d3==d6); // false
        System.out.println(d4==d5); // false

        System.out.println("*****************************************************************************");
        // compares values

        System.out.println(d1.equals(d2)); // true
        System.out.println(d3.equals(d4));
        System.out.println(d5.equals(d6));
        System.out.println(d3.equals(d6));





    }
}
