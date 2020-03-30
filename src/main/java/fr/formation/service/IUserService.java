package fr.formation.service;

import java.util.List;

import fr.formation.model.User;



public interface IUserService {

	
	public List<User> getAllUser();
	public User getUser(Long idUser);
	public User createUser(User us);
	public int deleteUser(Long idUser);
	public User updateUser(User us);
	
}
