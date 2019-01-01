package com.mitesh.EventRegistration.service;

import com.mitesh.EventRegistration.entity.Slot;

public interface SlotService {

	public Slot getSlotById(Integer slotId);

	public void saveOrUpdateSlot(Slot slotObj);

}
