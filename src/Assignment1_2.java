import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao so thu nhat");
        int num1 = scanner.nextInt();
        System.out.println("moi ban nhap vao so thu hai");
        int num2 = scanner.nextInt();
        System.out.println("Ket qua cua ban nhu sau");
        System.out.printf("Ket qua phep cong la: %d\n", num1+num2);

        System.out.printf("Ket qua phep tru la: %d\n", num1-num2);
        System.out.printf("Ket qua phep nhan la: %d\n", num1*num2);
        System.out.printf("Ket qua phep chia la: %.2f\n", (float)num1/num2);


    }
}
