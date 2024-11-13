package KI305.Shustakevych.Lab3;

import java.io.IOException;

/**
 * Інтерфейс {@code CommanderFunctions} визначає додаткові функції, що доступні для командирського протигазу.
 * <p>
 * Він включає методи для активації радіозв'язку та перевірки стану команди.
 */
public interface CommanderFunctions {

    /**
     * Активація радіозв'язку для командирського протигазу.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    void activateRadio() throws IOException;

    /**
     * Перевіряє стан команди через вбудовані сенсори протигазу або інші засоби зв'язку.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    void checkTeamStatus() throws IOException;
}