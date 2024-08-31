/**
 * Генерация случайных чисел (в интервале [0, 1]), а также символов в интервале
 * от char1 до char2, целых чисел в интервале от val1 до val2 с помощью
 * соответствующих методов
 *
 * @author Aliunina P.A.
 * @author Vedrov Z.A.
 * @version 1
 */
public class RandomCharacter {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(Math.random());
        System.out.println(getRandomCharacter('f', 'h'));
        System.out.println(getRandomCharacter('A', 'Z'));
        System.out.println(getRandomLowerCaseLetter());
        System.out.println(getRandomDigitCharacter());
        System.out.println(getRandomCharacter());
        System.out.println(getRandomCharacter(0, 5));
        System.out.println(getRandomCharacter(-100, 100));

        System.out.println("/nЗадание 2");
        int[] list = new int[50];
        for (int i = 0; i < 50; i++) {
            list[i] = getRandomCharacter(0, 100);
        }
        System.out.println(linearSearch(list, 6));
    }
/**
 * Генерируем случайным образом символы между ch1 и ch2
 * @param ch1 первый параметр типа char
 * @param ch2 второй параметр типа char
 * @return возвращаемый результат типа char
 */
public static char getRandomCharacter(char ch1, char ch2){
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
}

    /**
 * Генерируем случайным образом числа между do1 и do2
 * @param do1 первый параметр типа double
 * @param do2 второй параметр типа double
 * @return возвращаемый результат типа int
 */
public static int getRandomCharacter(int do1, int do2){
    return (int) (do1 + Math.random() * (do2 - do1 + 1));
}

    /**
 * Генерируем случайный символ верхнего регистра
 * @return случайный символ верхнего регистра типа char
 */
public static char getRandomLowerCaseLetter(){
    return  getRandomCharacter('a', 'z');
}
/**
 * Генерируем случайный символ верхнего регистра
 * @return случайный символ верхнего регистра типа char
 */
public static char getRandomDigitCharacter(){
    return  getRandomCharacter('0', '9');
}
/**
 * Генерируем случайный символ
 * @return случайный символ типа char
 */
public static char getRandomCharacter(){
    return  getRandomCharacter('\u0000', '\uFFFF');
}
/**
 * Метод, осуществляющий линейный поиск заданного элемента (числа) в массиве.
 * @param list входной массив целых чисел
 * @param key заданный элемент для поиска
 * @return возвращаемое значение
 */
public static int linearSearch(int[] list, int key){
    for(int i = 0; i < list.length; i++)
        if (key == list[i])
            return i;
        return -1;
}
}