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
import fr.formation.model.Facture;

import fr.formation.service.ICommandeService;
import fr.formation.service.IFactureService;



@RestController
@RequestMapping("facture") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class FactureController {

	
	@Autowired
	IFactureService factureService;
	@Autowired
	ICommandeService commandeService;
	
	
	
	
	@GetMapping("/all")
	public List<Facture> getAllFacture() {
		return factureService.getAllFacture();
	}
	
	@GetMapping("/{id}")
	public Facture getById(@PathVariable long id) {
		return factureService.getFacture(id);
	}
	
	@PostMapping
	public Facture createFacture(@RequestBody Facture facture) {
		return factureService.createFacture(facture);
	}
	
	@DeleteMapping("/{id}")
	public int deleteFacture(@PathVariable long id) {
		return factureService.deleteFacture(id);
	}
	
	@PutMapping("/{id}")
	public Facture updateFacture(@PathVariable long id, @RequestBody Facture facture) {
		Facture factureAModifier = factureService.getFacture(id);
		factureAModifier.setMontantFacture(facture.getMontantFacture());
		return factureService.updateFacture(factureAModifier);
	}
	
	@PutMapping("/{idF}/set/{idC}")
	public boolean affectationFactureCommande(@PathVariable long idF, @PathVariable long idC) {
		Facture alinker=factureService.getFacture(idF);
		Commande linker=commandeService.getCommande(idC);
		alinker.setCommande(linker);
		factureService.createFacture(alinker);
		return true;
	}
	
//	@PostMapping("/{idCommande}")
//	public Facture create(Facture facture, @PathVariable long idCommande) {
//	try {Commande commande1 = new Commande();
//		commande1.setIdCommande(idCommande);
//		double prixTot = 0;
//		prixTot = prixTot + (commande1.getQteEntree())*(commande1.getEntree().getPrixEntree()) 
//				+ (commande1.getQtePlat())*(commande1.getPlat().getPrixPlat()) 
//				+ (commande1.getQteDessert())*(commande1.getDessert().getPrixDessert()) 
//				+ (commande1.getQteBoisson())*(commande1.getBoisson().getPrixBoisson());
//		facture.setMontantFacture(prixTot);
//		facture.setCommande(commande1);
//		return factureService.createFacture(facture);
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//		return null;
//	}
//	}
	
		@PostMapping("/{idCommande}")
		public Facture createBis(@PathVariable long idCommande) {
			return factureService.createBis(idCommande);
		}
	
}
