import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
        int[] intArray2;
        int[][] intArrayMultiDime;

        intArray2 = new int[]{Arrays.binarySearch(intArray, 3)};
        System.out.println(Arrays.toString(intArray2));

        intArray2 = new int[]{Arrays.binarySearch(intArray,0, 4, 2)};
        System.out.println(Arrays.toString(intArray2));

        Object[] objectArray = Arrays.stream(intArray2).boxed().toArray();
        intArray2 = new int[]{Arrays.deepHashCode(objectArray)};
        System.out.println(Arrays.toString(intArray2));

        intArrayMultiDime = new int[][]{Arrays.copyOfRange(intArray, 0, 4)};
        System.out.println(Arrays.deepToString(intArrayMultiDime));

        Integer[] integerArray = new Integer[]{1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(integerArray);
        integerStream.forEach(Integer -> System.out.println(Integer + "."));

        intArray = getRandomArray(10);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        intArray2 = new int[10];
        System.out.println(Arrays.toString(intArray2));
        Arrays.fill(intArray2, 5);
        System.out.println(Arrays.toString(intArray2));

        System.out.println("----------------------------------------1-");
        int[] newIntArray1 = getRandomArray(10);
        System.out.println(Arrays.toString(newIntArray1));
        int[] newIntArray2 = getRandomArray(10);
        System.out.println(Arrays.toString(newIntArray2));
        System.out.println("----------------------------------------2-");
        newIntArray1 = Arrays.copyOf(newIntArray2, newIntArray2.length);
        System.out.println(Arrays.toString(newIntArray1));
        System.out.println(Arrays.toString(newIntArray2));
        System.out.println("----------------------------------------3-");
        Arrays.sort(newIntArray2);
        System.out.println(Arrays.toString(newIntArray1));
        System.out.println(Arrays.toString(newIntArray2));
        System.out.println("--------------------------------------end-");

        int[] smallerArray = Arrays.copyOf(newIntArray2, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(newIntArray2, 15);
        System.out.println(Arrays.toString(largerArray));

        
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newIntArray = new int[len];
        for(int i = 0; i < len; i++){
            newIntArray[i] = random.nextInt(100);
        }
        return newIntArray;
    }
}
