package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Plat;

import fr.formation.repository.IPlatRepository;

@Service
public class PlatService implements IPlatService{
	
	@Autowired
	IPlatRepository platRepository;

	@Override
	public List<Plat> getAllPlat() {
		return platRepository.findAll();
	}

	@Override
	public Plat getPlat(Long idPlat) {
		Optional<Plat> platOptional = platRepository.findById(idPlat);
		Plat plat = new Plat();
		if (platOptional.isPresent()) {
			plat = platOptional.get();
		}
		
		return plat;
	}

	@Override
	public Plat createPlat(Plat pl) {
		return platRepository.save(pl);
	}

	@Override
	public int deletePlat(Long idPlat) {
		platRepository.deleteById(idPlat);
		return 1;
	}

	@Override
	public Plat updatePlat(Plat pl) {
		return platRepository.save(pl);
	}
	
	

}
