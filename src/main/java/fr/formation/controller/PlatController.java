package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Plat;

import fr.formation.service.IPlatService;

@RestController
@RequestMapping("plat") //URL du webservice
public class PlatController {

	
	@Autowired
	IPlatService platService;
	
	@GetMapping("/all")
	public List<Plat> getAllPlat() {
		return platService.getAllPlat();
	}
	
	@GetMapping("/{id}")
	public Plat getById(@PathVariable long id) {
		return platService.getPlat(id);
	}
	
	@PostMapping
	public Plat createPlat(@RequestBody Plat plat) {
		return platService.createPlat(plat);
	}
	
	@DeleteMapping("/{id}")
	public int deletePlat(@PathVariable long id) {
		return platService.deletePlat(id);
	}
	
	@PutMapping("/{id}")
	public Plat updatePlat(@PathVariable long id, @RequestBody Plat plat) {
		Plat platAModifier = platService.getPlat(id);
		platAModifier.setPrixPlat(plat.getPrixPlat());
		platAModifier.setNomPlat(plat.getNomPlat());
		return platService.updatePlat(platAModifier);
	}
	
	
}
