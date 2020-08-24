package staticVar;

public class TwistInTaleNumberSystem {
    public static void main(String[] args) {

        int baseDecimal = 267;
        int octValue = 0413;
        int hexValue = 0x10B;
        int binValue = 0b100001011;

        System.out.println(baseDecimal + octValue);
        System.out.println(hexValue + binValue);

        System.out.println(baseDecimal);
        System.out.println(octValue);
        System.out.println(hexValue);

        System.out.println(Integer.toBinaryString(binValue));
        System.out.println(Integer.toHexString(hexValue));
        System.out.println(Integer.toOctalString(octValue));
        System.out.println(baseDecimal);
    }
}
