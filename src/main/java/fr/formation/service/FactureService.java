package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Facture;

import fr.formation.repository.IFactureRepository;

@Service
public class FactureService implements IFactureService{
	
	@Autowired
	IFactureRepository factureRepository;

	@Override
	public List<Facture> getAllFacture() {
		return factureRepository.findAll();
		
	}

	@Override
	public Facture getFacture(Long idFacture) {
		Optional<Facture> factureOptional = factureRepository.findById(idFacture);
		Facture facture = new Facture();
		if (factureOptional.isPresent()) {
			facture = factureOptional.get();
		}
		
		return facture;
	}	

	@Override
	public Facture createFacture(Facture fa) {
		return factureRepository.save(fa);
		
	}

	@Override
	public int deleteFacture(Long idFacture) {
		factureRepository.deleteById(idFacture);
		return 1;
	}

	@Override
	public Facture updateFacture(Facture fa) {
		return factureRepository.save(fa);
		
	}

}
