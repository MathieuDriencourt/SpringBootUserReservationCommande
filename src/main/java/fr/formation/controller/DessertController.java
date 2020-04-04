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

import fr.formation.model.Dessert;
import fr.formation.service.IDessertService;

@RestController
@RequestMapping("Dessert") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class DessertController {
	
	@Autowired
	IDessertService dessertService;
	
	@GetMapping("/all")
	public List<Dessert> getAllDessert() {
		return dessertService.getAllDessert();
	}
	
	@GetMapping("/{id}")
	public Dessert getById(@PathVariable long id) {
		return dessertService.getDessert(id);
	}
	
	@PostMapping
	public Dessert createDessert(@RequestBody Dessert Dessert) {
		return dessertService.createDessert(Dessert);
	}
	
	@DeleteMapping("/{id}")
	public int deleteDessert(@PathVariable long id) {
		return dessertService.deleteDessert(id);
	}
	
	@PutMapping("/{id}")
	public Dessert updateDessert(@PathVariable long id, @RequestBody Dessert Dessert) {
		Dessert dessertAModifier = dessertService.getDessert(id);
		dessertAModifier.setNomDessert(Dessert.getNomDessert());
		dessertAModifier.setPrixDessert(Dessert.getPrixDessert());
		return dessertService.updateDessert(dessertAModifier);
	}
	

}
