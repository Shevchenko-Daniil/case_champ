package ru.mts.case_champ.cooking_products.services;

import ru.mts.case_champ.cooking_products.*;

public class CookProductsService {
    public PieWithFish cookPieWithFish() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирог с рыбой");

        return new PieWithFish();
    }

    public PieWithBarry cookPieWithBarry() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирог с ягодами");

        return new PieWithBarry();
    }

    public PattyWithFish cookPattyWithFish() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирожок с рыбой");

        return new PattyWithFish();
    }

    public PattyWithCabbage cookPattyWithCabbage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирожок с капустой");

        return new PattyWithCabbage();
    }

    public Coffee cookCoffee() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирожок с капустой");

        return new Coffee();
    }

    public Tea cookTea() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Создал пирожок с капустой");

        return new Tea();
    }
}
