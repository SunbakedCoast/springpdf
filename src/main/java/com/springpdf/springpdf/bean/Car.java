package com.springpdf.springpdf.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Long id;
    private String name;
    private int price;

    public Car(){}

    public Car(Long id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
