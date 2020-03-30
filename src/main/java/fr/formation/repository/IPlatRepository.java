package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Plat;

public interface IPlatRepository extends JpaRepository<Plat, Long>{

}
