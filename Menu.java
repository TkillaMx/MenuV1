import java.util.Arrays;
import java.util.Scanner;

public class Menu{
    /**
     * @param Args
     */
    public static void main (String []Args){
        System.out.println("-----MENU-----");
        System.out.println("[1] Blubble Sort");
        System.out.println("[2] Blubble Sort 2");
        System.out.println("[3] Selection Sort");
        System.out.println("[4] Quick Sort");
        System.out.println("[5] ShellSort");
        System.out.println("[6] RadixSort");
        System.out.println("[0] Exit");

        System.out.println("Option: ");
        
        Scanner sc = new Scanner (System.in);
        int option = sc.nextInt();
        int[] arreglo = {24,13,15,9,1,7};
{
        if (option == 0) {
            System.out.println("See you later lil Nigga");
        }

        if (option == 1) {
            System.out.println("Bubble Sort");

        printArray(arreglo);
        bubbleSort(arreglo);
        printArray(arreglo);
        sc.close();
    
        }

        if (option == 2) {
            System.out.println("Bubble Sort 2");

        printArray(arreglo);
        bubbleSort2(arreglo);
        printArray(arreglo);
        }

        if (option == 3) {
            System.out.println("Selection Sort");   
            
        printArray(arreglo);
        SelectionSort(arreglo);
        printArray(arreglo);
        }

         if (option == 4) {
            System.out.println("Quick Sort");  
        printArray(arreglo);
        //QuickSort(arreglo);//
        printArray(arreglo);  
        }

         if (option == 5) {
            System.out.println("ShellSort");  
        printArray(arreglo);
        //ShellSort(arreglo);//
        printArray(arreglo);  
        }  
        }

         if (option == 6) {
            System.out.println("RadixSort");    
        printArray(arreglo);
        RadixSort(arreglo);
        printArray(arreglo);  
        }
     }

    
        public static void bubbleSort(int[] Numeros){
            int i,j,aux;
            for(i=0;i<Numeros.length-1;i++){

                for(j=0;j<Numeros.length-1-i;j++){

                    if(Numeros[j]>Numeros[j+1]){

                        aux=Numeros[j];
                        Numeros[j]=Numeros[j+1];
                        Numeros[j+1]=aux;

                    }
                }
            }     
        }

        public static void bubbleSort2(int[] Numeros) {
        int n = Numeros.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (Numeros[j] > Numeros[j+1]) {
                    int temp = Numeros[j];
                    Numeros[j] = Numeros[j+1];
                    Numeros[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void SelectionSort(int[] Numeros) {
        int n = Numeros.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (Numeros[j] < Numeros[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = Numeros[minIdx];
            Numeros[minIdx] = Numeros[i];
            Numeros[i] = temp;
        }
    }

    public static void QuickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = partir(arreglo, izquierda, derecha);
            QuickSort(arreglo, izquierda, pivote - 1);
            QuickSort(arreglo, pivote + 1, derecha);
        }
    }

    public static int partir(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[derecha];
        int i = izquierda;

        for (int j = izquierda; j < derecha; j++) {
            if (arreglo[j] < pivote) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                i++;
            }
        }

        int temp = arreglo[i];
        arreglo[i] = arreglo[derecha];
        arreglo[derecha] = temp;

        return i;
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
    
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                    
                }
                arr[j] = temp;
                
            }
            gap = gap / 2;
        }
    }
    public static void RadixSort(int[] Array) {
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
        System.arraycopy(output, 0, Array, 0, n);
    }


        public static void printArray (int[] arr){
            for (int value : arr){
            System.out.print(value + " ");
            }
            System.out.println();
        }
    }