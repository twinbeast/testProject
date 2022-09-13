package com.main.Study.ConstructorTest.User;

import com.main.Study.ConstructorTest.Person.PersonA;

public class UserA extends UserVo{
    public UserA(){
        super(new PersonA());
        this.id = "UserA";
        this.pw = "1234";
    }
}
