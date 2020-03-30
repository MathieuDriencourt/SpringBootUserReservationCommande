package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import fr.formation.model.Reservation;
import fr.formation.repository.IReservationRepository;

public class ReservationService implements IReservationService{
	
	@Autowired
	IReservationRepository reservationRepository;

	@Override
	public List<Reservation> getAllReservation() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation getReservation(Long idReservation) {
		Optional<Reservation> reservationOptional = reservationRepository.findById(idReservation);
		Reservation reservation = new Reservation();
		if (reservationOptional.isPresent()) {
			reservation = reservationOptional.get();
		}
		
		return reservation;
	}

	@Override
	public Reservation createReservation(Reservation re) {
		return reservationRepository.save(re);
	}

	@Override
	public int deleteReservation(Long idReservation) {
		reservationRepository.deleteById(idReservation);
		return 1;
	}

	@Override
	public Reservation updateReservation(Reservation re) {
		return reservationRepository.save(re);
	}

}
