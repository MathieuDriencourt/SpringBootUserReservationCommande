package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Boisson;



public interface IBoissonRepository extends JpaRepository<Boisson, Long>{

}
