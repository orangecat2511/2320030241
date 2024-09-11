package generic;

public class Main {
    public static void main(String[] args) {
        // Create an instance of BubbleSort for sorting arrays
        BubbleSort<Integer> intSorter = new BubbleSort<>();
        BubbleSort<Double> doubleSorter = new BubbleSort<>();
        BubbleSort<String> stringSorter = new BubbleSort<>();

        // Integer array
        Integer[] intArray = {5, 1, 4, 2, 8};
        System.out.println("Before sorting Integer array:");
        PrintArray.printArray(intArray);
        intSorter.bubbleSort(intArray);
        System.out.println("After sorting Integer array:");
        PrintArray.printArray(intArray);

        // Double array
        Double[] doubleArray = {3.3, 1.1, 2.2, 5.5, 4.4};
        System.out.println("\nBefore sorting Double array:");
        PrintArray.printArray(doubleArray);
        doubleSorter.bubbleSort(doubleArray);
        System.out.println("After sorting Double array:");
        PrintArray.printArray(doubleArray);

        // String array
        String[] strArray = {"Banana", "Apple", "Grape", "Mango", "Orange"};
        System.out.println("\nBefore sorting String array:");
        PrintArray.printArray(strArray);
        stringSorter.bubbleSort(strArray);
        System.out.println("After sorting String array:");
        PrintArray.printArray(strArray);
    }
}
