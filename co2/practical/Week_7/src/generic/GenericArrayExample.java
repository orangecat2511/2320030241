package generic;

public class GenericArrayExample {
    public static void main(String[] args) {
       
        Integer[] intArray = {3, 5, 7, 2, 8};
        ArrayProcessor<Integer> intProcessor = new ArrayProcessor<>();
        System.out.println("Integer Array: ");
        System.out.println("Max: " + intProcessor.findMax(intArray));
        System.out.println("Min: " + intProcessor.findMin(intArray));

       
        Float[] floatArray = {4.5f, 2.3f, 7.8f, 1.2f};
        ArrayProcessor<Float> floatProcessor = new ArrayProcessor<>();
        System.out.println("\nFloat Array: ");
        System.out.println("Max: " + floatProcessor.findMax(floatArray));
        System.out.println("Min: " + floatProcessor.findMin(floatArray));

        
        String[] stringArray = {"apple", "orange", "banana", "pear"};
        ArrayProcessor<String> stringProcessor = new ArrayProcessor<>();
        System.out.println("\nString Array: ");
        System.out.println("Max: " + stringProcessor.findMax(stringArray));
        System.out.println("Min: " + stringProcessor.findMin(stringArray));

   
        Character[] charArray = {'c', 'a', 'e', 'b'};
        ArrayProcessor<Character> charProcessor = new ArrayProcessor<>();
        System.out.println("\nCharacter Array: ");
        System.out.println("Max: " + charProcessor.findMax(charArray));
        System.out.println("Min: " + charProcessor.findMin(charArray));
    }
}
