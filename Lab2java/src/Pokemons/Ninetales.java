package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Ninetales extends Pokemon{
    public Ninetales(String name,int level){
        super(name , level); // super keyword refers to superclass (parent) objects.(when using inheritance it refers to the parent class or object) It is used to
        // call superclass methods, and to access the superclass constructor

        // Every pokemon must have three attributes or characteristics plugged in:
        // Must be of 1 or 2 type, Must have all standard base stats and Must have a move for the battle.

        setType(Type.FIRE);

        setStats(73,76,75,81,100,100);

        setMove(new DarkPulse() , new Facade() , new Overheat() , new NastyPlot());
    }
}
