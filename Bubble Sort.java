public static void bubbleSort(int[] Numeros) {
    int i, j, aux;
    for (i = 0; i < Numeros.length - 1; i++) {
        for (j = 0; j < Numeros.length - 1 - i; j++) {
            if (Numeros[j] > Numeros[j + 1]) {
                aux = Numeros[j];
                Numeros[j] = Numeros[j + 1];
                Numeros[j + 1] = aux;
            }
        }
    }
}