package com.main.Study.Oop.DependencyInversion.monster;

public interface MonsterAttack {
    int attack();
    int getDamage();

    @Override
    String toString();
}
