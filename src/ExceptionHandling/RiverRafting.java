package ExceptionHandling;

public class RiverRafting {
    void crossRapid(int degree) throws FallInRiverException{
        System.out.println("Cross Rapid");
        if (degree>10) throw new FallInRiverException();
    }

    /*void rowRaft(String state) throws DropOarException{
        System.out.println("Row raft");
        if(state.equals("nervous")) throw new DropOarException();
    }

    public static void main(String[] args) {
        RiverRafting riverRafting = new RiverRafting();
        try {
           // riverRafting.crossRapid(11);
            riverRafting.crossRapid(9);
            riverRafting.rowRaft("happy");
            System.out.println("Enjoy river rafting");
        }catch (FallInRiverException e1){
            System.out.println("Get back in the raft");
        }catch (DropOarException e2){
            System.out.println("Do not panic");
        }
        finally {
            System.out.println("Pay for the sport");
        }
        System.out.println("After try block");
    }*/
}
