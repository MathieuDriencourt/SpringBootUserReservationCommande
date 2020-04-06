package fr.formation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.formation.model.ReservationSoir;

import fr.formation.repository.IReservationSoirRepository;

@Service
public class ReservationSoirService implements IReservationSoirService{
	
	@Autowired
	IReservationSoirRepository reservationSoirRepository;

	@Override
	public List<ReservationSoir> getAllReservationSoir() {
		return reservationSoirRepository.findAll();
	}

	@Override
	public ReservationSoir getReservationSoir(Long idReservationSoir) {
		Optional<ReservationSoir> reservationSoirOptional = reservationSoirRepository.findById(idReservationSoir);
		ReservationSoir reservationSoir = new ReservationSoir();
		if (reservationSoirOptional.isPresent()) {
			reservationSoir = reservationSoirOptional.get();
		}
		
		return reservationSoir;
	}

	@Override
	public ReservationSoir createReservationSoir(ReservationSoir pl) {
		return reservationSoirRepository.save(pl);
	}

	@Override
	public int deleteReservationSoir(Long idReservationSoir) {
		reservationSoirRepository.deleteById(idReservationSoir);
		return 1;
	}

	@Override
	public ReservationSoir updateReservationSoir(ReservationSoir pl) {
		return reservationSoirRepository.save(pl);
	}

	@Override
	public int placesRestantes(Date dateReservationSoir) {
		try {
			List<ReservationSoir>list=reservationSoirRepository.findByDateReservationSoirIs(dateReservationSoir);
			if (list.size()==0) {
				return 20;
			}
			else {
				int placesOccupes = 0;
				for (int i = 0; i < list.size() ; i++) {
					placesOccupes = placesOccupes + list.get(i).getNbPersonnnesReservationSoir();
				}
				return 20 - placesOccupes;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		return 0;
	}
	}
	
	

}
