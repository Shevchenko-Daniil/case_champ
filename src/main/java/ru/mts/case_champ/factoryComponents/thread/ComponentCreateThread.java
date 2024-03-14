package ru.mts.case_champ.factoryComponents.thread;

import lombok.extern.slf4j.Slf4j;
import ru.mts.case_champ.factoryComponents.entity.Component;
import ru.mts.case_champ.factoryComponents.enums.ComponentEnum;
import ru.mts.case_champ.factoryComponents.jpa.ComponentJpa;

@Slf4j
public class ComponentCreateThread extends Thread {

    private final ComponentEnum componentEnum;
    private final ComponentJpa componentJpa;
    private int count;

    public ComponentCreateThread(ComponentEnum componentEnum, ComponentJpa componentJpa, int count) {
        this.componentEnum = componentEnum;
        this.componentJpa = componentJpa;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            sleep(componentEnum.getMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Component component = componentJpa.findById(componentEnum.getName())
                .orElse(new Component(componentEnum.getName(), 0));
        component.changeCount(count);
        componentJpa.save(component);
        log.info(componentEnum.getName() + " успешно создан");
    }
}
