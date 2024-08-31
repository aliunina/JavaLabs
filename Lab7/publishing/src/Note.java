/* Класс "Note" содержит описание публикуемого материала.
 * @author Алюнина Полина
 * @version 1.0
*/

public class Note {
    private int numberNote;   // порядковый номер материала
    private static int lastNumberNote = 0;  // последний порядковый номер
    private String noteTitle;   // название материала
    private String authorNote;   // автор материала
    private double numberAuthorsSheets;   // количество авторских листов

    /**
     * Конструктор для создания экземпляра публикуемого материала
     * @param noteTitle ‐ название материала
     * @param authorNote ‐ автор материала
     * @param numberAuthorsSheets ‐ количество авторских листов
     */
    public Note(String noteTitle, String authorNote,
                double numberAuthorsSheets) {
        numberNote = ++lastNumberNote; // создаем порядковый номер
        this.noteTitle = noteTitle;
        this.authorNote = authorNote;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    public static int getLastNumberNote() {
        return lastNumberNote;
    }

    public int getNumberPages() {
        return (int) Math.round(this.numberAuthorsSheets * 40000 / 3700);
    }

    public String getAuthorNote() {
        return this.authorNote;
    }

    public String getNoteTitle() {
        return this.noteTitle;
    }

    /**
     * Метод, формирующий информацию о публикуемом материале
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = this.numberNote + " " + this.authorNote + " " +
                this.noteTitle + ", авт. листов: " + this.numberAuthorsSheets;
        return str;
    }
}
