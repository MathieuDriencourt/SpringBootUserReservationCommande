package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Role;
import fr.formation.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	IRoleRepository roleRepository;

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role getRole(Long idRole) {
		Optional<Role> roleOptional = roleRepository.findById(idRole);
		Role role = new Role();
		if (roleOptional.isPresent()) {
			role = roleOptional.get();
		}
		
		return role;
	}

	@Override
	public Role createRole(Role ro) {
		return roleRepository.save(ro);
	}

	@Override
	public int deleteRole(Long idRole) {
		roleRepository.deleteById(idRole);
		return 1;
	}

	@Override
	public Role updateRole(Role ro) {
		return roleRepository.save(ro);
	}

}
