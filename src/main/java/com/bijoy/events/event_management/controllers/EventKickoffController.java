package com.bijoy.events.event_management.controllers;

import com.bijoy.events.event_management.entities.Event;
import com.bijoy.events.event_management.repos.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@RepositoryRestController
public class EventKickoffController {
    @Autowired
    private EventRepository eventRepository;

    @PatchMapping("/events/kickoff/{id}")
    public ResponseEntity<PersistentEntityResource> eventKickoff(
            @PathVariable Integer id, PersistentEntityResourceAssembler assembler) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            event.setStatus(true);
            eventRepository.save(event);
            return ResponseEntity.ok(assembler.toFullResource(event));
        } else {
            String message = String.format("Event with id: %d is not found!", id);
            System.out.println(message);
            throw new ResourceNotFoundException(message);
        }
    }
}
