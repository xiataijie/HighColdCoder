package sdk;

import sdk.interf.IMSClientInterface;
import sdk.netty.NettyTcpClient;

/**
 * ims实例工厂方法
 */
public class IMSClientFactory {

    public static IMSClientInterface getIMSClient() {
        return NettyTcpClient.getInstance();
    }
}
