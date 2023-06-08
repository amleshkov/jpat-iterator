import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {
        public RandomIterator() {
        }
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public Object next() {
            return random.nextInt(max + 1 - min) + min;
        }
    }
}