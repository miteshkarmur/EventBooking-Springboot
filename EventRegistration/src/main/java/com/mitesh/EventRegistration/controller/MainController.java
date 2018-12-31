package com.mitesh.EventRegistration.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mitesh.EventRegistration.entity.City;
import com.mitesh.EventRegistration.entity.People;
import com.mitesh.EventRegistration.entity.Slot;
import com.mitesh.EventRegistration.service.CityService;
import com.mitesh.EventRegistration.service.PeopleService;
import com.mitesh.EventRegistration.service.SlotService;

@Controller
public class MainController {

	@Autowired
	PeopleService peopleService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	SlotService slotService;
	
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
	public String bookEventSlot(Model model) {
		List<City> citiesList=cityService.getAllCities();
		model.addAttribute("cities",citiesList);
		return "slot-booking";
	}
	@GetMapping("/bookEventSlot2")
	public String bookEventSlot2(Model model) {
		Integer citiId=1;
		City city=cityService.getCitybyId(citiId);
		List<Slot> slotsList=city.getSlots();
		model.addAttribute("slots",slotsList);
		return "slot-booking";
	}
}
