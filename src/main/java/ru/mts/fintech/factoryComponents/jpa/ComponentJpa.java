package ru.mts.fintech.factoryComponents.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mts.fintech.factoryComponents.entity.Component;

@Repository
public interface ComponentJpa extends JpaRepository<Component, String> {
}
