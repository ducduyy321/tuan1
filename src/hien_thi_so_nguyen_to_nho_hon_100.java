import java.util.Scanner;

public class hien_thi_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        hienThiSoNguyenTo();
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức hiển thị các số nguyên tố nhỏ hơn 100
    public static void hienThiSoNguyenTo() {
        for (int i = 2; i < 100; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

