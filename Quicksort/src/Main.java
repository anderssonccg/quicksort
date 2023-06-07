

/**
 * @author anderssonccg | anderssoncamilocg@ufps.edu.co
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {6, 9, 3, 2, 4, 1, 8, 5, 7, 10};
        System.out.println("Array sin ordenar: ");
        imprimirArray(arr);

        quickSort(arr);

        System.out.println("Array ordenado: ");
        imprimirArray(arr);
    }
    
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int pivote = dividir(arr, izq, der);
            quickSort(arr, izq, pivote - 1);
            quickSort(arr, pivote + 1, der);
        }
    }

    private static int dividir(int[] arr, int izq, int der) {
        int pivote = arr[der];
        int i = izq - 1;

        for (int j = izq; j < der; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }

        intercambiar(arr, i + 1, der);
        return i + 1;
    }

    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void imprimirArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
        }
    }
}
