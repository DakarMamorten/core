package com.vlad.web.dvdrental.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class FilmCategory {
    private long filmId;
    private long categoryId;
    private LocalDateTime lastUpdate = LocalDateTime.now();

    public FilmCategory() {
    }
}
