package org.rooMQ.connection;

/**
 * Created by colin on 2017/6/20.
 */
public interface Connection {

    public void start();

    public void stop();

    public void close();
}
