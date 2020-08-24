package cert;

interface StaticIFace {

    static void m1() {
        System.out.println("Valid");

    }

    static public int m2() {
        return 10;
    }

}

