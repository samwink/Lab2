package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleHit extends PhysicalMove {
     public DoubleHit()
     {
         super(Type.NORMAL,35,90);
     }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcCriticalHit(pokemon, pokemon1);
    }

}
