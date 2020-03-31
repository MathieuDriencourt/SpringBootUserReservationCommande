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

import fr.formation.model.Role;

import fr.formation.service.IRoleService;

@RestController
@RequestMapping("role") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class RoleController {

	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/all")
	public List<Role> getAllRole() {
		return roleService.getAllRole();
	}
	
	@GetMapping("/{id}")
	public Role getById(@PathVariable long id) {
		return roleService.getRole(id);
	}
	
	@PostMapping
	public Role createRole(@RequestBody Role role) {
		return roleService.createRole(role);
	}
	
	@DeleteMapping("/{id}")
	public int deleteRole(@PathVariable long id) {
		return roleService.deleteRole(id);
	}
	
	@PutMapping("/{id}")
	public Role updateRole(@PathVariable long id, @RequestBody Role role) {
		Role roleAModifier = roleService.getRole(id);
		roleAModifier.setNomRole(role.getNomRole());
		return roleService.updateRole(roleAModifier);
	}
}
