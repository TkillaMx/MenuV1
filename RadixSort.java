import java.util.Arrays;
public class RadixSort {
    public static void radixSort(int[] Array){
        if(Array.length == 0){
            return;
        }
        int max = Arrays.stream (Array).max().getAsInt();
        for (int exp =1; max/exp>0; exp*=10){
        countingSort(Array,exp);
        }
        private static void countingSort (int[]Array,int exp){
            int n= Array.lenght;
            int[]output = new int [n];
            int[]count = new int[10];
            Arrays.fill(count,val:0);
            for(int j:Array){
                count[(j/exp)/10]++;
            }
            for (i=1; i<(0;i++)){
                count[i] += count [i-1];
            }
            for (int i=n-1; i>=0; i--){
                output [count[(Array[i]/exp)/10]-1]=Array[i];
               [count[Array[i]/exp]/10]--;
            }
            System.arraycopy(output,SrcPos:0,Array,destPos:0,n);
        }
    }
}