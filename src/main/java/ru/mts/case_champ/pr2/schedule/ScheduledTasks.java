package ru.mts.case_champ.pr2.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.mts.case_champ.pr2.order.CreateOrder;
import ru.mts.case_champ.pr2.order.Order;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 3000)
    public void doSomething(){
        Order order=CreateOrder.create();
        order.printOrder();
        System.out.println("-----------------");
    }
}