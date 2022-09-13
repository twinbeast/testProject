package com.main.Study.ConstructorTest.User;

import com.main.Enum.Gender;
import com.main.Study.ConstructorTest.Person.PersonVo;

public class UserVo extends PersonVo {
    public String id;
    public String pw;

    public UserVo(String id, String pw, String name, Gender gender){
        super(name, gender);
        this.id = id;
        this.pw = pw;
    }

    public UserVo(PersonVo person) {
        super(person);
    }

    public UserVo(UserVo user){
        super(new PersonVo(user.name, user.gender));
        this.id = user.id;
        this.pw = user.pw;
    }

    public PersonVo getPerson(){
        return new PersonVo(this.name, this.gender);
    }
}
