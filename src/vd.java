public class vd {
    public static void main(String[] args) {
        int[] a =  {4,7,9,34,12};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min= a[i];
            }
        }
        System.out.println(min);
    }
}
