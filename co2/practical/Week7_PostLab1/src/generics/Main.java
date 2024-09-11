package generics;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 3, 5, 7, 9, 11};
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        int intIndex = intSearch.binarySearch(intArray, 7);
        System.out.println("Integer array: Element 7 found at index " + intIndex);
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        int doubleIndex = doubleSearch.binarySearch(doubleArray, 4.4);
        System.out.println("Double array: Element 4.4 found at index " + doubleIndex);
        String[] strArray = {"Apple", "Banana", "Grapes", "Mango", "Orange"};
        BinarySearch<String> stringSearch = new BinarySearch<>();
        int stringIndex = stringSearch.binarySearch(strArray, "Mango");
        System.out.println("String array: Element 'Mango' found at index " + stringIndex);
    }
}