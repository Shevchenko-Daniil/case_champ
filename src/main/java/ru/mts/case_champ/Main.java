package ru.mts.case_champ;

import ru.mts.case_champ.cooking_products.AbstractProduct;
import ru.mts.case_champ.cooking_products.services.CookProductsService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CookProductsService testService = new CookProductsService();
        AbstractProduct testProduct = testService.cookPieWithFish();
    }
}
