package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ErrorController {

	@ExceptionHandler(NullPointerException.class)
	public String NullPointerException() {
		return "error";
	}
	@ExceptionHandler(Throwable.class)
	public String ThrowableHandler() {
		return "error";
	}
	@RequestMapping(value = "/error",method = RequestMethod.GET)
	public String errorpage() throws Exception{
		throw new Exception();
	}
	@PostMapping("/login")
	public String error() {
		return "redirect:/login";
		
	}
}
