package com.imooc.jms.producer.util.run;

import com.imooc.jms.producer.service.IProducerService;
import com.imooc.jms.producer.service.impl.IProducerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张强[zhangqiang]
 * @date 2019年07月30日 - AM11:00:56
 * @history 2019年07月30日 - AM11:00:56  create.
 * Copyright © CMCC Corporation. All rights reserved.
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        IProducerService service = context.getBean(IProducerService.class);
        for (int i = 0; i < 79; i++) {
           service.sendMessage("第"+i+"条信息");
        }
        context.close();
    }
}
