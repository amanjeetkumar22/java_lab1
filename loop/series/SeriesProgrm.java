package loop.series;
import java.util.Scanner;

public class SeriesProgrm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, n;

        do {
            System.out.println("\n===== SERIES MENU =====");
            System.out.println("1. Natural Numbers");
            System.out.println("2. Even Numbers");
            System.out.println("3. Odd Numbers");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Square Series");
            System.out.println("6. Factorial Series");
            System.out.println("7. Alternating Series");
            System.out.println("8. Prime Numbers");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice != 9) {
                System.out.print("Enter value of n: ");
                n = sc.nextInt();
            } else {
                break;
            }

            switch (choice) {

                case 1:
                    System.out.println("Natural Numbers:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    break;

                case 2:
                    System.out.println("Even Numbers:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print((2 * i) + " ");
                    }
                    break;

                case 3:
                    System.out.println("Odd Numbers:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print((2 * i - 1) + " ");
                    }
                    break;

                case 4:
                    System.out.println("Fibonacci Series:");
                    int a = 0, b = 1;
                    System.out.print(a + " " + b + " ");
                    for (int i = 3; i <= n; i++) {
                        int c = a + b;
                        System.out.print(c + " ");
                        a = b;
                        b = c;
                    }
                    break;

                case 5:
                    System.out.println("Square Series:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print((i * i) + " ");
                    }
                    break;

                case 6:
                    System.out.println("Factorial Series:");
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact = fact * i;
                        System.out.print(fact + " ");
                    }
                    break;

                case 7:
                    System.out.println("Alternating Series:");
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0)
                            System.out.print(-i + " ");
                        else
                            System.out.print(i + " ");
                    }
                    break;

                case 8:
                    System.out.println("Prime Numbers:");
                    int count = 0, num = 2;

                    while (count < n) {
                        boolean isPrime = true;

                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                        if (isPrime) {
                            System.out.print(num + " ");
                            count++;
                        }

                        num++;
                    }
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}