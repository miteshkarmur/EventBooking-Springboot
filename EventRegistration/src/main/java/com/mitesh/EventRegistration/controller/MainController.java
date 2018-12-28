package com.mitesh.EventRegistration.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mitesh.EventRegistration.entity.People;
import com.mitesh.EventRegistration.service.PeopleService;

@Controller
public class MainController {

	@Autowired
	PeopleService peopleService;
	
	@GetMapping("/")
	public String getIndexPage() {
		return "index";
	}
	@GetMapping("/validateEmail")
	public String validateEmail(HttpServletRequest request, Model model) {
		String email=request.getParameter("email");
		Optional<People> p=peopleService.getPeopleByEmail(email);
		if(!p.isPresent()) {
			System.out.println("Email id is not pre-registered");
			return "index";
		}else if(p.get().getBookingFlag()) {
			System.out.println("Event slot is already booked");
		}
		System.out.println(p.get());
		model.addAttribute("people",p.get());
		return "people-detail";
	}
	@GetMapping("/bookEventSlot")
	public String bookEventSlot() {
		return "index";
	}
}
