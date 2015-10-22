package com.pyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CService cser=(CService)context.getBean("cser");
        cser.saveCuser();
    }
}
