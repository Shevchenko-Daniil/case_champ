package ru.mts.case_champ.factoryComponents.enums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mts.case_champ.factoryComponents.property.ComponentProperty;

@Component
public class ComponentTimeStatis {
    @Autowired
    static ComponentProperty componentProperty;
}
