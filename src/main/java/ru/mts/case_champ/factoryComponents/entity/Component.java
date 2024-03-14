package ru.mts.case_champ.factoryComponents.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Component {
    @Id
    @Column
    private String name;
    @Column
    private int count;

    public void changeCount(int change) {
        count += change;
    }
}

