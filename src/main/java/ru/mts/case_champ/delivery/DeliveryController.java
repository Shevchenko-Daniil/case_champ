package ru.mts.case_champ.delivery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping//если доставка курьером - true
    public ResponseEntity<Object> saveDelivery(@RequestBody DeliveryDto deliveryDto) {
        log.info("заказ зарегистрирован на доставку", deliveryDto);
        return deliveryService.saveDelivery(deliveryDto);
    }
}