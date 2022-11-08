package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Steenee extends Pokemon {
    public Steenee(String name , int level){
        super(name , level); // super keyword refers to superclass (parent) objects.(when using inheritance it refers to the parent class or object) It is used to
        // call superclass methods, and to access the superclass constructor

        // Every pokemon must have three attributes or characteristics plugged in:
        // Must be of 1 or 2 type, Must have all standard base stats and Must have a move for the battle.

        setType(Type.GRASS);

        setStats(52,40,48,40,48,62);

        setMove(new RazorLeaf() , new DoubleTeam() , new PlayNice());
    }

}
