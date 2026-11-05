public class CheckEvenOdd {
    public static void main(String[] args) {
        int number = 7; // Ningalkku istamulla number maatam

        System.out.println("Checking number: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number.");
        } else {
            System.out.println(number + " is an Odd Number.");
        }
    }
}
