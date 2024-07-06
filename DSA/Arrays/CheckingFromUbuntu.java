package Arrays;

public class CheckingFromUbuntu {

    public static void main(String[] args) {
        System.out.println("Hello World From ubuntu");
        printStarPattern();
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void printStarPattern() {
        for(int i=0; i<5; i++) {
            for(int j=i+1; j<5; j++) {

                    System.out.print("* ");

            }
            System.out.println();
        }
    }



}
