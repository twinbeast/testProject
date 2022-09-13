package com.main.Study.ConstructorTest;

import com.main.Util.RandomUtil;
import com.main.Enum.Gender;
import com.main.Util.StringUtil;
import com.main.Study.ConstructorTest.Person.PersonA;
import com.main.Study.ConstructorTest.Person.PersonVo;
import com.main.Study.ConstructorTest.User.UserA;
import com.main.Study.ConstructorTest.User.UserVo;

public class constructorTestClass {

    public static void main(String[] args){
        StringUtil stringUtil = new StringUtil();

        UserVo user = new UserVo("id", "pw", "name", Gender.man);
        System.out.println("user Constructor \t"+user.id+"\t\t\t"+user.pw+"\t\t\t\t\t"+user.name+"\t\t\t"+user.gender);

        PersonVo person = user.getPerson();
        System.out.println("user getPerson \t"+stringUtil.tapString(9)+person.name+"\t\t\t"+person.gender);

        PersonVo personA = new PersonVo(new PersonA());
        System.out.println("Person A \t"+stringUtil.tapString(10)+personA.name+"\t\t\t\t"+personA.gender);

        UserVo userA = new UserVo(new UserA());
        System.out.println("User A \t\t\t\t"+userA.id+"\t\t"+userA.pw+"\t\t\t\t"+userA.name+"\t\t\t\t"+userA.gender);

        UserVo randUser = randomUser(userA.getPerson());
        System.out.println("User Random \t\t"+randUser.id+"\t"+randUser.pw+"\t"+randUser.name+"\t\t\t\t"+randUser.gender);
    }

    public static UserVo randomUser(PersonVo person){
        RandomUtil randUtil = new RandomUtil();
        String randId = randUtil.randomString(10);
        String randPw = randUtil.randomString(16);
        return new UserVo(randId, randPw, person.name, person.gender);
    }
}
