import java.util.ArrayList;
import java.util.Scanner;

/**
 * класс Teacher - является подклассом суперкласса Person
 * Используется динамический массив ArrayList
 * Метод toString
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */

public class Teacher extends Person {
    Scanner input = new Scanner(System.in);

    // объявление переменной numberOfCourses (количество текущих преподаваемых курсов)
    private int numberOfCourses;

    // объявление переменной maxNumberOfCourses (максимальное количество курсов)
    private int maxNumberOfCourses;

    // объявляем и конструируем массив courses
    private ArrayList<Integer> codesCourses = new ArrayList<Integer>();

    /*
    Конструктор по умолчанию
    в котором инициализируем максимальное количество курсов
    вызывается конструктор поумолчания суперкласса Person()
    */
    public Teacher() {
        // вызывается конструктор поумолчания суперкласса Person
        super();

        setMaxNumberOfCourses();
    }

    // добавление курса по значению его кода
    public void addCourse(int code) {
        // проверяем размерность массива codesCourses
        if (!(getMaxNumberOfCourses() == codesCourses.size()))
            // проверяем, есть ли уже такой курс в списке
            if (!codesCourses.contains(code)) {
                //добавляем код курса по значению
                codesCourses.add(code);

                System.out.println("Добавлен курс с кодом \"" + code + "\" !");
            } else
                System.out.println("Курс с кодом \""  + code + "\" уже существует!");

    }

    // удаление курса по его коду
    public void deleteCourse(int code) {
        // проверяем, есть ли уже такой курс в списке
        if (codesCourses.contains(code)) {
            //находим индекс кода курса, который хотим удалить
            int index = codesCourses.indexOf(code);
            // удаление кода курса по его индексу
            codesCourses.remove(index);

            System.out.println("Удален курс с кодом \"" + code + "\" !");
        }
    }

    // setter переменной numberOfCourses
    public void setNumberOfCourses(int num) {
        numberOfCourses = num;
    }

    // getter переменной numberOfCourses
    public int getNumberOfCourses() {
        return codesCourses.size();
    }

    // setter переменной maxNumberOfCourses
    public void setMaxNumberOfCourses() {
        System.out.print("Введите максимальное количество курсов: ");
        maxNumberOfCourses = input.nextInt();;
    }

    // getter переменной maxNumberOfCourses
    public int getMaxNumberOfCourses() {
        return maxNumberOfCourses;
    }

    // Метод toString
    @Override
    public String toString() {
        return "\n" + getName()
                + "\tкол-во текущих курсов: " + getNumberOfCourses()
                + "; коды курсов: " + codesCourses.toString()  // выводим коды курсов
                + "; максимальное кол-во курсов:  " + getMaxNumberOfCourses()
                + "; адрес: " + getAddress();
    }
}
