import java.util.Scanner;

public class thiet_ke_menu_ung_dung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            // Hiển thị menu
            System.out.println("----- MENU -----");
            System.out.println("1. Tính tổng hai số");
            System.out.println("2. Tìm ước số chung lớn nhất");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            // Xử lý lựa chọn của người dùng
            switch (luaChon) {
                case 1:
                    tinhTongHaiSo();
                    break;
                case 2:
                    timUSCLN();
                    break;
                case 0:
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (luaChon != 0);

        scanner.close();
    }

    // Phương thức tính tổng hai số
    public static void tinhTongHaiSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int soThuNhat = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int soThuHai = scanner.nextInt();
        int tong = soThuNhat + soThuHai;
        System.out.println("Tổng hai số là: " + tong);
    }

    // Phương thức tìm ước số chung lớn nhất
    public static void timUSCLN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int soThuNhat = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int soThuHai = scanner.nextInt();
        int uscln = timUSCLN(soThuNhat, soThuHai);
        System.out.println("Ước số chung lớn nhất của " + soThuNhat + " và " + soThuHai + " là: " + uscln);
    }

    // Phương thức tìm ước số chung lớn nhất
    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
