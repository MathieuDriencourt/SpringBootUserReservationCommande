package fr.formation.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.ReservationMidi;

public interface IReservationMidiRepository extends JpaRepository<ReservationMidi, Long>{

	
	public List<ReservationMidi> findByDateReservationMidiIs(Date dateReservationMidi);
	
	
}
