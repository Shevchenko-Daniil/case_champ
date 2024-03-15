package ru.mts.case_champ.delivery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mts.case_champ.create_order.order.Order;

@Slf4j
@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping//если доставка курьером - true
    public void saveDelivery(@RequestBody Order order) {
        log.info("заказ зарегистрирован на доставку", order);
        deliveryService.saveDelivery(order);
    }
}