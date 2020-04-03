package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Commande;
import fr.formation.model.LigneCommande;
//import fr.formation.model.Plat;

import fr.formation.service.ICommandeService;
import fr.formation.service.ILigneCommandeService;
import fr.formation.service.IPlatService;

@RestController
@RequestMapping("ligneCommande") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class LigneCommandeController {

	@Autowired
	ILigneCommandeService ligneCommandeService;
	@Autowired
	ICommandeService commandeService;
	@Autowired
	IPlatService platService;
	
	@GetMapping("/all")
	public List<LigneCommande> getAllLigneCommande() {
		return ligneCommandeService.getAllLigneCommande();
	}
	
	@GetMapping("/{id}")
	public LigneCommande getById(@PathVariable long id) {
		return ligneCommandeService.getLigneCommande(id);
	}
	
	@PostMapping("/add")
	public LigneCommande createLigneCommande(@RequestBody LigneCommande ligneCommande) {
		return ligneCommandeService.createLigneCommande(ligneCommande);
	}
	
	@PostMapping("/getliste")
	public List<LigneCommande> getLCByCommande(@RequestBody Commande commande) {
		return ligneCommandeService.findByCommande(commande);
	}
	
//	@PutMapping("/{idC}/set/{idP}")
//	public LigneCommande createLC(@PathVariable long idC, @PathVariable long idP) {
//		Commande co = commandeService.getCommande(idC);
//		Plat pl = platService.getPlat(idP);
//		LigneCommande lc = new LigneCommande();
//		lc.setCommande(co);
//		lc.setPlat(pl);
//		ligneCommandeService.createLigneCommande(lc);
//		return lc;
//	}
	
	@DeleteMapping("/{id}")
	public int deleteLigneCommande(@PathVariable long id) {
		return ligneCommandeService.deleteLigneCommande(id);
	}
	
//	@PutMapping("/{idLC}/set/{idC}")
//	public boolean affectationLigneCommandeCommande(@PathVariable long idLC, @PathVariable long idC) {
//		LigneCommande alinker=ligneCommandeService.getLigneCommande(idLC);
//		Commande linker=commandeService.getCommande(idC);
//		alinker.setCommande(linker);
//		ligneCommandeService.createLigneCommande(alinker);
//		return true;
//	}
	
//	@PutMapping("/{idLC}/set/{idP}")
//	public boolean affectationLigneCommandePlat(@PathVariable long idLC, @PathVariable long idP) {
//		LigneCommande alinker=ligneCommandeService.getLigneCommande(idLC);
//		Plat linker=platService.getPlat(idP);
//		alinker.setPlat(linker);
//		ligneCommandeService.createLigneCommande(alinker);
//		return true;
//	}
	
}
