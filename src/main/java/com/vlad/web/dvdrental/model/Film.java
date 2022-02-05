package com.vlad.web.dvdrental.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class Film {

    private int filmId;
    private String title;
    private String description;
    private int releaseYear;
    private int languageId;
    private int rentalDuration;
    private double rentalRate;
    private int length;
    private double replacementCost;
    private String rating;
    private LocalDateTime lastUpdate = LocalDateTime.now();
    private String specialFeatures;
    private String fullText;

    public Film() {
    }
}
