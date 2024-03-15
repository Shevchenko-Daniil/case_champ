package ru.mts.case_champ.factory_components.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mts.case_champ.factory_components.entity.Component;

@Repository
public interface ComponentJpa extends JpaRepository<Component, String> {
}
