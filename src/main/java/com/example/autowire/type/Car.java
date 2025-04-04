package com.example.autowire.type;

public class Car {

    private Specification specification;


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void showSpecification(){
        System.out.println(specification.toString());
    }
}
