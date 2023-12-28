package versusme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import versusme.entity.User;
import versusme.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public ResponseEntity<User> getUser(Long userId) throws Exception {
		return ResponseEntity.ok(userRepository.findById(userId).orElseThrow(() -> new Exception("Usuario no encontrado")));
	}
	
	public ResponseEntity<User> createUser(User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	public ResponseEntity<User> editUser(Long userId, User user) throws Exception {
		userRepository.findById(userId).orElseThrow(() -> new Exception("Usuario no encontrado"));
		user.setUserId(userId);
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	public ResponseEntity<Void> deleteUser(Long userId) throws Exception {
		User user = userRepository.findById(userId).orElseThrow(() -> new Exception("Usuario no encontrado"));
		userRepository.delete(user);
		return ResponseEntity.ok().build();
	}

}
