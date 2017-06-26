package org.rooMQ.connection;

import javax.jms.*;

/**
 * Created by colin on 2017/6/20.
 */
public class RooMQQueueConnection implements javax.jms.Connection{

    public Session createSession(boolean b, int i) throws JMSException {
        return null;
    }

    public String getClientID() throws JMSException {
        return null;
    }

    public void setClientID(String s) throws JMSException {

    }

    public ConnectionMetaData getMetaData() throws JMSException {
        return null;
    }

    public ExceptionListener getExceptionListener() throws JMSException {
        return null;
    }

    public void setExceptionListener(ExceptionListener exceptionListener) throws JMSException {

    }

    public void start() throws JMSException {

    }

    public void stop() throws JMSException {

    }

    public void close() throws JMSException {

    }

    public ConnectionConsumer createConnectionConsumer(Destination destination, String s, ServerSessionPool serverSessionPool, int i) throws JMSException {
        return null;
    }

    public ConnectionConsumer createDurableConnectionConsumer(Topic topic, String s, String s1, ServerSessionPool serverSessionPool, int i) throws JMSException {
        return null;
    }
}
