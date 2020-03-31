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

import fr.formation.model.Commande;

import fr.formation.model.User;
import fr.formation.service.ICommandeService;
import fr.formation.service.IUserService;

@RestController
@RequestMapping("commande") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class CommandeController {

	@Autowired
	ICommandeService commandeService;
	@Autowired
	IUserService userService;
	
	
	@GetMapping("/all")
	public List<Commande> getAllCommande() {
		return commandeService.getAllCommande();
	}
	
	@GetMapping("/{id}")
	public Commande getById(@PathVariable long id) {
		return commandeService.getCommande(id);
	}
	
	@PostMapping
	public Commande createCommande(@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
	}
	
	@DeleteMapping("/{id}")
	public int deleteCommande(@PathVariable long id) {
		return commandeService.deleteCommande(id);
	}
	
	@PutMapping("/{id}")
	public Commande updateCommande(@PathVariable long id, @RequestBody Commande commande) {
		Commande commandeAModifier = commandeService.getCommande(id);
		commandeAModifier.setMontantCommande(commande.getMontantCommande());
		return commandeService.updateCommande(commandeAModifier);
	}
	
	@PutMapping("/{idC}/set/{idU}")
	public boolean affectationCommandeUser(@PathVariable long idC, @PathVariable long idU) {
		Commande alinker=commandeService.getCommande(idC);
		User linker=userService.getUser(idU);
		alinker.setEmployee(linker);
		commandeService.createCommande(alinker);
		return true;
	}
}
