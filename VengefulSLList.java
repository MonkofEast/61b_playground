public class VengefulSLList<T> extends SLList<T> {
    /** properties */
    SLList<T> deletedItems;
    /** construct */
    public VengefulSLList() {
        deletedItems = new SLList();
    }
    /** funcs */
    public void printLostItems() {
        deletedItems.print();
    }
    @Override
    public T removeLast() {
        T tmpItem = super.removeLast();
        deletedItems.addLast(tmpItem);
        return tmpItem;
    }
    /** main */
    public static void main(String[] args) {
        VengefulSLList<Integer> bench = new VengefulSLList<>();
        bench.addLast(1);
        bench.addLast(2);
        bench.addLast(3);
        bench.removeLast();
        bench.removeLast();
        bench.printLostItems();
    }
}
