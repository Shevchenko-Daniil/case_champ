package ru.mts.case_champ.factoryComponents.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mts.case_champ.factoryComponents.entity.Component;

@Repository
public interface ComponentJpa extends JpaRepository<Component, String> {
}
