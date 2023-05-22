package com.spring.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String checkLogin(User user) {
		User user1 = userRepository.findById(user.getEmail()).get();
		System.out.println(user1);
		if (user.getPassword().equals(user1.getPassword()))
			return "redirect:/?success1";

		else
			return "redirect:/?fail1";

	}

	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/?success";

	}
}
