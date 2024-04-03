import java.util.Scanner;

public class tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ung dung chuyen doi tien VND --> USD");
        System.out.println("Hay nhap so tien ban muon chuyen doi : ");
        int number = sc.nextInt();

        int USD = number / 23000;
        System.out.println("Thanh USD : " + USD);
    }
}
