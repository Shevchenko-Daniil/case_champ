package ru.mts.fintech.factoryComponents.enums;

public enum ComponentEnum {
    TESTO ("testo", 1),
    MYASO ("myaso", 1),
    KAPUSTA ("kapusta", 1);

//    Тесто - 1 секунда
//● Мясо - 2 секунды
//● Капуста - 2 секунды
//● Рыба - 3 секунды
//● Ягоды - 5 секунд
//● Листовой чай - 2 секунды
//● Зерна кофе - 2 секунды

    private String name;
    private int millis;

    ComponentEnum(String name, int millis) {
        this.name = name;
        this.millis = millis;
    }

    public String getName() {
        return name;
    }

    public int getMillis() {
        return millis;
    }
}

