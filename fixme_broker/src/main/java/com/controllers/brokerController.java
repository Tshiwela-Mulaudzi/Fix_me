package com.controllers;

import com.models.attributes;

import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

public class brokerController {
    private static attributes content;

    public brokerController(int arg1, int arg2)
    {

    }
    public void establishConnection() throws Exception
    {
        AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
        SocketAddress serverAddr = new InetSocketAddress("localhost", 5000);
        Future<Void> connectionResults = channel.connect(serverAddr);
        connectionResults.get();
        System.out.println("Port connected");
        content = new attributes();
        content.client = channel;
        content.TempBuffer = ByteBuffer.allocate(2048);
        content.MessageRead = true;
        content.connectionThread = Thread.currentThread();
    }

}
