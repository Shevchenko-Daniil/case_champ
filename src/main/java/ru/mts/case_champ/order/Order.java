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

    public static final int maxNumberOfProducts = 6;
    private LocalDateTime dateTime;
    private DeliveryType type;
    private City city;

    public void printOrder() {
        System.out.println("Продукты:");
        for (AbstractProduct product : products)
            System.out.println("\t" + product);
        System.out.println("Время создания:");
        System.out.println("\t" + dateTime);
        System.out.println("Тип доставки:");
        System.out.println("\t" + type);
        if (type == DeliveryType.COURIER) {
            System.out.println("Город:");
            System.out.println("\t" + city);
        }
    }

    public void add(AbstractProduct product) {
        products.add(product);
    }

    public static enum DeliveryType {
        COURIER, CASHDESK
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

    public int getMaxNumberOfProducts() {
        return maxNumberOfProducts;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public DeliveryType getType() {
        return type;
    }
  
    public List<AbstractProduct> getProducts() {
        return products;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setType(DeliveryType type) {
        this.type = type;
    }

    public void setCity(City city) {
        this.city = city;
    }
  
    public City getCity() {
        return city;
    }

}