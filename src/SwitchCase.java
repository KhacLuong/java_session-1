import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = s.nextInt();
        System.out.println("Enter num2");
        int num2 = s.nextInt();
        int index =0;
        while (index<10){
            index++;

            System.out.println("Enter your choice?\n");
            System.out.println("choice 1. Add");
            System.out.println("choice 2. Sub");
            System.out.println("choice 3. Mul");
            System.out.println("choice 4. Div\n");
            int choice =s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Addition");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println("Subtraction");
                    System.out.println("Result :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication");
                    System.out.println("Result: "+ num1*num2);
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Result: "+(float)num1/num2);
                    break;
                default:
                    System.out.println("choice again");
            }
        }

    }
}
