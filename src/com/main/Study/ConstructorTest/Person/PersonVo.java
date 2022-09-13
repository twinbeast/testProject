package com.main.Study.ConstructorTest.Person;

import com.main.Enum.Gender;

public class PersonVo {
    public String name;
    public Gender gender;

    public PersonVo(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public PersonVo(PersonVo person){
        this.name = person.name;
        this.gender = person.gender;
    }
}
