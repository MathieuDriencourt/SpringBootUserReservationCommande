package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.LigneCommande;

public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long>{

}
