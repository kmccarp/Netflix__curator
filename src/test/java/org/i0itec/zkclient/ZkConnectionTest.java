package org.i0itec.zkclient;

import org.i0itec.zkclient.testutil.ZkTestSystem;
import org.junit.Rule;

public class ZkConnectionTest extends AbstractConnectionTest {

    @Rule
    public ZkTestSystem _zk = ZkTestSystem.getInstance();

    public ZkConnectionTest() {
        super(establishConnection());
    }

    private static IZkConnection establishConnection() {
        IZkConnection zkConnection = ZkTestSystem.createZkConnection("localhost:" + ZkTestSystem.getInstance().getZkServer().getPort());
        new ZkClient(zkConnection);// connect
        return zkConnection;
    }

}
