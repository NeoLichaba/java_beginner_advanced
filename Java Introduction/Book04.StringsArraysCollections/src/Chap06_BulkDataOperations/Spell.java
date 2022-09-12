package Chap06_BulkDataOperations;

import java.util.ArrayList;

/* 
 * Code on page 465
 *
 */
public class Spell {

    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {                                                     //enum = constants
        SPELL, CHARM, CURSE                                                     //variables
    }

    public Spell(String spellName, SpellType spellType,
            String spellDescription) {                                          //constructor lets you specift the name, type and description for spell
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    @Override
    public String toString() {
        return name;                                                            //return spell name
    }

    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();                            //ArrayList created with element Spell and constructor called
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, //Spells are loaded into ArrayList
                "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs."));

//spells.stream().forEach(s -> System.out.println(s));                          //equivalent to forEach loop; prints out each spell
        //spells.stream() //converts ArrayList to a stream
          //      .filter(s -> s.type == Spell.SpellType.SPELL)                    //filter method used to select spell items
            //    .filter(s -> s.name.toLowerCase().startsWith("a"))              //filter method used to convert spell name that starts with the letter "a" 
              //  .forEach(s -> System.out.println(s));                           //entire stream processed through the forEach loop
                                                                                    //to print out the spells

//Parallel streams demonstrated  
//spells.parallelStream().forEach(s -> System.out.println(s));                  //printing out spells using parallel stream                                                         
        System.out.println("First Parallel stream: ");
        spells.parallelStream()
              .forEach(s -> System.out.println(s));
        System.out.println("\nSecond Parallel stream: ");
        spells.parallelStream()
              .forEach(s -> System.out.println(s));
    }
}
