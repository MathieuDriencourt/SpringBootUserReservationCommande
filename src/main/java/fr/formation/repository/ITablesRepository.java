package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Tables;



public interface ITablesRepository extends JpaRepository<Tables, Long>{

}
