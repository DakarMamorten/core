package com.vlad.education.abstractClasses;

import java.util.List;

public  class Fruit {
    private  int waight;

public int totalWeight(List<Orange> oranges){
    waight = 0;
    for (int i = 0; i < oranges.size(); i++) {
         waight = oranges.get(i).getWaight();
        
    }
    return waight;
}
}
