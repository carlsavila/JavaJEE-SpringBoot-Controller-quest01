package com.wildcodeschool.HelloIamTheDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
	
	@GetMapping("/doctor/{userId}")
	@ResponseBody
	public String getDoctor(@PathVariable String userId) {
		switch(userId) {
		case "1":
			return "<ul><li><span>William Hartnell</span><br><a href=\"/doctor\">Retour</a></li></ul>";
		case "10":
			return "<ul><li><span>David Tennant</span><br><a href=\"/doctor\">Retour</a></li></ul>";
		case "13":
			return "<ul><li><span>Jodie Whittaker</span><br><a href=\"/doctor\">Retour</a></li></ul>";
		default :
			return "<ul><li><span>Il n'y a pas de Doctor pour l'id \"" + userId + "</span><br><a href=\"/doctor\">Retour</a></li></ul>";
		}
	}
	
	@GetMapping("/doctor")
	public String getDoctor() {
		return "/index.html";
	}

}
