import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        dùng để cho người dùng có thể nhập liên tục
        while (true) {
            System.out.println("vui long nhap so ban can dich");
            int soNguyen = scanner.nextInt();
            int soHangChuc = soNguyen / 10;
            int soHangDonVi = soNguyen % 10;
            String chuc = "";
            String donVi = "";
            String soDon = "";
            String muoi = "";
            System.out.println("Ket qua cua ban la.");

            if(soNguyen < 0){
                System.out.println("tôi không đọc số âm.");
            }

            if (soNguyen < 10) {
                switch (soNguyen) {
                    case 0:
                        soDon = "zero";
                        break;
                    case 1:
                        soDon = "one";
                        break;
                    case 2:
                        soDon = "two";
                        break;
                    case 3:
                        soDon = "three";
                        break;
                    case 4:
                        soDon = "four";
                        break;
                    case 5:
                        soDon = "fine";
                        break;
                    case 6:
                        soDon = "six";
                        break;
                    case 7:
                        soDon = "seven";
                        break;
                    case 8:
                        soDon ="eight";
                        break;
                    case 9:
                        soDon = "nine";
                        break;
                }

//
            } else if (soNguyen < 20) {
                switch (soHangDonVi) {
                    case 0:
                        muoi = "ten";
                        break;
                    case 1:
                        muoi = "eleven";
                        break;
                    case 2:
                        muoi = "twelve";
                        break;
                    case 3:
                        muoi = "thirteen";
                        break;
                    case 4:
                        muoi = "fourteen";
                        break;
                    case 5:
                        muoi = "fifteen";
                        break;
                    case 6:
                        muoi = "sixteen";
                        break;
                    case 7:
                        muoi = "seventeen";
                        break;
                    case 8:
                        muoi = "eighteen";
                        break;
                    case 9:
                        muoi = "nineteen";
                        break;
                }
            } else if (soNguyen >= 20 && soNguyen < 100) {
                switch (soHangChuc) {
                    case 2:
                        chuc = "twenty";
                        break;
                    case 3:
                        chuc = "thirty";
                        break;
                    case 4:
                        chuc = "forty";
                        break;
                    case 5:
                        chuc = "fifty";
                        break;
                    case 6:
                        chuc = "sixty";
                        break;
                    case 7:
                        chuc = "seventy";
                        break;
                    case 8:
                        chuc = "eighty";
                        break;
                    case 9:
                        chuc = "ninety";
                        break;
                }

                switch (soHangDonVi) {
                    case 1:
                        donVi = "one";
                        break;
                    case 2:
                        donVi = "two";
                        break;
                    case 3:
                        donVi = "three";
                        break;
                    case 4:
                        donVi = "four";
                        break;
                    case 5:
                        donVi = "five";
                        break;
                    case 6:
                        donVi = "six";
                        break;
                    case 7:
                        donVi = "seven";
                        break;
                    case 8:
                        donVi = "eight";
                        break;
                    case 9:
                        donVi = "nine";
                        break;
                }
            }

//
//
            System.out.println(muoi);
            System.out.println(soDon);
            if (soHangDonVi == 0) {
                System.out.println(chuc);
            } else {
                System.out.println(chuc + " " + donVi);
            }

//

        }
    }
}