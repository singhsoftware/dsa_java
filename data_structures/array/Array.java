package data_structures.array;

public class Array {

    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insertItem(int item) {
        if (items.length <= count) {

            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;

        }

        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }

        }
        return -1;
    }

    public int max() {

        double maxValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < count; i++) {
            double valueInDecimal = (double) items[i];
            if (valueInDecimal > maxValue) {
                maxValue = valueInDecimal;
            }
        }

        return (int) maxValue;

    }
}
