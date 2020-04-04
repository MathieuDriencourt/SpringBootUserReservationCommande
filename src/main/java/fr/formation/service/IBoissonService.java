package fr.formation.service;

import java.util.List;

import fr.formation.model.Boisson;



public interface IBoissonService {
	
	public List<Boisson> getAllBoisson();
	public Boisson getBoisson(Long idBoisson);
	public Boisson createBoisson(Boisson bo);
	public int deleteBoisson(Long idBoisson);
	public Boisson updateBoisson(Boisson bo);

}
