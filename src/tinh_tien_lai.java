import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền vay
        System.out.print("Nhập số tiền vay: ");
        double soTienVay = scanner.nextDouble();

        // Nhập lãi suất hàng tháng
        System.out.print("Nhập lãi suất hàng tháng (dưới dạng phần trăm): ");
        double laiSuatHangThang = scanner.nextDouble() / 100;

        // Nhập số tháng vay
        System.out.print("Nhập số tháng vay: ");
        int soThangVay = scanner.nextInt();

        // Tính tổng số tiền cần trả
        double tongTienCanTra = soTienVay * (1 + laiSuatHangThang * soThangVay);

        // Tính tổng số tiền lãi phải trả
        double tongTienLai = tongTienCanTra - soTienVay;

        // Hiển thị kết quả
        System.out.println("Tổng số tiền cần trả: " + tongTienCanTra);
        System.out.println("Tổng số tiền lãi phải trả: " + tongTienLai);

        scanner.close();
    }
}

