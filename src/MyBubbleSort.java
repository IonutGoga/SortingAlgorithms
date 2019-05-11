import java.awt.image.AreaAveragingScaleFilter;

public class MyBubbleSort {

    public static void sort(int[] a) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    sorted = false;
                    ArrayUtils.show(a);
                    System.out.println("switch " + a[i] + " <-> " + a[i + 1]);
                }
            }
            System.out.println("parcurgere");

        }
    }


    public static void main(String[] args) {

        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};

        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }
}
