package ru.mts.case_champ.factoryComponents.enums;

public enum ComponentEnum {
    TESTO ("testo", 1000),
    MYASO ("myaso", 1000),
    KAPUSTA ("kapusta", 1000),
    RYBA("ryba", 3000),
    YAGODY("yagody", 5000),
    TEA("tea", 2000),
    COFFEE("coffee", 2000);

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

