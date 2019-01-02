package com.mitesh.EventRegistration.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
			model.addAttribute("errorMessage", "Email id is not pre-registered");
			return "index";
		}
		model.addAttribute("people",p.get());
		request.getSession().setAttribute("user_email", email);
		return "people-detail";
	}
	@GetMapping("/bookEvent")
	public String bookEventSlot(Model model) {
		List<City> citiesList=cityService.getAllCities();
		HashMap<Integer, String> citiesMap=new HashMap<>();
		citiesList.forEach(city->citiesMap.put(city.getCode(), city.getName()));
		model.addAttribute("cities",citiesMap);
		model.addAttribute("city",new City());
		return "slot-booking";
	}

	@RequestMapping(value="/citySelected", method=RequestMethod.POST)
	public String bookEventSlot2(@ModelAttribute("city") City city, Model model) {

		City cityObj=cityService.getCitybyId(city.getCode());
		List<Slot> slotsList=cityObj.getSlots();
		HashMap<Integer, String> slotsMap=new HashMap<>();
		slotsList.forEach(slot->
		{	
			if(slot.getNoOfTickets()>0) {
				slotsMap.put(slot.getSlotId(), slot.toString());
			}
		});
		model.addAttribute("slots",slotsMap);
		model.addAttribute("slot",new Slot());
		return "slot-booking2";
	}
	@RequestMapping(value="/slotSelected",method=RequestMethod.POST)
	synchronized public String bookEventSlot2(@ModelAttribute("slot") Slot slot, Model model,HttpServletRequest request) {

		Slot slotObj=slotService.getSlotById(slot.getSlotId());
		if(slotObj.getNoOfTickets()>0) {
			String email=(String) request.getSession().getAttribute("user_email");
			People people=peopleService.getPeopleByEmail(email).get();
			if(people.getSlot()==null) {
				slotObj.setNoOfTickets(slotObj.getNoOfTickets()-1);
				slotService.saveOrUpdateSlot(slotObj);
				people.setSlot(slotObj);
				peopleService.saveOrUpdateSlot(people);
				model.addAttribute("people",people);
				return "booking-successful";
			}else {
				String errorMessage="User has already booked a slot";
				model.addAttribute("errorMessage",errorMessage);
				return "failure";
			}	
		}else {
			String errorMessage="Seats are full for this slot ! Try again with other slot";
			model.addAttribute("errorMessage",errorMessage);
			return "failure";
		}
		
	}
}
