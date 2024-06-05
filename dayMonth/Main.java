import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        String month = """
                (1) JANUARY, (2) FEBRUARY, (3) MARCH, (4) APRIL,
                (5) MAY, (6) JUNE, (7) JULY, (8) AUGUST,
                (9) SEPTEMBER, (10) OCTOBER, (11) NOVEMBER,
                (12) DECEMBER, (0) EXIT
                                
                ENTER NUMBER:""";

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(month);

            int monthNUmber = scanner.nextInt();

            switch (monthNUmber) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("Number of days : 31");
                    System.out.println("=".repeat(50));
                    break;
                case 2:
                    System.out.println("Number of days : 28");
                    System.out.println("=".repeat(50));
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Number of days : 30");
                    System.out.println("=".repeat(50));
                    break;
                case 0:
                    System.out.println("Existing program");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid number!");
                    System.out.println("=".repeat(50));
                    break;

            }
        }

    }
}

