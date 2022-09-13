package com.main.Study.AbstractTest;

import com.main.Study.AbstractTest.Interface.ARable;
import com.main.Study.AbstractTest.Interface.Biometricsable;
import com.main.Study.AbstractTest.Interface.WirelessChargable;
import com.main.Study.AbstractTest.Interface.newMethod;

public class S22 extends SmartPhone implements WirelessChargable, ARable, Biometricsable, newMethod {
    @Override
    public void wirelessCharge()
    {
        System.out.println("무선충전 기능");
    }

    @Override
    public void ar()
    {
        System.out.println("AR 기능");
    }

    @Override
    public void biometrics()
    {
        System.out.println("생체인식 기능");
    }

    @Override
    public void newMethod(){
        System.out.println("S22 새로운 기능");
    }
}
