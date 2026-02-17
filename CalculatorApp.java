// import java.util.Scanner;

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int sub(int a, int b) {
//         return a - b;
//     }

//     int mul(int a, int b) {
//         return a * b;
//     }

//     int div(int a, int b) {
//         if (b == 0) {
//             System.out.println("Division by zero not allowed");
//             return 0;
//         }
//         return a / b;
//     }

//     int mod(int a, int b) {
//         if (b == 0) {
//             System.out.println("Modulus by zero not allowed");
//             return 0;
//         }
//         return a % b;
//     }
// }

// public class CalculatorApp {
//     public static void main(String[] args) {
//         int choice;
//         Scanner sc = new Scanner(System.in);
//         Calculator calc = new Calculator();

//         do {
//             System.out.println("\nMENU");
//             System.out.println("1. Addition");
//             System.out.println("2. Subtraction");
//             System.out.println("3. Multiplication");
//             System.out.println("4. Division");
//             System.out.println("5. Modulus");
//             System.out.println("6. Exit");
//             System.out.print("Enter your choice: ");

//             choice = sc.nextInt();

//             if (choice >= 1 && choice <= 5) {
//                 System.out.print("Enter first number: ");
//                 int x = sc.nextInt();
//                 System.out.print("Enter second number: ");
//                 int y = sc.nextInt();

//                 switch (choice) {
//                     case 1:
//                         System.out.println("Sum = " + calc.add(x, y));
//                         break;
//                     case 2:
//                         System.out.println("Difference = " + calc.sub(x, y));
//                         break;
//                     case 3:
//                         System.out.println("Product = " + calc.mul(x, y));
//                         break;
//                     case 4:
//                         System.out.println("Quotient = " + calc.div(x, y));
//                         break;
//                     case 5:
//                         System.out.println("Remainder = " + calc.mod(x, y));
//                         break;
//                 }
//             } 
//             else if (choice == 6) {
//                 System.out.println("Exiting...");
//             } 
//             else {
//                 System.out.println("Invalid choice");
//             }

//         } while (choice != 6);

//         sc.close();
//     }
// }
import java.util.Scanner;
class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double sub(double a, double b) {
        return a - b;
    }
    double mul(double a, double b) {
        return a * b;
    }
    double div(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return a / b;
    }
    double mod(double a, double b) {
        if (b == 0) {
            System.out.println("Modulus by zero not allowed");
            return 0;
        }
        return a % b;
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                double x = sc.nextDouble();
                System.out.print("Enter second number: ");
                double y = sc.nextDouble();
                switch (choice) {
                    case 1:
                        System.out.println("Sum = " + calc.add(x, y));
                        break;
                    case 2:
                        System.out.println("Difference = " + calc.sub(x, y));
                        break;
                    case 3:
                        System.out.println("Product = " + calc.mul(x, y));
                        break;
                    case 4:
                        System.out.println("Quotient = " + calc.div(x, y));
                        break;
                    case 5:
                        System.out.println("Remainder = " + calc.mod(x, y));
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 6);
        sc.close();
    }
}