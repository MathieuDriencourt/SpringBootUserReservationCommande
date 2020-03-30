package fr.formation.service;

import java.util.List;

import fr.formation.model.Tables;



public interface ITablesService {

	
	public List<Tables> getAllTables();
	public Tables getTables(Long idTables);
	public Tables createTables(Tables ta);
	public int deleteTables(Long idTables);
	public Tables updateTables(Tables ta);
}
