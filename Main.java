import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner c = new Scanner(System.in);

		String name;
        String response;

        int age;

        double price = 2000;
        double minor = 0.04;
        double adult = 0;
        double senior = 0.06;
        double total;
        double totalamt;
        double totalds;

        boolean buyAgain = true;

        while (buyAgain) {

            System.out.println("==========");
            System.out.println("WELLCOME TO SHOE STORE!");
            System.out.println("==========");

            System.out.print("DO YOU WANT TO BUY AGAIN?(y/n): ");
            response = c.next().toLowerCase();
            buyAgain = response.equalsIgnoreCase("y");
        }

        c.close();
    }
}