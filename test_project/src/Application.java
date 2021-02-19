import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation: ");
        String operation = scanner.nextLine();
        System.out.println("Enter 2 integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (operation.equals("sum"))
            System.out.println("Result: " + (a + b));
        else if (operation.equals("dif"))
            System.out.println("Result: " + (a - b));
        else if (operation.equals("mul"))
            System.out.println("Result: " + (a * b));
        else if (operation.equals("div"))
            System.out.println("Result: " + (a / b));
        else
            System.out.println("Invalid operation.");






        
    }
}