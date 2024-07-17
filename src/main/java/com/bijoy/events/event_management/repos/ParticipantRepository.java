package com.bijoy.events.event_management.repos;

import com.bijoy.events.event_management.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
