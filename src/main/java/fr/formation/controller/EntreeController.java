package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Entree;

import fr.formation.service.IEntreeService;

@RestController
@RequestMapping("Entree") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class EntreeController {
	
	@Autowired
	IEntreeService entreeService;

	
	@GetMapping("/all")
	public List<Entree> getAllEntree() {
		return entreeService.getAllEntree();
	}
	
	@GetMapping("/{id}")
	public Entree getById(@PathVariable long id) {
		return entreeService.getEntree(id);
	}
	
	@PostMapping
	public Entree createEntree(@RequestBody Entree Entree) {
		return entreeService.createEntree(Entree);
	}
	
	@DeleteMapping("/{id}")
	public int deleteEntree(@PathVariable long id) {
		return entreeService.deleteEntree(id);
	}
	
	@PutMapping("/{id}")
	public Entree updateEntree(@PathVariable long id, @RequestBody Entree Entree) {
		Entree entreeAModifier = entreeService.getEntree(id);
		entreeAModifier.setNomEntree(Entree.getNomEntree());
		entreeAModifier.setPrixEntree(Entree.getPrixEntree());
		return entreeService.updateEntree(entreeAModifier);
	}
	

}
