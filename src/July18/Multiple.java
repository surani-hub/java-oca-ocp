package July18;

interface Printable {
 void printBook();

}

interface Moveable {

    String moveToNewPlace(String placeName);
}


class Multiple implements Moveable{

    public static void main(String[] args) {
        System.out.println("Learning Java is Fun!");

        System.out.println(new Multiple().moveToNewPlace("New York"));
        new Division().getAnswer();
        new Division().printBook();
    }

    @Override
    public String moveToNewPlace(String placeName) {
        System.out.println("Moving to New York");
        return placeName;
    }
}

class Division implements Printable {

    public void getAnswer() {
        System.out.println("Division");
    }

    @Override
    public void printBook() {
        System.out.println("Printing OCA Book");
    }
}