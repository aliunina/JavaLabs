public class arrayBubbleSort {
    /**
     * Метод сортировки массива по возрастанию
     *
     * @param array массив целых чисел
     * @return обработанный массив целых чисел по возрастанию
     */
    public static int[] arrayBubbleSortUp(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
    /**
     * Метод сортировки массива по убываню
     * @param array массив целых чисел
     * @return обработанный массив целых чисел по убыванию
     */
    public static int[] arrayBubbleSortDown(int[] array){
            for (int k = 0; k < array.length; k++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
            return array;
    }
    /**
     * Метод для вывода массива
     * @param array массив целых чисел
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
    }
}
