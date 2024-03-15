package ru.mts.case_champ.factory_components.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "component.time")
@Getter
@Setter
public class ComponentProperty {
    private int testo;
}
