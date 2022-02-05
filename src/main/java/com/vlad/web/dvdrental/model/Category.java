package com.vlad.web.dvdrental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long categoryId;
    private String name;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}
