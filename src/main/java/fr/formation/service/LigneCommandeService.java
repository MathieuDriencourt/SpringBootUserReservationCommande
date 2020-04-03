package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Commande;
import fr.formation.model.LigneCommande;
import fr.formation.repository.ILigneCommandeRepository;

@Service
public class LigneCommandeService implements ILigneCommandeService{	
	
	@Autowired
	ILigneCommandeRepository ligneCommandeRepository;

	@Override
	public List<LigneCommande> getAllLigneCommande() {
		return ligneCommandeRepository.findAll();
	}

	@Override
	public LigneCommande getLigneCommande(Long idLigneCommande) {
		Optional<LigneCommande> ligneCommandeOptional = ligneCommandeRepository.findById(idLigneCommande);
		LigneCommande ligneCommande = new LigneCommande();
		if (ligneCommandeOptional.isPresent()) {
			ligneCommande = ligneCommandeOptional.get();
		}
		
		return ligneCommande;
	}

	@Override
	public LigneCommande createLigneCommande(LigneCommande lc) {
		return ligneCommandeRepository.save(lc);
	}

	@Override
	public int deleteLigneCommande(Long idLigneCommande) {
		ligneCommandeRepository.deleteById(idLigneCommande);
		return 1;
	}

	@Override
	public LigneCommande updateLigneCommande(LigneCommande lc) {
		return ligneCommandeRepository.save(lc);
	}

	@Override
	public List<LigneCommande> findByCommande(Commande commande) {
		return ligneCommandeRepository.findByCommandeIs(commande);
	}

}
