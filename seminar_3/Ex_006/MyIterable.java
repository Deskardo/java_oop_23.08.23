package seminar_3.Ex_006;

import java.util.Iterator;

public class MyIterable implements Iterable<Integer> {

    private int[] data;

    public MyIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }
    
    private class MyIterator implements Iterator<Integer> {
        private int index = 0;

        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Integer next() {
            return data[index++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        MyIterable iterable = new MyIterable(numbers);

        for (int num : iterable) {
            System.out.println(num);
        }
    }

}
