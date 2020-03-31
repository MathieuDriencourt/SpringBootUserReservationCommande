package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Tables;
import fr.formation.repository.ITablesRepository;

@Service
public class TablesService implements ITablesService{
	
	@Autowired
	ITablesRepository tablesRepository;

	@Override
	public List<Tables> getAllTables() {
		return tablesRepository.findAll();
		
	}

	@Override
	public Tables getTables(Long idTables) {
		Optional<Tables> tablesOptional = tablesRepository.findById(idTables);
		Tables tables = new Tables();
		if (tablesOptional.isPresent()) {
			tables = tablesOptional.get();
		}
		
		return tables;
	}

	@Override
	public Tables createTables(Tables ta) {
		return tablesRepository.save(ta);
	}

	@Override
	public int deleteTables(Long idTables) {
		tablesRepository.deleteById(idTables);
		return 1;
	}

	@Override
	public Tables updateTables(Tables ta) {
		return tablesRepository.save(ta);
	}

}
