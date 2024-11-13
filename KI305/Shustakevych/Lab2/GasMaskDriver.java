package KI305.Shustakevych.Lab2;

import java.io.IOException;


/**
 * Клас {@code GasMaskDriver} є точкою входу для програми, яка імітує роботу протигазу.
 */
public class GasMaskDriver {
    /**
     * Головний метод.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
           GasMask gasMask = new GasMask("ГП-5", true, 10);
           gasMask.checkSeal();
           gasMask.changeFilter(new Filter());
           gasMask.adjustStrap(2);
           gasMask.checkFilterExpiration();
           gasMask.getProtectionLevel();
           gasMask.isCompatibleWithFilter("ГП-5");
           gasMask.estimateFilterLife();
           gasMask.isSuitableForEnvironment("Хімічний");
           gasMask.checkOverallCondition();
           gasMask.cleanGasMask();

           gasMask.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}
