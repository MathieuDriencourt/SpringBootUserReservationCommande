package fr.formation.service;

import java.util.Date;
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
	public List<ReservationMidi> getAllReservationMidi() {
		return reservationRepository.findAll();
	}

	@Override
	public ReservationMidi getReservationMidi(Long idReservation) {
		Optional<ReservationMidi> reservationOptional = reservationRepository.findById(idReservation);
		ReservationMidi reservation = new ReservationMidi();
		if (reservationOptional.isPresent()) {
			reservation = reservationOptional.get();
		}
		
		return reservation;
	}

	@Override
	public ReservationMidi createReservationMidi(ReservationMidi re) {
		
		return reservationRepository.save(re);
		
	}

	@Override
	public int deleteReservationMidi(Long idReservation) {
		reservationRepository.deleteById(idReservation);
		return 1;
	}

	@Override
	public ReservationMidi updateReservationMidi(ReservationMidi re) {
		return reservationRepository.save(re);
	}

	@Override
	public int nbPlacesRestantes(Date dateReservationMidi) {
		try {
			List<ReservationMidi>list=reservationRepository.findByDateReservationMidiIs(dateReservationMidi);
			if (list.size()==0) {
				return 20;
			}
			else {
				int placesOccupes = 0;
				for (int i = 0; i < list.size() ; i++) {
					placesOccupes = placesOccupes + list.get(i).getNbPersonnnesReservationMidi();
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
