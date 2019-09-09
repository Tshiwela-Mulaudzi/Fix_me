package com.models;

import java.nio.*;
import java.nio.channels.*;

public class attributes {
    public AsynchronousSocketChannel client;
    public boolean MessageRead;
    public ByteBuffer TempBuffer;
    public Thread connectionThread;

}
