package application.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterForm {

	@NotNull(message = "Must email is not null!")
	@Size(min = 8, max = 35, message = "Please enter correctly required length of email!")
	private String email;

	@NotNull(message = "Must password is not null!")
	@Size(min = 6, max = 20, message = "Please enter correctly required length of pasword!")
	private String password;

	@NotNull
	@Size(min = 1, max = 1)
	private String gender;
}