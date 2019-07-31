package com.imooc.jms.producer.service.impl;

import com.imooc.jms.producer.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @author 张强[zhangqiang]
 * @date 2019年07月30日 - AM10:18:57
 * @history 2019年07月30日 - AM10:18:57  create.
 * Copyright © CMCC Corporation. All rights reserved.
 */
public class IProducerServiceImpl implements IProducerService{

//    使用注解，得到bean配置下的jmsTemplate
    @Autowired
    JmsTemplate jmsTemplate;

    //之所以使用Resource注解，是因为bean里面可能有多个Destination，使用name 以区分
//    @Resource(name="queueDestination")
    @Resource(name="topicDestination")
    Destination destination;
    public void sendMessage(final String message) {
        //使用jmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
//                创建消息
                TextMessage textMessage = session.createTextMessage(message);
                System.out.println("发送消息:"+textMessage.getText()+"------------message="+message);
                return textMessage;
            }
        });
    }
}
