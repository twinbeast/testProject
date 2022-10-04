package com.main.Study.Oop.DependencyInversion;

import com.main.Study.Oop.DependencyInversion.character.Character;
import com.main.Study.Oop.DependencyInversion.monster.GoblinAttack;
import com.main.Study.Oop.DependencyInversion.monster.MonsterVo;
import com.main.Study.Oop.DependencyInversion.character.OneHandSword;

public class dependencyInversionTestClass {
    /**
     * 의존성 역전 원칙
     * 객체는 저수준 모듈보다 고수준 모듈에 의존해야한다.
     * 고수준 - 인터페이스
     * 저수준 - 구현된 객체
     * https://blog.itcode.dev/posts/2021/08/17/dependency-inversion-principle
     **/
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
