import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        //b1 tao mang
        int[] array = {1, 2, 3, 4, 5};
        //b2 tao mang moi
        int[] newarray = new int[array.length - 1];
        //b3 duyet mang array
        for (int i = 0; i < array.length-1; i++ ) {
            newarray[i] = array[i];
        }
        System.out.println(Arrays.toString(newarray));
    }
}
