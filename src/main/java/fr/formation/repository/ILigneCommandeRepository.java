package fr.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Commande;
import fr.formation.model.LigneCommande;
import fr.formation.model.Plat;


public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long>{

	public List<LigneCommande> findByCommandeIs(Commande commande);
	
	public LigneCommande findByPlatAndCommande(Plat plat, Commande commande);
	
}
