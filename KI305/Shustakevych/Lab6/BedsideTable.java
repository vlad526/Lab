package KI305.Shustakevych.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас, що реалізує тумбочку
 * @param <T> тип елементів, що зберігаються в тумбочці
 */
public class BedsideTable<T extends Comparable<T>> {
    private List<T> items;
    private int capacity;

    /**
     * Конструктор класу BedsideTable
     * @param capacity максимальна місткість тумбочки
     */
    public BedsideTable(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    /**
     * Додає елемент в тумбочку
     * @param item елемент для додавання
     * @return true якщо елемент успішно додано, false якщо тумбочка заповнена
     */
    public boolean addItem(T item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        return false;
    }

    /**
     * Виймає елемент з тумбочки за вказаним індексом
     * @param index індекс елемента
     * @return вийнятий елемент
     * @throws IndexOutOfBoundsException якщо індекс невірний
     */
    public T removeItem(int index) {
        return items.remove(index);
    }

    /**
     * Знаходить максимальний елемент в тумбочці
     * @return максимальний елемент або null якщо тумбочка порожня
     */
    public T findMaximum() {
        if (items.isEmpty()) {
            return null;
        }

        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    /**
     * Шукає елемент в тумбочці
     * @param item елемент для пошуку
     * @return true якщо елемент знайдено, false якщо ні
     */
    public boolean searchItem(T item) {
        return items.contains(item);
    }

    /**
     * Повертає поточну кількість елементів в тумбочці
     * @return кількість елементів
     */
    public int getCurrentSize() {
        return items.size();
    }

    /**
     * Виводить всі елементи тумбочки
     */
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
