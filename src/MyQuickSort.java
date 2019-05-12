public class MyQuickSort {

    public static void sort(int[] a, int left, int right) {

        int pivot = a[(left + right) / 2];

        int i = left;
        int j = right;

        while (i < j) {
            while (a[i] < pivot) {
                i++;
            }


            while (a[j] > pivot) {
                j++;
            }
            if (i < j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
            i++;
            j++;
        }

        if (i < right) {
            sort(a, i, right);
        }
        if (j > left) {
            sort(a, left, j);
        }
    }

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }


    public static void main(String[] args) {

        int[] a = {9, 6, 5, 7, 3, 4};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);

    }
}
