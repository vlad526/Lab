package KI305.Shustakevych.Lab3;

import java.io.IOException;

/**
 * Клас {@code CommanderGasMask} розширює базовий клас {@code GasMask} та реалізує інтерфейс {@code CommanderFunctions}.
 * <p>
 * Додає функціонал радіозв'язку та перевірки статусу команди, що є необхідними для командирського протигазу.
 */
public class CommanderGasMask extends GasMask implements CommanderFunctions {
    private boolean radioActive;

    /**
     * Конструктор для створення командирського протигазу.
     *
     * @param model           Модель протигазу.
     * @param isSealed        Вказує, чи протигаз герметичний.
     * @param protectionLevel Рівень захисту.
     * @throws IOException якщо виникає помилка під час створення логера.
     */
    public CommanderGasMask(String model, boolean isSealed, int protectionLevel) throws IOException {
        super(model, isSealed, protectionLevel);
        this.radioActive = false;
    }

    /**
     * Активація радіозв'язку.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public void activateRadio() throws IOException {
        this.radioActive = true;
        logger.log("Радіо активовано");
        System.out.println("Радіо активовано");
    }

    /**
     * Перевірка стану команди через радіозв'язок.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public void checkTeamStatus() throws IOException {
        if (radioActive) {
            logger.log("Перевірка статусу команди");
            System.out.println("Перевірка статусу команди");
        } else {
            logger.log("Неможливо перевірити статус команди. Радіо не активовано.");
            System.out.println("Неможливо перевірити статус команди. Радіо не активовано.");
        }
    }

    /**
     * Перевірка спеціальних функцій командирського протигазу.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public void checkSpecialFeatures() throws IOException {
        logger.log("Перевірка спеціальних функцій командирського протигазу");
        System.out.println("Перевірка спеціальних функцій командирського протигазу");
        System.out.println("Статус радіо: " + (radioActive ? "активне" : "неактивне"));
    }
}
