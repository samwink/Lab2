package Pokemons;

import Moves.DarkPulse;
import Moves.Facade;
import Moves.Overheat;
import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {
    public Vulpix(String name , int level){
        super(name , level); // super keyword refers to superclass (parent) objects.(when using inheritance it refers to the parent class or object) It is used to
        // call superclass methods, and to access the superclass constructor

        // Every pokemon must have three attributes or characteristics plugged in:
        // Must be of 1 or 2 type, Must have all standard base stats and Must have a move for the battle.

        setType(Type.FIRE);

        setStats(38,41,40,50,65,65);

        setMove(new DarkPulse() , new Facade() , new Overheat() );
    }

}
