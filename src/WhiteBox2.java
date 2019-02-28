import java.util.Scanner;

public class WhiteBox2 {

    public static void main(String[] args) {


        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN");
        int pin = scanner.nextInt();

        for (int i = 1; i <= 3; i++) {

            if (pin != 1234) {
                count++;
                if (count < 3) {
                    incorrectPin();
                    scanner.nextInt();
                }
                if (count == 3) {
                    strike();
                    break;
                }
            } else if(pin == 1234) {
                correctPin();
                break;
            }
        }
    }

    public static void correctPin() {
        System.out.println("Access granted");
    }

    public static void incorrectPin() {
        System.out.println("Wrong PIN. Please re-enter");

    }

    public static void strike() {
        System.out.println("Access denied");

    }

}
