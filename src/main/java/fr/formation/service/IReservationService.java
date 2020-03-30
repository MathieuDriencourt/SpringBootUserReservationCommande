package fr.formation.service;

import java.util.List;

import fr.formation.model.Reservation;



public interface IReservationService {

	public List<Reservation> getAllReservation();
	public Reservation getReservation(Long idReservation);
	public Reservation createReservation(Reservation re);
	public int deleteReservation(Long idReservation);
	public Reservation updateReservation(Reservation re);
}
