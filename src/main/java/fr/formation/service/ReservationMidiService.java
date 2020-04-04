package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.ReservationMidi;
import fr.formation.repository.IReservationMidiRepository;

@Service
public class ReservationMidiService implements IReservationMidiService{
	
	@Autowired
	IReservationMidiRepository reservationRepository;

	@Override
	public List<ReservationMidi> getAllReservation() {
		return reservationRepository.findAll();
	}

	@Override
	public ReservationMidi getReservation(Long idReservation) {
		Optional<ReservationMidi> reservationOptional = reservationRepository.findById(idReservation);
		ReservationMidi reservation = new ReservationMidi();
		if (reservationOptional.isPresent()) {
			reservation = reservationOptional.get();
		}
		
		return reservation;
	}

	@Override
	public ReservationMidi createReservation(ReservationMidi re) {
		//if (re.getClient().getRole().getNomRole() == "Client") 
		return reservationRepository.save(re);
		//else return null;
	}

	@Override
	public int deleteReservation(Long idReservation) {
		reservationRepository.deleteById(idReservation);
		return 1;
	}

	@Override
	public ReservationMidi updateReservation(ReservationMidi re) {
		return reservationRepository.save(re);
	}

}
