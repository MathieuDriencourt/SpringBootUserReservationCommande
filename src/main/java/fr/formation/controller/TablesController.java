package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Reservation;

import fr.formation.model.Tables;

import fr.formation.service.IReservationService;
import fr.formation.service.ITablesService;

@RestController
@RequestMapping("tables") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class TablesController {
	
	@Autowired
	ITablesService tablesService;
	@Autowired
	IReservationService reservationService;

	
	@GetMapping("/all")
	public List<Tables> getAllTables() {
		return tablesService.getAllTables();
	}
	
	@GetMapping("/{id}")
	public Tables getById(@PathVariable long id) {
		return tablesService.getTables(id);
	}
	
	@PostMapping
	public Tables createTables(@RequestBody Tables tables) {
		return tablesService.createTables(tables);
	}
	
	@DeleteMapping("/{id}")
	public int deleteTables(@PathVariable long id) {
		return tablesService.deleteTables(id);
	}
	
	@PutMapping("/{id}")
	public Tables updateTables(@PathVariable long id, @RequestBody Tables tables) {
		Tables tablesAModifier = tablesService.getTables(id);
		tablesAModifier.setNbPlacesAssisesTables(tables.getNbPlacesAssisesTables());
		tablesAModifier.setStatusTables(tables.isStatusTables());
		return tablesService.updateTables(tablesAModifier);
	}
	
	@PutMapping("/{idT}/set/{idR}")
	public boolean affectationTablesReservation(@PathVariable long idT, @PathVariable long idR) {
		Tables alinker=tablesService.getTables(idT);
		Reservation linker=reservationService.getReservation(idR);
		alinker.setReservation(linker);
		tablesService.createTables(alinker);
		return true;
	}
}
