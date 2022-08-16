package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.Estudiante;

@Controller
public class EstudianteController {

	@RequestMapping("/registro")
	public String registro( Model modelo) {
		modelo.addAttribute("estudiante",
				new Estudiante("Juanito","Flores","juanito@gmail.com"));
		return "registro";
		
		
	}
	
}
