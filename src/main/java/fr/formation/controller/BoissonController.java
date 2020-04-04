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

import fr.formation.model.Boisson;
import fr.formation.service.IBoissonService;

@RestController
@RequestMapping("Boisson") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class BoissonController {
	
	@Autowired
	IBoissonService boissonService;
	
	@GetMapping("/all")
	public List<Boisson> getAllBoisson() {
		return boissonService.getAllBoisson();
	}
	
	@GetMapping("/{id}")
	public Boisson getById(@PathVariable long id) {
		return boissonService.getBoisson(id);
	}
	
	@PostMapping
	public Boisson createBoisson(@RequestBody Boisson Boisson) {
		return boissonService.createBoisson(Boisson);
	}
	
	@DeleteMapping("/{id}")
	public int deleteBoisson(@PathVariable long id) {
		return boissonService.deleteBoisson(id);
	}
	
	@PutMapping("/{id}")
	public Boisson updateBoisson(@PathVariable long id, @RequestBody Boisson Boisson) {
		Boisson boissonAModifier = boissonService.getBoisson(id);
		boissonAModifier.setNomBoisson(Boisson.getNomBoisson());
		boissonAModifier.setPrixBoisson(Boisson.getPrixBoisson());
		return boissonService.updateBoisson(boissonAModifier);
	}
	

}
