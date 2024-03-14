package ru.mts.fintech.factoryComponents.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mts.fintech.factoryComponents.enums.ComponentEnum;
import ru.mts.fintech.factoryComponents.jpa.ComponentJpa;
import ru.mts.fintech.factoryComponents.thread.ComponentCreateThread;

@Service
@Slf4j
public class ComponentService {
    @Autowired
    private ComponentJpa componentJpa;

    public String createComponent(String componentName, int count) {
        ComponentEnum componentEnum;
        try {
            componentEnum = ComponentEnum.valueOf(componentName);
        } catch (IllegalArgumentException e) {
            return "Неправильное название компонента";
        }

        ComponentCreateThread thread = new ComponentCreateThread(componentEnum, componentJpa, count);
        thread.start();
        return "Продукт " + componentEnum.getName() + " успешно создан в количестве " + count + "шт";
    }
}