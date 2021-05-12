import java.util.Scanner;

public class Assignment1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap  vao mot so nguyen duong");
        int num = scanner.nextInt();
        System.out.printf("So ban vua nhap la: %d\n", num);

        // kiem tra so chan le
        if(num%2==0){
            System.out.println("S ban vua nhap la so chan");
        }
        else{
            System.out.println("S ban vua nhap la so le");
        }

        // ting tong cac so chan nho hon so vua nhap

        int s=0;
        for(int i=2; i<num; i+=2){
            s +=i;
        }
        System.out.printf("Tong cac so chan nho hon so ban nhap vao la: %d\n", s);
        System.out.println();

        // tong cac so chia het cho 3 tu 1
        s=0;
        for(int i =3; i<num; i+=3){
            s+=i;
        }
        System.out.printf("Tong cac so chia het cho 3  tu 1 den nho hon so ban vua nhap la: %d\n", s);
    }
}
