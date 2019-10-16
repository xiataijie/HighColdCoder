package sdk.listener;

import sdk.protobuf.MessageProtobuf;

/**
 * 与应用层交互的listener
 */
public interface OnEventListener {

    /**
     * 分发消息到应用层
     *
     * @param msg
     */
    void dispatchMsg(MessageProtobuf.Msg msg);

    /**
     * 从应用层获取网络是否可用
     *
     * @return
     */
    boolean isNetworkAvailable();

    /**
     * 获取重连间隔时长
     *
     * @return
     */
    int getReconnectInterval();

    /**
     * 获取连接超时时长
     *
     * @return
     */
    int getConnectTimeout();

    /**
     * 获取应用在前台时心跳间隔时间
     *
     * @return
     */
    int getForegroundHeartbeatInterval();

    /**
     * 获取应用在前台时心跳间隔时间
     *
     * @return
     */
    int getBackgroundHeartbeatInterval();

    /**
     * 获取由应用层构造的握手消息
     *
     * @return
     */
    MessageProtobuf.Msg getHandshakeMsg();

    /**
     * 获取由应用层构造的心跳消息
     *
     * @return
     */
    MessageProtobuf.Msg getHeartbeatMsg();

    /**
     * 获取应用层消息发送状态报告消息类型
     *
     * @return
     */
    int getServerSentReportMsgType();

    /**
     * 获取应用层消息接收状态报告消息类型
     *
     * @return
     */
    int getClientReceivedReportMsgType();

    /**
     * 获取应用层消息发送超时重发次数
     *
     * @return
     */
    int getResendCount();

    /**
     * 获取应用层消息发送超时重发间隔
     *
     * @return
     */
    int getResendInterval();
}
