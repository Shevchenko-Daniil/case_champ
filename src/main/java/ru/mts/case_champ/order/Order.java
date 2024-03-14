package ru.mts.case_champ.order;

import ru.mts.case_champ.city.City;
import ru.mts.case_champ.cooking_products.AbstractProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<AbstractProduct> products = new ArrayList<>();
    private final int maxNumberOfProducts = 6;
    private LocalDateTime createOrder;
    private DeliveryType type;
    private City city;

    private enum DeliveryType {
        COURIER, CASHDESK
    }

    public City getCity() {
        return city;
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

}