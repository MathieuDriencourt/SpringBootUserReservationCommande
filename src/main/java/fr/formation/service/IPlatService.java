package fr.formation.service;

import java.util.List;

import fr.formation.model.Plat;



public interface IPlatService {

	
	public List<Plat> getAllPlats();
	public Plat getPlat(Long idPlat);
	public Plat createPlat(Plat pl);
	public int deletePlat(Long idPlat);
	public Plat updatePlat(Plat pl);
}
