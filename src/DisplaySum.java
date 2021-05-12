public class DisplaySum {
    public static void main(String[] args) {
        int num1 =5;
        int num2 =10;
        int sum = num1 +num2;
        System.out.print("Sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" is: ");
        System.out.print(sum);
        System.out.println("----------------");
        System.out.println("Sum of ");
        System.out.println(num1);
        System.out.println(" and ");
        System.out.println(num2);
        System.out.println(" is: ");
        System.out.println(sum);

        System.out.println("----------------");

        System.out.println("Sum of " + num1 + " and " + num2+ " is: "+ sum);
        System.out.println("----------------");

        System.out.printf("Sum of %d and %d is %d %n", num1, num2, sum);
    }
}
