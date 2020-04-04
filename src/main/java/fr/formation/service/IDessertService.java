package fr.formation.service;

import java.util.List;

import fr.formation.model.Dessert;

public interface IDessertService {
	
	public List<Dessert> getAllDessert();
	public Dessert getDessert(Long idDessert);
	public Dessert createDessert(Dessert de);
	public int deleteDessert(Long idDessert);
	public Dessert updateDessert(Dessert de);

}
