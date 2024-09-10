package generic;

class ArrayProcessor<P extends Comparable<P>> implements ArrayOperations<P> {
    public P findMax(P[] array) {
        P max = array[0];
        for (P element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public P findMin(P[] array) {
        P min = array[0];
        for (P element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}
