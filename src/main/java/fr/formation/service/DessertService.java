package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Dessert;
import fr.formation.repository.IDessertRepository;


@Service
public class DessertService implements IDessertService{

	@Autowired
	IDessertRepository dessertRepository;
	
	@Override
	public List<Dessert> getAllDessert() {
		return dessertRepository.findAll();
	}

	@Override
	public Dessert getDessert(Long idDessert) {
		Optional<Dessert> dessertOptional = dessertRepository.findById(idDessert);
		Dessert Dessert = new Dessert();
		if (dessertOptional.isPresent()) {
			Dessert = dessertOptional.get();
		}
		
		return Dessert;
	}

	@Override
	public Dessert createDessert(Dessert de) {
		return dessertRepository.save(de);
	}

	@Override
	public int deleteDessert(Long idDessert) {
		dessertRepository.deleteById(idDessert);
		return 1;
	}

	@Override
	public Dessert updateDessert(Dessert de) {
		return dessertRepository.save(de);
	}

}
