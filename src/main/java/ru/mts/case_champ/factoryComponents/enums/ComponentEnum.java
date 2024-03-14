package ru.mts.case_champ.factoryComponents.enums;

public enum ComponentEnum {
    TESTO ("testo", 10),
    MYASO ("myaso", 1),
    KAPUSTA ("kapusta", 1),
    RYBA("ryba", 3),
    YAGODY("yagody", 5),
    TEA("tea", 2),
    COFFEE("coffee", 2);

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

