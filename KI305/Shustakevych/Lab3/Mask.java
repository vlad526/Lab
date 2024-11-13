package KI305.Shustakevych.Lab3;

/**
 * Клас {@code Mask} представляє маску протигазу.
 */
public class Mask {
    private String material;
    private String type;

    /**
     * Конструктор за замовчуванням, який створює маску з матеріалу "Гума" та типу "Напівмаска".
     */
    public Mask() {
        this("Гума", "Напівмаска");
    }

    /**
     * Конструктор для створення маски з вказаним матеріалом та типом.
     *
     * @param material Матеріал маски.
     * @param type     Тип маски.
     */
    public Mask(String material, String type) {
        this.material = material;
        this.type = type;
    }

    /**
     * Повертає матеріал маски.
     *
     * @return Матеріал маски.
     */
    public String getMaterial() { return material; }

    /**
     * Встановлює матеріал маски.
     *
     * @param material Новий матеріал маски.
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Повертає тип маски.
     *
     * @return Тип маски.
     */
    public String getType() { return type; }

    /**
     * Встановлює тип маски.
     *
     * @param type Новий тип маски.
     */
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Mask{material='" + material + "', type='" + type + "'}";
    }
}