package cn.sdtbu.imaker;

import cn.sdtbu.imaker.DCS.service.impl.UserServiceImpl;
import org.junit.Test;
import org.python.util.PythonInterpreter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {



    @Test
    public void test(){
        System.out.println("hello");
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        userService.log();
    }
    @Test
    public void testPython(){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("print 3+2");
    }
}
