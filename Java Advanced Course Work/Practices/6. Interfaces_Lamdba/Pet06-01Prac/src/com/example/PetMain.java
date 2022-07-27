package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        //Pet refernce
        Pet p;

        //test a Cat with Cat reference
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();

        //test a Fish with a fish reference
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();

        a = new Fish();
        a.eat();
        a.walk();
        
        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }

    public static void playWithAnimal(Animal a) {
        
        // Determine whether argument implements the Pet interface

        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
        
}
}

