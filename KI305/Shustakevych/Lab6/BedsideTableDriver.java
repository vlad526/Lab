package KI305.Shustakevych.Lab6;


/**
 * Клас-драйвер для демонстрації роботи класу BedsideTable.
 * Виконує тестування зберігання об'єктів у вигляді журналів і медикаментів у тумбочці.
 * Клас дозволяє додавати елементи, відображати всі елементи, знаходити елементи з максимальними характеристиками,
 * здійснювати пошук і видаляти елементи.
 */
public class BedsideTableDriver {
    public static void main(String[] args) {
        // Тестування з журналами
        BedsideTable<Magazine> magazineTable = new BedsideTable<>(5);

        // Додаємо журнали
        magazineTable.addItem(new Magazine("Nature", 2022, 100));
        magazineTable.addItem(new Magazine("Science", 2023, 85));
        magazineTable.addItem(new Magazine("Discovery", 2021, 120));

        // Виводимо журнали
        System.out.println("Журнали в тумбочці:");
        magazineTable.displayItems();

        // Знаходимо найновіший журнал
        System.out.println("\nНайновіший журнал:");
        System.out.println(magazineTable.findMaximum());

        // Тестування з медикаментами
        BedsideTable<Medicine> medicineTable = new BedsideTable<>(4);

        // Додаємо медикаменти
        medicineTable.addItem(new Medicine("Аспірин", 50.0, "2025-01"));
        medicineTable.addItem(new Medicine("Вітаміни", 150.0, "2024-12"));
        medicineTable.addItem(new Medicine("Бинт", 30.0, "2026-06"));

        // Виводимо медикаменти
        System.out.println("\nМедикаменти в тумбочці:");
        medicineTable.displayItems();

        // Знаходимо найдорожчий медикамент
        System.out.println("\nНайдорожчий медикамент:");
        System.out.println(medicineTable.findMaximum());

        // Пошук медикаменту
        Medicine searchMedicine = new Medicine("Вітаміни", 150.0, "2024-12");
        System.out.println("\nПошук вітамінів: " + medicineTable.searchItem(searchMedicine));

        // Демонстрація видалення
        System.out.println("\nВидаляємо медикамент:");
        System.out.println(medicineTable.removeItem(1));

        // Виводимо медикаменти після видалення
        System.out.println("\nМедикаменти після видалення:");
        medicineTable.displayItems();
    }
}
