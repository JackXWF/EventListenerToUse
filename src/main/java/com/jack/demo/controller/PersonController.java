package com.jack.demo.controller;


import com.jack.demo.entity.Person;
import com.jack.demo.service.IPersonService;
import com.jack.demo.test.TableInfoContext;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Jack
 * @since 2023-11-09
 */
@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {


    private final IPersonService personService;


    @GetMapping
    public void test(@RequestParam String tableName) {
        TableInfoContext.setInfo(tableName);

        Person person = new Person();
        person.setId(1);
        person.setAge(22);
        person.setName("KFC");

        personService.save(person);
    }


    @GetMapping("test2")
    public void test2() {

        personService.compute();
        personService.compute2();
    }


    //在同一类中调用该方法，不起作用
    @Async("generateThreadPool")
    public void compute() {
        System.out.printf("[%s],方法1执行了 %n", Thread.currentThread());
    }


    @Async("generateThreadPool")
    public void compute2() {
        System.out.printf("[%s],方法2执行了", Thread.currentThread());
    }

}
