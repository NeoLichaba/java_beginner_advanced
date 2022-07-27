
package com.example;

/**
 *
 * 
 */
public class Fish extends Animal implements Pet {
    
    private String name;
    

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public Fish(){
        super(0);
    }
    
    @Override
    public void play(){
        System.out.println("Just keep swimming");
    }
    
    @Override
    public void eat(){
        System.out.println("Fish eat pond scum");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim");
    }
    
}

