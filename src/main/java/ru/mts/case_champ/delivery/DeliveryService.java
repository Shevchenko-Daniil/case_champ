package ru.mts.case_champ.delivery;

import org.springframework.stereotype.Service;
import ru.mts.case_champ.create_order.city.City;
import ru.mts.case_champ.create_order.order.Order;

import java.util.HashMap;

@Service
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
