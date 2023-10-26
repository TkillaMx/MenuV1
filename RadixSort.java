public class RadixSort
{
public static void RadixSort (int[] Array) {
        if (Array.length == 0) {
            return;
        }
        int max = Arrays.stream(Array).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(Array, exp);
        }
    }

    private static void countingSort(int[] Array, int exp) {
        int n = Array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int j : Array) {
            count[(j / exp) % 10]++;
        }
        for (int i=1; i<10;i++){
            count[i] += count [i-1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(Array[i] / exp) % 10] - 1] = Array[i];
            count[(Array[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, Array, 0, n);}
    }