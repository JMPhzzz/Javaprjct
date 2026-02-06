import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner c = new Scanner(System.in);

		String name;
        String response;
        String choose = "";

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

            System.out.println("=======================");
            System.out.println("WELLCOME TO SHOE STORE!");
            System.out.println("=======================");

            System.out.print("ENTER YOUR NAME: ");
            name = c.nextLine();

            System.out.print("ENTER YOUR AGE: ");
            age = c.nextInt();
            c.nextLine();

            System.out.print("ARE YOU A MINIR, SENIOR, OR A ADULT: ");
            choose = c.nextLine().toUpperCase();

            switch (choose) {
                case "MINOR":
                    totalds = price * minor;

                    totalamt = price - totalds;

                    System.out.println("=============");
                    System.out.println("ORDER RECEIPT");
                    System.out.println("=============");

                    System.out.printf("PRICE: ₱%.2f\n", price);
                    System.out.printf("DISCOUNT: ₱%.2f\n", totalds);
                    System.out.printf("TOTAL: ₱%.2f\n", totalamt);
                    break;
                case "SENIOR":
                    totalds = price * senior;

                    totalamt = price - totalds;

                    System.out.println("=============");
                    System.out.println("ORDER RECEIPT");
                    System.out.println("=============");

                    System.out.printf("PRICE: ₱%.2f\n", price);
                    System.out.printf("DISCOUNT: ₱%.2f\n", totalds);
                    System.out.printf("TOTAL: ₱%.2f\n", totalamt);
                    break;
                case "ADULT":
                    totalds = price * adult;

                    totalamt = price - totalds;

                    System.out.println("=============");
                    System.out.println("ORDER RECEIPT");
                    System.out.println("=============");

                    System.out.printf("PRICE: ₱%.2f\n", price);
                    System.out.printf("DISCOUNT: ₱%.2f\n", totalds);
                    System.out.printf("TOTAL: ₱%.2f\n", totalamt);
                    break;
                default:
                    System.out.println("INVALID SELECTIONS!!");
            }

            System.out.print("DO YOU WANT TO BUY AGAIN?(y/n): ");
            response = c.next().toLowerCase();
            buyAgain = response.equalsIgnoreCase("y");
        }

        c.close();
    }
}