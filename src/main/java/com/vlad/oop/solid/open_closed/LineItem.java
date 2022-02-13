package com.vlad.oop.solid.open_closed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineItem {
    private int id;
    private String name;
    private double weight;
    private int quantity;
}
