public class RotatingSLList<T> extends SLList<T> {
    public void rotateRight() {
        T tmpElement = removeLast();
        addFirst(tmpElement);
    }
}
