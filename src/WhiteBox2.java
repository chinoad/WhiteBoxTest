import java.util.Scanner;

public class WhiteBox2 {

    public static void main(String[] args) {

        int count = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN");
        int pin = scanner.nextInt();
        do {

            if(pin==1234){
                System.out.println("Access granted");
                System.exit(0);

            }else{
                System.out.println("Wrong PIN. Please re-enter your pin");
                pin = scanner.nextInt();
                count++;
            }


        }while(count<3);
        System.out.println("Access denied");
    }
}


