public class ShellSortStrategy extends SortStrategy {
    public void sort(MyList lista) {
        System.out.println("Ordenação ShellSort");
        int[] arr = lista.getData();
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
