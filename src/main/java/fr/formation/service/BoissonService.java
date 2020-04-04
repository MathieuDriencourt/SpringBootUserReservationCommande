package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Boisson;
import fr.formation.repository.IBoissonRepository;

@Service
public class BoissonService implements IBoissonService{

	@Autowired
	IBoissonRepository boissonRepository;
	@Override
	public List<Boisson> getAllBoisson() {
		return boissonRepository.findAll();
	}

	@Override
	public Boisson getBoisson(Long idBoisson) {
		Optional<Boisson> BoissonOptional = boissonRepository.findById(idBoisson);
		Boisson Boisson = new Boisson();
		if (BoissonOptional.isPresent()) {
			Boisson = BoissonOptional.get();
		}
		
		return Boisson;
	}

	@Override
	public Boisson createBoisson(Boisson bo) {
		return boissonRepository.save(bo);
	}

	@Override
	public int deleteBoisson(Long idBoisson) {
		boissonRepository.deleteById(idBoisson);
		return 1;
	}

	@Override
	public Boisson updateBoisson(Boisson bo) {
		return boissonRepository.save(bo);
	}

}
