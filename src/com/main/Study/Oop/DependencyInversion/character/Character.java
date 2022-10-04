package com.main.Study.Oop.DependencyInversion.character;

/**
 * 캐릭터 객체
 *
 * @author RWB
 * @since 2021.08.17 Tue 00:46:15
 */
public class Character {
    private final String name;
    private int health;
    private Attackable weapon;

    /**
     * Character 생성자 함수
     *
     * @param name: [String] 이름
     * @param health: [int] 체력
     * @param weapon: [Attackable] 무기
     */
    public Character(String name, int health, Attackable weapon)
    {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    /**
     * 공격 데미지 반환 함수
     *
     * @return [int] 공격 데미지
     */
    public int attack()
    {
        return weapon.attack();
    }

    /**
     * 피격 함수
     *
     * @param amount: [int] 피격 데미지
     */
    public void damaged(int amount)
    {
        health -= amount;
    }

    /**
     * 무기 교체 함수
     *
     * @param weapon: [Attackable] 무기
     */
    public void changeWeapon(Attackable weapon)
    {
        this.weapon = weapon;
    }

    /**
     * 캐릭터 정보 출력 함수
     */
    public String getInfo()
    {
        return "Character : "+name+" / "+health+" / "+weapon+"\n";
//        System.out.println("이름: " + name);
//        System.out.println("체력: " + health);
//        System.out.println("무기: " + weapon);
    }
}
