package ru.mts.case_champ.factory_components.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mts.case_champ.factory_components.dto.MessageDto;
import ru.mts.case_champ.factory_components.service.ComponentService;

@RestController
@RequestMapping("/component")
public class ComponentController {
    @Autowired
    private ComponentService componentService;

    @PostMapping("/{component}")
    public MessageDto createComponent(@PathVariable String component, @RequestParam int count) {
        String str = componentService.createComponent(component, count);
        return new MessageDto(str);
    }
}

