public class MyIntArrayList {
    private int capacity;
    private int currentIdx;
    private int[] items;

    public MyIntArrayList() {
        this.capacity = 10;
        this.currentIdx = 0;
        this.items = new int[this.capacity];
    }

    public MyIntArrayList(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int getCurrentIdx() {
        return currentIdx;
    }

    public void setCurrentIdx(int currentIdx) {
        this.currentIdx = currentIdx;
    }

    public void add(int item) {
        if (this.currentIdx == this.capacity - 1) {
            this.increaseCapacity();
        }

        this.items[this.currentIdx] = item;
        this.currentIdx++;
    }

    public void add(int idx, int item) {
        if (this.currentIdx == this.capacity - 1) {
            this.increaseCapacity();
        }

        // if idx was greater than currentIdx, put new item in currentIdx position.
        if (idx >= this.currentIdx) {
            this.items[this.currentIdx] = item;
        } else {
            // current value of index, to replace in the next index.
            int tmp = this.items[idx];

            // put the new value in the index.
            this.items[idx] = item;

            // update the indexes after idx updated.
            for (int i = idx + 1; i < this.items.length; i++) {
                int aux = this.items[i];
                this.items[i] = tmp;
                tmp = aux;
            }
        }
        this.currentIdx++;
    }

    public boolean removeByItem(int item) {
        for (int i = 0; i < this.items.length; i++) {

        }
        return false;
    }

    private void increaseCapacity() {
        this.capacity *= 2;
        int[] tmp = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            tmp[i] = this.items[i];
        }

        this.items = tmp;
    }
}
