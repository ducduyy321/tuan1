import java.util.Scanner;

public class PT_bac1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Phuong trinh co dang ax + b = c ");
        System.out.println("Hay nhao gia tri a = ");
        int a = sc.nextInt();
        System.out.println("Hay nhao gia tri b = ");
        int b = sc.nextInt();
        System.out.println("Hay nhao gia tri c = ");
        int c = sc.nextInt();
        if (a == 0){
            System.out.println("phuong trinh vo no !");
        }else {

        int x = (c - b) / a;
        System.out.println("Phuong trinh co no : x = " + x);
    }}
}
