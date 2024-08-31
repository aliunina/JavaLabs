/* Класс "Contents" содержит массив, необходимый для
 * вывода оглавления журнала, оглавление формируется в методе createContents
 * @author Алюнина Полина
 * @version 1.0
*/

public class Contents {
    private Note notes[];   // массив статей
    private int pageNumberNote[][];   // массив номеров страниц
    private int numberPage;   // текущий номер страницы

    /**
     * Конструктор для создания содержания журнала
     * @param notes ‐ массив статей
     */
    public Contents(Note[] notes) {
        this.notes = notes;
        // Массив pageNumberNote содержит для каждого материала:
        // 1. Номер начальной страницы материала
        // 2. Кол‐во страниц, необходимых для размещения материала
        this.pageNumberNote = new int [notes.length] [2];
        createContents(notes);
    }

    /**
     * Метод формирования оглавления
     */
    public void createContents(Note[] notes){
        int i;
        // Очистка оглавления
        for (i = 0; i < notes.length; i++){
            this.pageNumberNote[i][0] = 0;
            this.pageNumberNote[i][1] = 0;
        }
        // первая страница ‐ титульная
        // вторая страница содержит оглавление
        // материалы начинаются с третьей страницы
        this.numberPage = 3;
        i = 0;
        while (notes[i] != null) {
            this.pageNumberNote[i][0] = this.numberPage; // начальный номер
            // объем материала
            this.pageNumberNote[i][1] = notes[i].getNumberPages();
            // корректировка текущего номера страниц
            this.numberPage += this.pageNumberNote[i][1];
            i++;
        }
    }

    /**
     * Метод подсчета общего количества страниц в журнале
     * @return int ‐ Кол‐во страниц
     */
    public int getNumberPages() {
        return this.numberPage - 1;
    }

    /**
     * Метод, выводящий оглавление
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = "\nСодержание:";
        int i = 0;
        while (this.notes[i] != null){
            str += "\n" + (i + 1) + " " + this.notes[i].getAuthorNote() +
                " " + this.notes[i].getNoteTitle() + "\t" + this.pageNumberNote[i][0];
            i++;
        }
        return str;
    }
}
