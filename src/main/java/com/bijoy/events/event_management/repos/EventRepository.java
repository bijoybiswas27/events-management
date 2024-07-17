package com.bijoy.events.event_management.repos;

import com.bijoy.events.event_management.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findByName(@Param("name") String name);

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Override
    void deleteById(Integer id);
}
