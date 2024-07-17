package com.bijoy.events.event_management.entities.projections;

import com.bijoy.events.event_management.entities.Venue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.Instant;

@Projection(name = "streetaddress", types = { Venue.class })
public interface VenueStreetAddressProjection {
    @Value("#{target.streetaddress1}, #{target.streetaddress2}")
    String getStreet();
    String getCountry();
    Instant getCreated();
}
