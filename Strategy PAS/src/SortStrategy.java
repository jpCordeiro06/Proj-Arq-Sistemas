public abstract class SortStrategy {
    public abstract void sort(MyList lista);

    // Método auxiliar opcional para troca de posições
    protected void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
