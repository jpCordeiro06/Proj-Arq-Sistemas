import java.util.Arrays;

public class MyList {
    private SortStrategy strategy;
    private int[] data;

    public MyList() {
        this.strategy = new QuickSortStrategy();
        this.data = new int[]{5, 2, 9, 1, 7}; // exemplo inicial
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void sort() {
        System.out.println("\nAntes da ordenação: " + Arrays.toString(data));
        strategy.sort(this);
        System.out.println("Depois da ordenação: " + Arrays.toString(data));
    }
}
