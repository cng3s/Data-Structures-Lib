public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capcity) { array = new Array<>(capcity); }

    public ArrayStack() { array = new Array<>(); }

    @Override
    public boolean isEmpty() { return array.isEmpty(); }

    @Override
    public int getSize() { return array.getSize(); }

    public int getCapcity() { return array.getCapcity(); }

    @Override
    public void push(E e) { array.addLast(e); }

    @Override
    public E pop() { return array.removeLast(); }

    @Override
    public E peek() { return array.getLast(); }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        int size = array.getSize();
        for (int i = 0; i < size; i ++) {
            res.append(array.get(i));
            if (i != size - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
