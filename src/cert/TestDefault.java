package cert;

public interface TestDefault {
     default void m1(){
         System.out.println("Defaule method");
     }

      static void m2(){
         System.out.println("static not acceptable");
     }

     default int m3() {
         return 10;

     }
}
