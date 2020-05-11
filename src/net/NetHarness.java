package net;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;

public class NetHarness
{
    public static class NetHarness01
    {
        public NetHarness01()
        {
            ExtendedNetwork network = new ExtendedNetwork();
        }

        public static class ExtendedNetwork
        {
            public ServerSocket socket;

            public Integer port = 9999;

            public Boolean running = true;

            public ExtendedNetwork()
            {
                try
                {
                    while(running)
                    {
                        socket = new ServerSocket(port);
                    }
                }
                catch (Exception exception)
                {
                    java.lang.System.err.println(exception);
                }
            }

            public static class ExtendedThread01
            {

            }
        }
    }

    public static class NetHarness02
    {
        public NetHarness02()
        {
            ExtendedNetwork network = new ExtendedNetwork();
        }

        public static class ExtendedNetwork
        {
            public ExtendedThread01 thread01 = new ExtendedThread01(this);

            public ExtendedThread02 thread02 = new ExtendedThread02(this);

            public ExtendedThread03 thread03 = new ExtendedThread03(this);

            public ExtendedThread04 thread04 = new ExtendedThread04(this);

            public ExtendedNetwork()
            {
                thread01.start();

                thread02.start();

                thread03.start();

                thread04.start();
            }

            public static class ExtendedThread01 extends Thread
            {
                public ExtendedNetwork network;

                public ServerSocket serversocket;

                public Boolean running = true;

                public ExtendedThread01(ExtendedNetwork network)
                {
                    this.network = network;
                }

                @Override
                public void run()
                {
                    while (running)
                    {
                        try
                        {
                            this.network.thread02.enqueue(new Parameter(this.serversocket.accept(), java.lang.System.currentTimeMillis()));

                            Thread.sleep(20);
                        }
                        catch (Exception exception)
                        {
                            java.lang.System.err.println(exception);
                        }
                    }
                }
            }

            public static class ExtendedThread02 extends Thread
            {
                public ExtendedNetwork network;

                public Boolean running = true;

                public Queue<Parameter> queue = new Queue<Parameter>();

                public HashMap<Long, Socket> connections = new HashMap<>();

                public ExtendedThread02(ExtendedNetwork network)
                {
                    this.network = network;
                }

                @Override
                public void run()
                {
                    Parameter parameter;

                    try
                    {
                        while(running)
                        {
                            if(queue.peek()!=null)
                            {
                                this.dequeue(parameter = queue.poll());
                            }

                            Thread.sleep(20);
                        }
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                    }
                }

                public void enqueue(Parameter parameter)
                {
                    this.queue.add(parameter);
                }

                public void dequeue(Parameter parameter)
                {
                    this.network.thread03.enqueue(parameter);
                }
            }

            public static class ExtendedThread03 extends Thread
            {
                public ExtendedNetwork network;

                public Queue<Parameter> queue = new Queue<Parameter>();

                public Boolean running = true;

                public ExtendedThread03(ExtendedNetwork network)
                {
                    this.network = network;
                }

                @Override
                public void run()
                {
                    while (running)
                    {
                        Parameter parameter = null;

                        try
                        {
                            if((parameter = queue.peek())!=null)
                            {
                                System.flatten((parameter = queue.poll()), "{1}", Assertions.SocketIsAlive.class);
                            }

                            Thread.sleep(20);
                        }
                        catch (SocketException socketexception)
                        {
                            this.dequeue(parameter);
                        }
                        catch (Exception exception)
                        {
                            java.lang.System.err.println(exception);
                        }
                    }
                }

                public void enqueue(Parameter parameter)
                {
                    this.queue.add(parameter);
                }

                public void dequeue(Parameter parameter)
                {
                    this.network.thread04.enqueue(parameter);
                }

                public static class Assertions
                {
                    public static class SocketIsAlive
                    {

                    }
                }

                public static class Statemachine
                {
                    public static class ProblematicInternetProtocolAddress
                    {

                    }
                }
            }

            public static class ExtendedThread04 extends Thread
            {
                public ExtendedNetwork network;

                public ServerSocket serversocket;

                public Boolean running = true;

                public ExtendedThread04(ExtendedNetwork network)
                {
                    this.network = network;
                }

                @Override
                public void run()
                {
                    while (running)
                    {
                        try
                        {
                            //die the threads + socket connection object here

                            Thread.sleep(20);
                        }
                        catch (Exception exception)
                        {
                            java.lang.System.err.println(exception);
                        }
                    }
                }

                public void enqueue(Parameter parameter)
                {
                    this.enqueue(parameter);
                }
            }
        }

        public static class System
        {
            public static System reference = new System();

            public System()
            {
                System.reference = this;
            }

            public static System flatten(Parameter parameter, String reference, Class<?> context) throws Exception
            {
                if(context.isAssignableFrom(ExtendedNetwork.ExtendedThread03.Assertions.SocketIsAlive.class))
                {
                    if(reference.equalsIgnoreCase("{1}"))
                    {
                        OutputStream output = parameter.socket.getOutputStream();

                        output.write(0);

                        output.flush();
                    }
                }

                return System.reference;
            }
        }
    }

    public static class NetHarness03
    {

    }

    public static class NetHarness04
    {

    }
}
