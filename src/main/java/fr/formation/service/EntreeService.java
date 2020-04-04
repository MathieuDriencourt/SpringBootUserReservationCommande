package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Entree;

import fr.formation.repository.IEntreeRepository;

@Service
public class EntreeService implements IEntreeService{
	
	@Autowired
	IEntreeRepository entreeRepository;

	@Override
	public List<Entree> getAllEntree() {
		return entreeRepository.findAll();
	}

	@Override
	public Entree getEntree(Long idEntree) {
		Optional<Entree> entreeOptional = entreeRepository.findById(idEntree);
		Entree Entree = new Entree();
		if (entreeOptional.isPresent()) {
			Entree = entreeOptional.get();
		}
		
		return Entree;
	}

	@Override
	public Entree createEntree(Entree en) {
		return entreeRepository.save(en);
	}

	@Override
	public int deleteEntree(Long idEntree) {
		entreeRepository.deleteById(idEntree);
		return 1;
	}

	@Override
	public Entree updateEntree(Entree en) {
		return entreeRepository.save(en);
	}

}
