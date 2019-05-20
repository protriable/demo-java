package com.protry.spring.demo1;

import com.protry.spring.UnitTestBase;
import com.protry.spring.demo1.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {


    public TestBeanLifeCycle() {
        super("classpath*:config/spring-cycle.xml");
    }

    @Test
    public void test() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
    }
}
