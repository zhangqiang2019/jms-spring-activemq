package com.imooc.jms.consumer.run;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张强[zhangqiang]
 * @date 2019年07月30日 - AM11:00:56
 * @history 2019年07月30日 - AM11:00:56  create.
 * Copyright © CMCC Corporation. All rights reserved.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }

}
