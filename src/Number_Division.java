import java.util.Scanner;

public class Number_Division {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("nhap so can kiem tra?");
        int num = s.nextInt();
        System.out.printf("so ban vua nha la %d", num);
        System.out.println();
        if(num%2==0){
            System.out.println("so ban vua nha la so chan");
        }
        else {
            System.out.println("so ban vua nha la so le");
        }
    }
}
