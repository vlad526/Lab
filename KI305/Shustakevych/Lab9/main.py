from CommanderGasMask import CommanderGasMask

if __name__ == "__main__":
    # Створення протигаза командира
    commander_mask = CommanderGasMask("MilSafe", 8, 12, True)

    # 1. Початковий стан
    print("\n1. Початковий стан:")
    commander_mask.report_status()

    # 2. Надіти протигаз
    print("\n2. Надіти протигаз:")
    commander_mask.put_on()

    # 3. Використання протигаза
    print("\n3. Використання протигаза:")
    commander_mask.use_for_hours(5)
    commander_mask.report_status()

    # 4. Увімкнути модуль зв'язку
    print("\n4. Увімкнути модуль зв'язку:")
    commander_mask.enable_communication()
    commander_mask.report_status()

    # 5. Перевірити середовище
    print("\n5. Перевірити середовище:")
    commander_mask.check_environment()

    # 6. Використати ще годин
    print("\n6. Використати ще годин:")
    commander_mask.use_for_hours(4)

    # 7. Заміна фільтра
    print("\n7. Заміна фільтра:")
    commander_mask.replace_filter()
    commander_mask.report_status()

    # 8. Відправити сигнал тривоги
    print("\n8. Відправити сигнал тривоги:")
    commander_mask.emergency_alert()

    # 9. Вимкнути модуль зв'язку
    print("\n9. Вимкнути модуль зв'язку:")
    commander_mask.disable_communication()

    # 10. Зняти протигаз
    print("\n10. Зняти протигаз:")
    commander_mask.take_off()

    # 11. Фінальний стан
    print("\n11. Фінальний стан:")
    commander_mask.report_status()

