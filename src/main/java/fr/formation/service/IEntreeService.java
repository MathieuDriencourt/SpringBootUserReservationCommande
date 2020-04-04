package fr.formation.service;

import java.util.List;

import fr.formation.model.Entree;



public interface IEntreeService {

	
	public List<Entree> getAllEntree();
	public Entree getEntree(Long idEntree);
	public Entree createEntree(Entree en);
	public int deleteEntree(Long idEntree);
	public Entree updateEntree(Entree en);
}
