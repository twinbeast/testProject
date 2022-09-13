package com.main.Study.InterfaceTest.character;

import java.util.Random;
/**
 * 한손검 객체
 *
 * @author RWB
 * @since 2021.08.17 Tue 01:36:44
 */
public class OneHandSword implements Attackable {
    private final String name;
    private final int damage;

    /**
     * OneHandSword 생성자 함수
     *
     * @param name: [String] 무기 이름
     * @param damage: [int] 데미지
     */
    public OneHandSword()
    {
        this.name = "OneHandSword";
        this.damage = 10;
    }

    /**
     * 공격 데미지 반환 함수
     *
     * @return [int] 공격 데미지 (데미지 +-5)
     */
    @Override
    public int attack()
    {
        return damage + new Random().nextInt(10) - 5;
    }

    /**
     * 객체 문자열 반환 함수
     *
     * @return [String] 이름
     */
    @Override
    public String toString()
    {
        return name;
    }
}