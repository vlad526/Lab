package KI305.Shustakevych.Lab3;

import java.io.IOException;

/**
 * Клас {@code GasMaskDriver} є точкою входу для програми, яка імітує роботу протигазу.
 */
public class CommanderGasMaskDriver {
    /**
     * Головний метод.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            CommanderGasMask commanderGasMask = new CommanderGasMask("КП-5", true, 15);
            commanderGasMask.checkSeal();
            commanderGasMask.changeFilter(new Filter());
            commanderGasMask.adjustStrap(2);
            commanderGasMask.checkFilterExpiration();
            commanderGasMask.getProtectionLevel();
            commanderGasMask.isCompatibleWithFilter("КП-5");
            commanderGasMask.estimateFilterLife();
            commanderGasMask.isSuitableForEnvironment("Хімічний");
            commanderGasMask.checkOverallCondition();
            commanderGasMask.cleanGasMask();

            commanderGasMask.activateRadio();
            commanderGasMask.checkTeamStatus();
            commanderGasMask.checkSpecialFeatures();

            commanderGasMask.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}
