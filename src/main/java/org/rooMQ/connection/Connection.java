package org.rooMQ.connection;

/**
 * Created by colin on 2017/6/20.
 */
public interface Connection {

    /*链接开始*/
    public void start();

    /*大家的注释*/
    public void stop();

    public void close();
}
