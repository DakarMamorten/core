package com.vlad.web.dvdrental.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sergey Manko
 */
@Data
@NoArgsConstructor
public class CategoryDTO {
    private long categoryID;
    private String name;
    private String lastUpdate;

    public CategoryDTO(String name) {
        this.name = name;
    }
}
