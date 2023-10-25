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