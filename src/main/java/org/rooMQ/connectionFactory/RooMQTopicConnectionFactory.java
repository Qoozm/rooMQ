package org.rooMQ.connectionFactory;

import org.rooMQ.connection.Connection;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by colin on 2017/6/20.
 */
public class RooMQTopicConnectionFactory implements ConnectionFactory {

    Socket socket = new Socket();
    SocketAddress default_address = new InetSocketAddress("localhost", 12121);

    public Connection getConnection() {

        return null;
    }

    public Connection getConnection(String host, int port) {
        return null;
    }
}
