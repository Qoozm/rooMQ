package org.rooMQ.connectionFactory;

import org.rooMQ.connection.Connection;

/**
 * Created by colin on 2017/6/20.
 */
public interface ConnectionFactory {

    public Connection getConnection();
    public Connection getConnection(String host, int port);
}
