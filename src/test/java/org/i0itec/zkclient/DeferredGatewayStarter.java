package org.i0itec.zkclient;

public class DeferredGatewayStarter extends Thread {

    private final Gateway zkServer;
    private int _delay;

    public DeferredGatewayStarter(Gateway gateway, int delay) {
        zkServer = gateway;
        _delay = delay;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(_delay);
            zkServer.start();
        } catch (Exception e) {
            // ignore
        }
    }
}
