package ru.mts.case_champ.order;

import org.springframework.stereotype.Service;
import ru.mts.case_champ.city.City;
import ru.mts.case_champ.cooking_products.*;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class CreateOrder {
    public static Order create(){
        Order order=new Order();
        Random random=new Random();
        for(int i=0;i<Order.maxNumberOfProducts;i++){
            switch (random.nextInt(6)){
                case 0:
                    order.add(new Coffee());
                    break;
                case 1:
                    order.add(new PattyWithCabbage());
                    break;
                case 2:
                    order.add(new PattyWithFish());
                    break;
                case 3:
                    order.add(new PieWithBarry());
                    break;
                case 4:
                    order.add(new PieWithFish());
                    break;
                case 5:
                    order.add(new Tea());
            }
        }
        order.setDateTime(LocalDateTime.now());
        switch (random.nextInt(2)){
            case 0:
                order.setType(Order.DeliveryType.COURIER);
                switch (random.nextInt(4)){
                    case 0:
                        order.setCity(City.MOSCOW);
                        break;
                    case 1:
                        order.setCity(City.SPB);
                        break;
                    case 2:
                        order.setCity(City.NOVOSIB);
                        break;
                    case 3:
                        order.setCity(City.EKB);
                }
                break;
            case 1:
                order.setType(Order.DeliveryType.CASHDESK);
        }
        return order;
    }
}