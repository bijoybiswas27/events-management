package com.bijoy.events.event_management.repos;

import com.bijoy.events.event_management.entities.Venue;
import com.bijoy.events.event_management.entities.projections.VenueStreetAddressProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = VenueStreetAddressProjection.class)
public interface VenueRepository extends JpaRepository<Venue, Integer> {
    Page<Venue> findByStateAndCountry(@Param("state") String state,
                                      @Param("country") String country, Pageable pageable);
}
