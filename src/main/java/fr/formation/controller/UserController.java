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
import fr.formation.model.User;
import fr.formation.service.IRoleService;
import fr.formation.service.IUserService;

@RestController
@RequestMapping("user") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	IUserService userService;
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/all")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable long id) {
		return userService.getUser(id);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@DeleteMapping("/{id}")
	public int deleteUser(@PathVariable long id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable long id, @RequestBody User user) {
		User userAModifier = userService.getUser(id);
		userAModifier.setNomUser(user.getNomUser());
		userAModifier.setPrenomUser(user.getPrenomUser());
		userAModifier.setMailUser(user.getMailUser());
		return userService.updateUser(userAModifier);
	}
	
	@PutMapping("/{idU}/set/{idR}")
	public boolean affectationUserRole(@PathVariable long idU, @PathVariable long idR) {
		User alinker=userService.getUser(idU);
		Role linker=roleService.getRole(idR);
		alinker.setRole(linker);
		userService.createUser(alinker);
		return true;
	}
	
	
}
