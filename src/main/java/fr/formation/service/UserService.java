package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.model.User;
import fr.formation.repository.IUserRepository;

public class UserService implements IUserService{
	
	@Autowired
	IUserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(Long idUser) {
		Optional<User> userOptional = userRepository.findById(idUser);
		User user = new User();
		if (userOptional.isPresent()) {
			user = userOptional.get();
		}
		
		return user;
		
	}

	@Override
	public User createUser(User us) {
		return userRepository.save(us);
	}

	@Override
	public int deleteUser(Long idUser) {
		userRepository.deleteById(idUser);
		return 1;
	}

	@Override
	public User updateUser(User us) {
		return userRepository.save(us);
	}

}
