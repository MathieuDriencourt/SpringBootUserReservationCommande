package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.model.Commande;

import fr.formation.repository.ICommandeRepository;

public class CommandeService implements ICommandeService{
	
	@Autowired
	ICommandeRepository commandeRepository;

	@Override
	public List<Commande> getAllCommande() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande getCommande(Long idCommande) {
		Optional<Commande> commandeOptional = commandeRepository.findById(idCommande);
		Commande commande = new Commande();
		if (commandeOptional.isPresent()) {
			commande = commandeOptional.get();
		}
		
		return commande;
	}

	@Override
	public Commande createCommande(Commande co) {
		return commandeRepository.save(co);
	}

	@Override
	public int deleteCommande(Long idCommande) {
		commandeRepository.deleteById(idCommande);
		return 1;
	}

	@Override
	public Commande updateCommande(Commande co) {
		return commandeRepository.save(co);
	}

}
