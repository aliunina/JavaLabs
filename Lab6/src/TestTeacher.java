/**
 * Класс для тестирования класса Teacher
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */

public class TestTeacher {
    // Метод Main
    public static void main(String[] args) {
        // Создаём ссылочную переменную teacherOne типа Teacher.
        // Создаём новый объект типа Teacher.
        // Присваиваем в переменную teacherOne ссылку на новосозданный объект.
        Teacher teacherOne = new Teacher();

        // добавляем коды курсов для объекта teacherOne
        teacherOne.addCourse(1);
        teacherOne.addCourse(1);
        teacherOne.addCourse(2);
        teacherOne.addCourse(3);
        teacherOne.addCourse(3);
        teacherOne.addCourse(4);
        teacherOne.addCourse(5);
        teacherOne.addCourse(6);
        teacherOne.addCourse(6);

        // удаляем коды курсов у объекта teacherOne
        teacherOne.deleteCourse(1);
        teacherOne.deleteCourse(3);
        teacherOne.deleteCourse(6);


        // Создаём ссылочную переменную teacherTwo типа Teacher.
        // Создаём новый объект типа Teacher.
        // Присваиваем в переменную teacherTwo ссылку на новосозданный объект.
        Teacher teacherTwo = new Teacher();

        // добавляем коды курсов для объекта teacherOne
        teacherTwo.addCourse(7);
        teacherTwo.addCourse(8);
        teacherTwo.addCourse(8);
        teacherTwo.addCourse(9);
        teacherTwo.addCourse(10);
        teacherTwo.addCourse(11);
        teacherTwo.addCourse(11);
        teacherTwo.addCourse(12);

        // удаляем коды курсов у объекта teacherOne
        teacherTwo.deleteCourse(8);
        teacherTwo.deleteCourse(11);

        // метод toString
        System.out.println(teacherOne.toString());
        System.out.println(teacherTwo.toString());
    }
}
