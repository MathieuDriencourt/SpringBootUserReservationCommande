package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Dessert;



public interface IDessertRepository extends JpaRepository<Dessert, Long>{

}
