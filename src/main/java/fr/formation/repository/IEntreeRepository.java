package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Entree;



public interface IEntreeRepository extends JpaRepository<Entree, Long>{

}
