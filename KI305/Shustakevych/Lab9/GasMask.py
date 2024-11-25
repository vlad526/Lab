class GasMask:
    """
    Клас GasMask представляє базовий протигаз.
    """
    def __init__(self, brand, filter_capacity, max_usage_time):
        """
        Ініціалізує об'єкт протигаза.

        :param brand: Бренд протигаза.
        :param filter_capacity: Ємність фільтра (години).
        :param max_usage_time: Максимальний час використання (години).
        """
        self.brand = brand
        self.filter_capacity = filter_capacity  # годин фільтрації
        self.max_usage_time = max_usage_time  # годин використання
        self.usage_time = 0  # використано годин
        self.is_on = False

    def put_on(self):
        """
        Надіти протигаз.
        """
        if not self.is_on:
            self.is_on = True
            print(f"Протигаз {self.brand} надіто.")
        else:
            print("Протигаз вже надітий.")

    def take_off(self):
        """
        Зняти протигаз.
        """
        if self.is_on:
            self.is_on = False
            print(f"Протигаз {self.brand} знято.")
        else:
            print("Протигаз вже знятий.")

    def use_for_hours(self, hours):
        """
        Використовує протигаз певну кількість годин.

        :param hours: Кількість годин використання.
        """
        if self.is_on:
            self.usage_time += hours
            if self.usage_time > self.filter_capacity:
                print("Увага! Фільтр вичерпано.")
            elif self.usage_time > self.max_usage_time:
                print("Протигаз більше не підлягає використанню. Замініть фільтр.")
            else:
                print(f"Протигаз використовувався ще {hours} годин. Загалом {self.usage_time} годин.")
        else:
            print("Протигаз знятий. Використання неможливе.")

    def replace_filter(self):
        """
        Заміна фільтра протигаза.
        """
        self.usage_time = 0
        print("Фільтр протигаза замінено.")

    def get_status(self):
        """
        Отримує статус протигаза.
        """
        status = "надітий" if self.is_on else "знятий"
        return f"{self.brand} {status}, використано {self.usage_time}/{self.filter_capacity} годин."

