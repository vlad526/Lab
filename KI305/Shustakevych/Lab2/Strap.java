package KI305.Shustakevych.Lab2;

/**
 * Клас {@code Strap} представляє ремінь протигазу.
 */
public class Strap {
    private String material;
    private int length;
    
    /**
     * Конструктор за замовчуванням, який створює ремінь з матеріалу "Нейлон" та довжини 45 см.
     */
    public Strap() {
        this("Нейлон", 45);
    }

    /**
     * Конструктор для створення ременя з вказаним матеріалом та довжиною.
     *
     * @param material Матеріал ременя.
     * @param length   Довжина ременя в сантиметрах.
     */
    public Strap(String material, int length) {
        this.material = material;
        this.length = length;
    }

    /**
     * Повертає матеріал ременя.
     *
     * @return Матеріал ременя.
     */
    public String getMaterial() { return material; }

    /**
     * Встановлює матеріал ременя.
     *
     * @param material Новий матеріал ременя.
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Повертає довжину ременя.
     *
     * @return Довжина ременя в сантиметрах.
     */
    public int getLength() { return length; }

    /**
     * Встановлює довжину ременя.
     *
     * @param length Нова довжина ременя в сантиметрах.
     */
    public void setLength(int length) { this.length = length; }

    /**
     * Регулює довжину ременя.
     *
     * @param adjustment Величина регулювання (в см).
     */
    public void adjustLength(int adjustment) { this.length += adjustment; }

    @Override
    public String toString() {
        return "Strap{material='" + material + "', length=" + length + "}";
    }
}
