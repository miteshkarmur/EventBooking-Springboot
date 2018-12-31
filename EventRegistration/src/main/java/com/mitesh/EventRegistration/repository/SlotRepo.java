package com.mitesh.EventRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitesh.EventRegistration.entity.Slot;
@Repository
public interface SlotRepo extends JpaRepository<Slot, Integer> {

}
