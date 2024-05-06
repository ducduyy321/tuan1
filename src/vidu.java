import java.time.LocalDateTime;
import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        do {
            LocalDateTime current = LocalDateTime.now();
            System.out.println("nhap tu time de biet thoi gian hien tai");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "exit":
                    return;
                case "time":
                    System.out.println("thoin gian hien tai" + current);
                    break;
                default:
                    System.out.println("to khong hieu");
                    break;
            }
            }
            while (true) ;

    }
}
