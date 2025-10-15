public class HeapSortStrategy extends SortStrategy {
    @Override
    public void sort(MyList lista) {
        System.out.println("Ordenação HeapSort");
        int[] arr = lista.getData();
        int n = arr.length;

        // Constroi heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extrai elementos da heap um por um
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esq < n && arr[esq] > arr[maior])
            maior = esq;

        if (direita < n && arr[direita] > arr[maior])
            maior = direita;

        if (maior != i) {
            swap(arr, i, maior);
            heapify(arr, n, maior);
        }
    }
}
