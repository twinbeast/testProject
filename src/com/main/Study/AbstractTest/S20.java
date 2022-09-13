package com.main.Study.AbstractTest;

import com.main.Study.AbstractTest.Interface.ARable;
import com.main.Study.AbstractTest.Interface.Biometricsable;
import com.main.Study.AbstractTest.Interface.WirelessChargable;

/**
 * S20 객체
 *
 * @author RWB
 * @since 2021.08.16 Mon 17:12:23
 */
public class S20 extends SmartPhone implements WirelessChargable, ARable, Biometricsable
{
    /**
     * 무선충전 함수
     */
    @Override
    public void wirelessCharge()
    {
        System.out.println("무선충전 기능");
    }

    /**
     * AR 함수
     */
    @Override
    public void ar()
    {
        System.out.println("AR 기능");
    }

    /**
     * 생체인식 함수
     */
    @Override
    public void biometrics()
    {
        System.out.println("생체인식 기능");
    }
}

