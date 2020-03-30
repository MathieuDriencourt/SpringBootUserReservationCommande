package fr.formation.service;

import java.util.List;

import fr.formation.model.Facture;



public interface IFactureService {

	
	public List<Facture> getAllFacture();
	public Facture getFacture(Long idFacture);
	public Facture createFacture(Facture fa);
	public int deleteFacture(Long idFacture);
	public Facture updateFacture(Facture fa);
}
