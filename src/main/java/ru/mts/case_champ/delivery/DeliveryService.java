package ru.mts.case_champ.delivery;

import ru.mts.case_champ.city.City;
import ru.mts.case_champ.order.Order;

import java.util.HashMap;

public class DeliveryService {
    HashMap<City, Integer> orders;


    private boolean checkCity(City city) {
        try {
            Enum.valueOf(City.class, city.toString());
            return true;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Заказ не может быть доставлен");
        }

    }

    public void saveDelivery(Order order) {
        checkCity(order.getCity());
        if (orders.containsKey(order.getCity())) {
            orders.put(order.getCity(), order.getProducts().size());
        } else {
            orders.put(order.getCity(), orders.get(order.getCity()) + order.getProducts().size());
        }
    }

    //доставленные заказы убирать из ордерс
    public void deleteOrder(){}


}
