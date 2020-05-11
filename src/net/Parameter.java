package net;

import java.net.Socket;

public class Parameter
{
    public Socket socket;

    public Long timestamp;

    public Parameter(Socket socket, Long timestamp)
    {
        this.socket = socket;

        this.timestamp = timestamp;
    }
}
