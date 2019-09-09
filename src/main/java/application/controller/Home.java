package application.controller;

//import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.form.LoginForm;

@Controller
public class Home {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}

	@RequestMapping(value = {"/login" }, method = RequestMethod.GET)
	public String login(LoginForm loginForm, Model model) {
		return "login";
	}

	@RequestMapping(value = {"/login" }, method = RequestMethod.POST)
	public String checkLogin(
		@RequestParam(required = false) String email,
    	@RequestParam(required = false) String password,
    	@RequestParam(required = false) String remmeber,
		@Valid LoginForm loginForm, 
		BindingResult bindingResult,
		Model model,
        HttpServletRequest req
    ) {
		return "login";
	}
}