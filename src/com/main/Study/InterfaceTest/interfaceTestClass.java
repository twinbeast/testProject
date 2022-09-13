package com.main.Study.InterfaceTest;

import com.main.Study.InterfaceTest.character.Character;
import com.main.Study.InterfaceTest.monster.GoblinAttack;
import com.main.Study.InterfaceTest.monster.MonsterVo;
import com.main.Study.InterfaceTest.character.OneHandSword;

public class interfaceTestClass {

    public static void main(String[] args){
        Character character = new Character("testUser", 100, new OneHandSword());
        MonsterVo monster = new MonsterVo("Goblin", 20, new GoblinAttack());

        System.out.println(character.getInfo());

        System.out.println("Character Meet Monster - "+monster.getMonsterInfo());

        int turn = 1;
        while (monster.getMonsterHealth()>0){
            int monsterDamage = monster.attack();
            System.out.println("Monster Attack Character - "+monsterDamage+"\n");

            character.damaged(monsterDamage);
            System.out.println(character.getInfo());

            int characterAttack = character.attack();
            if(characterAttack > monster.getMonsterHealth())
                characterAttack = monster.getMonsterHealth();
            System.out.println("Character Attack Monster - "+characterAttack);
            monster.monsterDamaged(characterAttack);
            System.out.println("Monster Damaged - "+monster.getMonsterInfo());
            turn += 1;
        }

        System.out.println("Character Win! ("+turn+" turn) - "+character.getInfo());
    }
}
