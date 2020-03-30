package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Facture;

public interface IFactureRepository extends JpaRepository<Facture, Long>{

}
