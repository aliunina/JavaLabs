/* Класс "Publishing" реализует основную логику проекта.
 * @author Алюнина Полина
 * @version 1.0
*/

public class Publishing {
    private static final String PUBLISHING_HOUSE = "Эрудит";
    private static final String PUBLISHING_LOCATION = "Мн";

    public static void main(String[] args) {
        Note noteVasilev1 =
                new Note("Создание классов в Java","Васильев П.И.", 3.6);
        Note noteVasilev2 =
                new Note("Среда NetBeans","Васильев П.И.", 2.8);

        System.out.println("\nЖурналы:");
        Note notes [] = new Note [10]; // массив статей
        notes[0] = noteVasilev1;
        notes[1] = noteVasilev2;
        Magazine magazine =
            new Magazine("Программирование", 1, 2016,
                notes, PUBLISHING_HOUSE, PUBLISHING_LOCATION);
        System.out.println(magazine.toString());

        System.out.println("Всего страниц: " + magazine.getNumberPage());
    }
}
