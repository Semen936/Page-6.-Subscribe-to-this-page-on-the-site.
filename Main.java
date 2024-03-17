
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14};
        printArray(array);
        System.out.println();
        System.out.println(getIndex(array, 15));
    }
    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    private static int getIndex(int[] array, int findNumber) {
        int result = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high - low) / 2;
            if (array[middle] < findNumber) {
                low = middle + 1;
            } else if (array[middle] > findNumber) {
                high = middle - 1;
            } else if (array[middle] == findNumber) {
                result = middle;
                break;
            }
        }
        return result;
    }
}