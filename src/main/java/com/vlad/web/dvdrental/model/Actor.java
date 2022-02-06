package com.vlad.web.dvdrental.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor

public class Actor {
    private long actorId;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;

    public Actor() {
    }
}
