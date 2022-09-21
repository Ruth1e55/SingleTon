import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1. Thread Safe Singleton");
            System.out.println("2. Lazy Initialization");
            System.out.println("3. Double Check");
            System.out.println("4. Eager Initialization");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ThreadSafe.getInstance().doSomething();
//                    ThreadSafe instance3 = new ThreadSafe();
//                    System.out.println("Instance 3 " + instance3.hashCode());
                    break;
                case 2:
                    LazyInitialization.getInstance().doSomething();
                    break;
                case 3:
                    DoubleCheck.getInstance().doSomething();
                    break;
                case 4:
                    EagerInitialization.getInstance().doSomething();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}