package versusme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import versusme.entity.User;
import versusme.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUsers() throws Exception{
		try {
			return userService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId) throws Exception{
		try {
			return userService.getUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception{
		try {
			return userService.createUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> editUser(@PathVariable Long userId, @RequestBody User user) throws Exception{
		try {
			return userService.editUser(userId, user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long userId) throws Exception{
		try {
			return userService.deleteUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
}
