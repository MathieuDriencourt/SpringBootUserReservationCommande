package fr.formation.service;

import java.util.List;

import fr.formation.model.Commande;


public interface ICommandeService {

	
	public List<Commande> getAllCommande();
	public Commande getCommande(Long idCommande);
	public Commande createCommande(Commande co);
	public int deleteCommande(Long idCommande);
	public Commande updateCommande(Commande co);
}
