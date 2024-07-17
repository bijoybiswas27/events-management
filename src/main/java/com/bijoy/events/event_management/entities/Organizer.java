package com.bijoy.events.event_management.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;

import java.util.Objects;
@JsonPropertyOrder({"organizerId"})
@Entity
public class Organizer extends AbstractEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return Objects.equals(id, ((Organizer) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public int getOrganizerId() {
        return this.id;
    }
}
