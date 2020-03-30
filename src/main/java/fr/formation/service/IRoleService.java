package fr.formation.service;

import java.util.List;

import fr.formation.model.Role;



public interface IRoleService {

	public List<Role> getAllRole();
	public Role getRole(Long idRole);
	public Role createRole(Role ro);
	public int deleteRole(Long idRole);
	public Role updateRole(Role ro);
}
