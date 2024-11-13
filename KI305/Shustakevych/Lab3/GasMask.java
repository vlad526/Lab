package KI305.Shustakevych.Lab3;

import java.io.IOException;

/**
 * Клас {@code GasMask} моделює протигаз з різними компонентами, такими як фільтр, маска та ремінь.
 */
public abstract class GasMask {
    protected  Filter filter;
    protected  Mask mask;
    protected  Strap strap;
    protected  Logger logger;
    protected  String model;
    protected  boolean isSealed;
    protected  int protectionLevel;

    /**
     * Конструктор для створення протигазу з вказаними параметрами.
     *
     * @param model           Модель протигазу.
     * @param isSealed       Вказує, чи протигаз герметичний.
     * @param protectionLevel Рівень захисту.
     * @throws IOException якщо виникає помилка під час створення логера.
     */
    public GasMask(String model, boolean isSealed, int protectionLevel) throws IOException {
        this.model = model;
        this.isSealed = isSealed;
        this.protectionLevel = protectionLevel;
        this.filter = new Filter();
        this.mask = new Mask();
        this.strap = new Strap();
        this.logger = new Logger("gas_mask_log.txt");
        logger.log(String.format("Протигаз %s створено.", this.toString()));
    }

    /**
     * Конструктор для створення протигазу з заданими компонентами.
     *
     * @param filter         Фільтр протигазу.
     * @param mask           Маска протигазу.
     * @param strap          Ремінь протигазу.
     * @param model          Модель протигазу.
     * @param isSealed       Вказує, чи протигаз герметичний.
     * @param protectionLevel Рівень захисту.
     * @throws IOException якщо виникає помилка під час створення логера.
     */
    public GasMask(Filter filter, Mask mask, Strap strap, String model, boolean isSealed, int protectionLevel) throws IOException {
        this.filter = filter;
        this.mask = mask;
        this.strap = strap;
        this.model = model;
        this.isSealed = isSealed;
        this.protectionLevel = protectionLevel;
        this.logger = new Logger("gas_mask_log.txt");
        logger.log(String.format("Протигаз %s створено.", this.toString()));
    }

    /**
     * Абстрактний метод для перевірки спеціальних функцій протигазу.
     */
    public abstract void checkSpecialFeatures() throws IOException;

    /**
     * Перевіряє герметичність протигазу.
     *
     * @return true, якщо протигаз герметичний, false - в іншому випадку.
     */
    public boolean checkSeal() throws IOException {
        logger.log(String.format("Перевірка герметичності: %s", (isSealed ? "герметичний" : "негерметичний")));
        System.out.printf("Перевірка герметичності: %s\n", (isSealed ? "герметичний" : "негерметичний"));
        return isSealed;
    }

    /**
     * Змінює фільтр протигазу.
     *
     * @param newFilter Новий фільтр.
     */
    public void changeFilter(Filter newFilter) throws IOException {
        this.filter = newFilter;
        logger.log(String.format("Змінено фільтр на %s", newFilter));
        System.out.printf("Змінено фільтр на %s\n", newFilter);
    }

    /**
     * Регулює ремінь протигазу.
     *
     * @param adjustment Величина регулювання (в см).
     */
    public void adjustStrap(int adjustment) throws IOException {
        strap.adjustLength(adjustment);
        logger.log(String.format("Відрегульовано ремінь на %s см", adjustment));
        System.out.printf("Відрегульовано ремінь на %s см\n", adjustment);
    }

    /**
     * Перевіряє термін придатності фільтра.
     *
     * @return true, якщо фільтр придатний, false - в іншому випадку.
     */
    public boolean checkFilterExpiration() throws IOException {
        boolean isValid = filter.isValid();
        logger.log(String.format("Перевірка терміну придатності фільтра: %s", (isValid ? "придатний" : "непридатний")));
        System.out.printf("Перевірка терміну придатності фільтра: %s\n", (isValid ? "придатний" : "непридатний"));
        return isValid;
    }

    /**
     * Перевіряє рівень захисту протигазу.
     *
     * @return Рівень захисту.
     */
    public int getProtectionLevel() throws IOException {
        logger.log(String.format("Перевірка рівня захисту: %s", protectionLevel));
        System.out.printf("Перевірка рівня захисту: %s\n", protectionLevel);
        return protectionLevel;
    }

    /**
     * Перевіряє сумісність протигазу з певним типом фільтра.
     *
     * @param filterType Тип фільтра.
     * @return true, якщо протигаз сумісний, false - в іншому випадку.
     */
    public boolean isCompatibleWithFilter(String filterType) throws IOException {
        boolean compatible = filter.getType().equals(filterType);
        logger.log(String.format("Перевірка сумісності з фільтром типу %s : %s", filterType, (compatible ? "сумісний" : "несумісний")));
        System.out.printf("Перевірка сумісності з фільтром типу %s : %s\n", filterType, (compatible ? "сумісний" : "несумісний"));
        return compatible;
    }

    /**
     * Оцінює залишковий ресурс фільтра.
     *
     * @return Залишковий ресурс у відсотках.
     */
    public int estimateFilterLife() throws IOException {
        int lifeLeft = filter.getRemainingLife();
        logger.log(String.format("Оцінка залишкового ресурсу фільтра: %s", lifeLeft));
        System.out.printf("Оцінка залишкового ресурсу фільтра: %s\n", lifeLeft);
        return lifeLeft;
    }

    /**
     * Перевіряє, чи підходить протигаз для використання в певному середовищі.
     *
     * @param environment Тип середовища.
     * @return true, якщо протигаз підходить, false - в іншому випадку.
     */
    public boolean isSuitableForEnvironment(String environment) throws IOException {
        boolean suitable = (environment.equals("Хімічний") && protectionLevel >= 3) ||
                (environment.equals("Біологічний") && protectionLevel >= 2) ||
                (environment.equals("Ядерний") && protectionLevel >= 4);
        logger.log(String.format("Перевірка придатності для середовища %s : %s", environment, (suitable ? "підходить" : "не підходить")));
        System.out.printf("Перевірка придатності для середовища %s : %s\n", environment, (suitable ? "підходить" : "не підходить"));
        return suitable;
    }

    /**
     * Перевіряє загальний стан протигазу.
     *
     * @return String, що описує загальний стан протигазу.
     */
    public String checkOverallCondition() throws IOException {
        String condition = String.format("Модель: %s, Герметичність: %s, Рівень захисту: %d, Ресурс фільтра: %d%%",
                model, isSealed ? "Так" : "Ні", protectionLevel, estimateFilterLife());
        logger.log("Перевірка загального стану протигазу: " + condition);
        System.out.println("Перевірка загального стану протигазу: " + condition);
        return condition;
    }

    /**
     * Імітує процес очищення протигазу.
     *
     * @return true, оскільки ми припускаємо, що очищення завжди успішне.
     */
    public boolean cleanGasMask() throws IOException {
        logger.log("Проведено очищення протигазу");
        System.out.println("Проведено очищення протигазу");
        return true;
    }

    /**
     * Закриває логер для збереження даних у файл.
     *
     * @throws IOException якщо виникає помилка під час закриття логера
     */
    public void closeLogger() throws IOException {
        logger.close();
    }
}