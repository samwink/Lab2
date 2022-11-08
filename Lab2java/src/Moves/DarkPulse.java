package Moves;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse(){
        super(Type.DARK,80,100);
    }

    @Override
    protected void applyOppDamage(Pokemon def,double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return "defending pokemon just took a terrible hit.";
    }
}
//