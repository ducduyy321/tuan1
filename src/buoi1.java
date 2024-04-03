import java.util.Scanner;

public class buoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, Bmi;

        System.out.print("Hãy nhập cân nặng của bạn : ");
        weight = sc.nextDouble();

        System.out.print("Hãy nhập chiều cao của bạn : ");
        height = sc.nextDouble();

        Bmi = weight / Math.pow(height, 2);
        System.out.println("Chỉ số BMI của bạn là : " + Bmi);

        if (Bmi < 16 ){
            System.out.print("Gầy độ III");
        }
        else if (16 <= Bmi && Bmi < 17) {
            System.out.print("Gầy độ II");
        }
        else if (17 <= Bmi && Bmi < 18.5) {
            System.out.print("Gầy độ I");
        }
        else if (18.5 <= Bmi && Bmi < 25) {
            System.out.print("Bình thường");
        }
        else if (25 <= Bmi && Bmi < 30) {
            System.out.print("Thừa cân");
        }
        else if (30 <= Bmi && Bmi < 35) {
            System.out.print("Gầy độ I");
        }
        else if (35 <= Bmi && Bmi < 40) {
            System.out.print("Gầy độ II");
        }else {
            System.out.print("Béo phì độ III");
        }
    }
}
