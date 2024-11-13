package KI305.Shustakevych.Lab6;

/**
 * Клас, що представляє журнал
 */
class Magazine implements Comparable<Magazine> {
    private String title;
    private int year;
    private int pages;

    /**
     * Конструктор класу Magazine
     * @param title назва журналу
     * @param year рік видання
     * @param pages кількість сторінок
     */
    public Magazine(String title, int year, int pages) {
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Magazine{title='" + title + "', year=" + year + ", pages=" + pages + "}";
    }

    @Override
    public int compareTo(Magazine other) {
        return Integer.compare(this.year, other.year);
    }
}

