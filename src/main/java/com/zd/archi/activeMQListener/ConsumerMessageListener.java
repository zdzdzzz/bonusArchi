package com.zd.archi.activeMQListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import com.zd.archi.model.TblMaraTransLog;

public class ConsumerMessageListener implements MessageListener{
	public void onMessage(Message message) {  
        //这里我们知道生产者发送的就是一个纯文本消息，所以这里可以直接进行强制转换  
		TblMaraTransLog tblMaraTransLog;
		try {
			tblMaraTransLog = (TblMaraTransLog)((ObjectMessage)message).getObject();
			System.out.println("接收到一个纯文本消息。");  
	        System.out.println("消息内容是：" + tblMaraTransLog.getUserId());  
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }
}
