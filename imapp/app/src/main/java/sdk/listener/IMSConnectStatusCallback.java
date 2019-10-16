package sdk.listener;

/**
 * IMS连接状态回调
 */
public interface IMSConnectStatusCallback {

    /**
     * ims连接中
     */
    void onConnecting();

    /**
     * ims连接成功
     */
    void onConnected();

    /**
     * ims连接失败
     */
    void onConnectFailed();
}
