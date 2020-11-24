package service.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.app.model.User;
import service.app.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/v0")
public class UserController {

	@Autowired
	private UserServiceImpl user;

	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody User usr) {
		user.save(usr);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/findAll")
	public ResponseEntity<?> read() {
		return ResponseEntity.ok(user.findAll());
	}
}
