package service.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.app.model.User;
import service.app.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepo;

	public User save(User user) {
		return userRepo.save(user);
	}
	
	public List<User> findAll() {
		return userRepo.findAll();
	}


}
