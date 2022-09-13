package com.main.Study.InterfaceTest.character;

/**
 * 공격 인터페이스
 *
 * @author RWB
 * @since 2021.08.17 Tue 02:07:19
 */
public interface Attackable
{
    /**
     * 공격 추상 함수
     *
     * @return [int] 공격 데미지
     */
    int attack();

    /**
     * 객체 문자열 반환 추상 함수
     *
     * @return [String] 이름
     */
    @Override
    String toString();
}
