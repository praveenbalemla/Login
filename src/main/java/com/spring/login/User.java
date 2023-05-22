package com.spring.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_info")
public class User {
	private String name;
	private String password;
	@Id
	private String email;
	private String country;
	private String gender;

}
