package com.jack.demo;

import com.jack.demo.entity.Person;
import com.jack.demo.service.IPersonService;
import com.jack.demo.service.impl.UserRegisterService;
import com.jack.demo.test.TableInfoContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Autowired
    UserRegisterService service;

    @Autowired
    IPersonService personService;


    @Test
    void contextLoads() {
        service.registerUser("jack");
    }


    @Test
    void test2() {
        int i = 1;
        int j = 1;
        int a = i++;

        int b = ++j;

        System.out.println(a + "-----" + b);

        System.out.printf(i + "----" + j);
    }


    @Test
    void test3() {
        TableInfoContext.setInfo("person_2");

        Person person = new Person();
        person.setId(2);
        person.setAge(22);
        person.setName("KFC");

        personService.save(person);
    }

}
