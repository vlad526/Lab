package KI305.Shustakevych.Lab2;

/**
 * Клас {@code Filter} представляє фільтр для протигазу.
 */
public class Filter {
    private String type;
    private int remainingLife;

    /**
     * Конструктор за замовчуванням, який створює фільтр типу "P3" з залишковим ресурсом 100%.
     */
    public Filter() {
        this("P3", 100);
    }

    /**
     * Конструктор для створення фільтра з вказаним типом та залишковим ресурсом.
     *
     * @param type          Тип фільтра.
     * @param remainingLife Залишковий ресурс фільтра у відсотках.
     */
    public Filter(String type, int remainingLife) {
        this.type = type;
        this.remainingLife = remainingLife;
    }

    /**
     * Повертає тип фільтра.
     *
     * @return Тип фільтра.
     */
    public String getType() { return type; }

    /**
     * Встановлює тип фільтра.
     *
     * @param type Новий тип фільтра.
     */
    public void setType(String type) { this.type = type; }

    /**
     * Повертає залишковий ресурс фільтра.
     *
     * @return Залишковий ресурс фільтра у відсотках.
     */
    public int getRemainingLife() { return remainingLife; }

    /**
     * Встановлює залишковий ресурс фільтра.
     *
     * @param remainingLife Новий залишковий ресурс фільтра у відсотках.
     */
    public void setRemainingLife(int remainingLife) { this.remainingLife = remainingLife; }

    /**
     * Перевіряє, чи є фільтр придатним для використання.
     *
     * @return true, якщо фільтр придатний (залишковий ресурс більше 0), інакше false.
     */
    public boolean isValid() { return remainingLife > 0; }

    @Override
    public String toString() {
        return "Filter{type='" + type + "', remainingLife=" + remainingLife + "}";
    }
}
