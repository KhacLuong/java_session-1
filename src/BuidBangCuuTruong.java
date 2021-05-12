public class BuidBangCuuTruong {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            for(int j=1; j<=10; j++){
                int r=i*j;
                System.out.printf("%d x %d = %d\n", i,j,r);
            }
            System.out.println();
        }
        System.out.println("The End");
    }
}
