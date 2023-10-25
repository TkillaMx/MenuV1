public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        int forComparisons = 0;
        int whileComparisons = 0;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                    whileComparisons++;
                }
                arr[j] = temp;
                forComparisons++; 
            }
            gap = gap / 2;
        }
        System.out.println("Comparaciones en el bucle for: " + forComparisons);
        System.out.println("Comparaciones en el bucle while: " + whileComparisons);
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 0, 7, 9, 5, 4, 6, 2, 3};
        shellSort(arr);
        System.out.println("Arreglo ordenado:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}