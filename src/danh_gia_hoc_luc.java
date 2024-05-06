import java.util.Scanner;

public class danh_gia_hoc_luc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập điểm môn học của bạn.");
        System.out.println("Nhập điểm chuyên cần của bạn.");
        double diemChuyenCan = scanner.nextByte();
        System.out.println("Nhập điểm kiểm tra của bạn.");
        double diemKiemTra = scanner.nextDouble();
        System.out.println("Nhập điểm thi cuối kỳ của bạn.");
        double diemThiCuoiky = scanner.nextDouble();
        double diemTrungBinh = (diemChuyenCan + diemKiemTra + diemThiCuoiky) / 3;


        if (diemTrungBinh >= 9.0) {
            System.out.println("Bạn xếp hạng A");
        } else if (diemTrungBinh >= 8.0) {
            System.out.println("Bạn xếp hạng B");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Bạn xếp hạng C");
        } else if (diemTrungBinh >= 5.0) {
            System.out.println("Bạn xếp hạng D");
        } else  {
            System.out.println("Bạn xếp hạng E");

        }
    }
}


