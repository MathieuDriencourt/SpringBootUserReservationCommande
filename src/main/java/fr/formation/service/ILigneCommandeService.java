package fr.formation.service;

import java.util.List;

import fr.formation.model.Commande;
import fr.formation.model.LigneCommande;


public interface ILigneCommandeService {

	public List<LigneCommande> getAllLigneCommande();
	public LigneCommande getLigneCommande(Long idLigneCommande);
	public LigneCommande createLigneCommande(LigneCommande lc);
	public int deleteLigneCommande(Long idLigneCommande);
	public LigneCommande updateLigneCommande(LigneCommande lc);
	public List<LigneCommande> findByCommande(Commande commande);
}
