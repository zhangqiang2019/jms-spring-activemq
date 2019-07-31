package com.imooc.jms.consumer.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author 张强[zhangqiang]
 * @date 2019年07月30日 - AM 11:41:31
 * @history 2019年07月30日 - AM 11:41:31  create.
 * Copyright © CMCC Corporation. All rights reserved.
 */
public class ConsumerMessageListener implements MessageListener{

    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接受消息"+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
