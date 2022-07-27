package com.example;

/**
 *
 * @author User
 */
public class Cat extends Animal implements Pet {

    private String name;    

    public Cat() {
        this("Fluffy");
    }
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(getName() + " likes to play with string.");
    }
    
    @Override
    public void eat(){
        System.out.println("Cats like to eat spiders and fish");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
