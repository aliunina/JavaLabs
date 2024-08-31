/* Класс "Magazine" содержит описание журнала.
 * @author Алюнина Полина
 * @version 1.0
*/

public class Magazine {
    private String magazineTitle;   // название журнала
    private int numberMagazine;   // номер выпуска
    private int publishingYear;   // Год издания
    private Note[] notes;   // массив статей
    public Contents contents;   //оглавление журнала
    private String publishingHouse;   // Издательство
    private String publishingLocation;   // Город
    private int numberPage;   // Кол‐во страниц

    public Magazine(String magazineTitle, int numberMagazine, int publishingYear,
        Note[] notes, String publishingHouse, String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.contents = new Contents(notes);
        this.numberPage = this.contents.getNumberPages();
    }

    public String getMagazineTitle() {
        return this.magazineTitle;
    }

    public int getNumberMagazine() {
        return this.numberMagazine;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Note[] getNotes() {
        return this.notes;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public String getPublishingLocation() {
        return this.publishingLocation;
    }

    public int getNumberPage() {
        return this.numberPage;
    }

    /**
     * Метод для изменения массива статей журнала
     * @param notes the notes to set
     */
    public void setNotes(Note[] notes) {
        this.notes = notes;
        this.contents.createContents(notes);
        this.numberPage = this.contents.getNumberPages();
    }

    /**
     * Метод, формирующий информацию о журнале
     * @return str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = "Журнал " + this.magazineTitle + " № " +
            this.numberMagazine + " " + this.publishingYear + ". ‐ "
            + this.publishingLocation + ".: " + this.publishingHouse;
        str += this.contents.toString();
        return str;
    }


}
