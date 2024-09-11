package generics;

class BinarySearch<T extends Comparable<T>> {
    public int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(array[mid]);
            if (comparison == 0) {
                return mid;
            }
            else if (comparison > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
