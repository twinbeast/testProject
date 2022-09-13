package com.main.Study.InterfaceTest.monster;

import java.util.Random;

public class MonsterVo {
    private String name;
    private int health;
    private MonsterAttack monsterAttack;

    public MonsterVo(String name, int health, MonsterAttack monsterAttack) {
        this.name = name;
        this.health = health;
        this.monsterAttack = monsterAttack;
    }

    public int getMonsterHealth(){
        return this.health;
    }

    public int attack() {
        return monsterAttack.attack() + new Random().nextInt(10) - 3;
    }

    public void monsterDamaged(int amount){
        health -= amount;
    }

    public String getMonsterInfo(){
        return name+" / "+health+" / "+monsterAttack.getDamage();
    }
}
