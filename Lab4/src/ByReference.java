public class ByReference {
    public static void main(String[] args) {
// пример 1: обмен местами элементов массива
// объявляем и конструируем массив var
        int[] var = new int[4];
// инициализируем массив var
        var[0] = 3;
        var[1] = -7;
        var[2] = 9;
        var[3] = 18;
        System.out.println("Элементы массива до обмена:" +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);
        swap(var, 1, 2);
        System.out.println("Элементы массива после обмена:" +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);
    }

    // меняет местами элементы массива arr[i] и arr[j]
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
