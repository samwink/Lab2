import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        // fight simulation for pokemon's to begin the battle.
        Battle pokemonBattle=new Battle();// default constructor Battle
        Pokemon Girafarig = new Pokemon("Kakashi", 1);

        Pokemon vulpix = new Pokemon("Tangiro", 1);

        Pokemon Ninetales = new Pokemon("Naruto", 1);

        Pokemon Bounsweet = new Pokemon("Sakura", 1);

        Pokemon Steenee = new Pokemon("Itachi", 1);

        Pokemon Tsareena = new Pokemon("Madara", 1);

// pokemon are split into two teams of three and the battle between their teams.
        pokemonBattle.addAlly(Girafarig);

        pokemonBattle.addAlly(vulpix);
//<ClassName> object=new <ClassName>
//object.<MethodName>
        // calling a method.....
        pokemonBattle.addAlly(Ninetales);

        pokemonBattle.addFoe(Bounsweet);

        pokemonBattle.addFoe(Steenee);

        pokemonBattle.addFoe(Tsareena);

        pokemonBattle.go();

    }

}
