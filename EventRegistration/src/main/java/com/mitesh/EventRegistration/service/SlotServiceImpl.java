package com.mitesh.EventRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitesh.EventRegistration.entity.Slot;
import com.mitesh.EventRegistration.repository.SlotRepo;

@Service
public class SlotServiceImpl implements SlotService {

	@Autowired
	SlotRepo slotRepo;
	
	@Override
	public Slot getSlotById(Integer slotId) {
		
		return slotRepo.findById(slotId).get();
	}

	@Override
	public void saveOrUpdateSlot(Slot slotObj) {
		slotRepo.save(slotObj);
	}

	


}
