package com.main.Study.InterfaceTest.monster;

import java.util.Random;

public class GoblinAttack implements MonsterAttack {
    private final String name;
    private final int damage;

    public GoblinAttack(){
        this.name = "Goblin Attack";
        this.damage = 5;
    }

    public int getDamage(){
        return this.damage;
    }

    @Override
    public int attack() {
        return this.damage + new Random().nextInt(10) - 3;
    }
}
