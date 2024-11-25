from GasMask import GasMask

class CommanderGasMask(GasMask):
    """
    Клас CommanderGasMask додає додаткові функції до базового протигаза.
    """
    def __init__(self, brand, filter_capacity, max_usage_time, communication_module):
        """
        Ініціалізує об'єкт протигаза командира.

        :param brand: Бренд протигаза.
        :param filter_capacity: Ємність фільтра (години).
        :param max_usage_time: Максимальний час використання (години).
        :param communication_module: Чи є вбудований модуль зв'язку.
        """
        super().__init__(brand, filter_capacity, max_usage_time)
        self.communication_module = communication_module
        self.communication_status = False

    def enable_communication(self):
        """
        Увімкнути модуль зв'язку.
        """
        if self.communication_module:
            if not self.communication_status:
                self.communication_status = True
                print("Модуль зв'язку увімкнено.")
            else:
                print("Модуль зв'язку вже увімкнений.")
        else:
            print("Модуль зв'язку недоступний.")

    def disable_communication(self):
        """
        Вимкнути модуль зв'язку.
        """
        if self.communication_status:
            self.communication_status = False
            print("Модуль зв'язку вимкнено.")
        else:
            print("Модуль зв'язку вже вимкнений.")

    def check_environment(self):
        """
        Перевіряє стан середовища на наявність небезпеки.
        """
        if self.is_on:
            print("Сканування середовища... Небезпечні речовини не виявлено.")
        else:
            print("Протигаз знятий. Сканування неможливе.")

    def report_status(self):
        """
        Виводить звіт про стан командира та середовища.
        """
        base_status = self.get_status()
        comm_status = "активний" if self.communication_status else "не активний"
        print(f"Звіт: {base_status}, модуль зв'язку: {comm_status}.")

    def emergency_alert(self):
        """
        Відправляє сигнал тривоги.
        """
        if self.communication_module and self.communication_status:
            print("Тривога! Небезпечний рівень токсичних речовин.")
        else:
            print("Модуль зв'язку не активний. Сигнал тривоги неможливий.")
