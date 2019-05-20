package com.protry.spring.demo1;

import com.protry.spring.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath*:config/spring-ioc.xml");
    }


    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.hello("aaaaa");
    }


}
