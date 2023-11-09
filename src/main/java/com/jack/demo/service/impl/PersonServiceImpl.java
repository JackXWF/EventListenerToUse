package com.jack.demo.service.impl;

import com.jack.demo.entity.Person;
import com.jack.demo.mapper.PersonMapper;
import com.jack.demo.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Jack
 * @since 2023-11-09
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Override
    @Async("generateThreadPool")
    public void compute() {
        System.out.printf("[%s],方法1执行了 %n", Thread.currentThread());
    }

    @Override
    @Async("generateThreadPool")
    public void compute2() {
        System.out.printf("[%s],方法2执行了", Thread.currentThread());
    }
}
