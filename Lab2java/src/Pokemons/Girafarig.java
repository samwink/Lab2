package Pokemons;

import  Moves.*;
import ru.ifmo.se.pokemon.*;
public class Girafarig extends Pokemon { // extends here implies the inheritance from the Pokemon class.
    public Girafarig(String name , int level){ // attributes of this pokemon.
        super(name , level); // super keyword refers to superclass (parent) objects.(when using inheritance it refers to the parent class or object) It is used to
        // call superclass methods, and to access the superclass constructor

        // Every pokemon must have three attributes or characteristics plugged in:
        // Must be of 1 or 2 type, Must have all standard base stats and Must have a move for the battle.

        setType(Type.NORMAL, Type.PSYCHIC);

        setStats(70,80,65,90,65,85);

        setMove(new Growl(), new DoubleHit() , new TakeDown() , new WorkUp());
    }
}
