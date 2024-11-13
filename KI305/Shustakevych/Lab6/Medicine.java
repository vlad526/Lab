package KI305.Shustakevych.Lab6;


/**
 * Клас, що представляє медикаменти
 */
class Medicine implements Comparable<Medicine> {
    private String name;
    private double price;
    private String expiryDate;

    /**
     * Конструктор класу Medicine
     * @param name назва медикаменту
     * @param price ціна
     * @param expiryDate термін придатності
     */
    public Medicine(String name, double price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Medicine{name='" + name + "', price=" + price + ", expiryDate='" + expiryDate + "'}";
    }

    @Override
    public int compareTo(Medicine other) {
        return Double.compare(this.price, other.price);
    }
}
