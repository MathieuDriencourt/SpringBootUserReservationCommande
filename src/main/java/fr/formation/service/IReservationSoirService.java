package fr.formation.service;

import java.util.List;

import fr.formation.model.ReservationSoir;


public interface IReservationSoirService {

	
	public List<ReservationSoir> getAllReservationSoir();
	public ReservationSoir getReservationSoir(Long idReservationSoir);
	public ReservationSoir createReservationSoir(ReservationSoir rs);
	public int deleteReservationSoir(Long idReservationSoir);
	public ReservationSoir updateReservationSoir(ReservationSoir rs);
}
