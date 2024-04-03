import java.util.Scanner;

public class tim_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        int soThuNhat = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int soThuHai = scanner.nextInt();

        // Tìm USCLN sử dụng thuật toán Euclid
        int uscln = timUSCLN(soThuNhat, soThuHai);

        // Hiển thị kết quả
        System.out.println("Ước số chung lớn nhất của " + soThuNhat + " và " + soThuHai + " là: " + uscln);

        scanner.close();
    }

    // Hàm tìm ước số chung lớn nhất
    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


