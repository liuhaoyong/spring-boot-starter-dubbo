package com.alibaba.boot.dubbo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * dubbo properties
 *
 * @author xionghui
 * @email xionghui.xh@alibaba-inc.com
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboProperties {
    /**
     * dubbo application name
     */
    private String appname;
    /**
     * dubbo registry address
     */
    private String registry;
    /**
     * communication protocol, default is dubbo
     */
    private String protocol = "dubbo";
    /**
     * dubbo listen port, default 20800
     */
    private int port = 20800;
    /**
     * dubbo thread count, default 200
     */
    private int threads = 200;

    /**
     * dubbo version, may override by
     * {@link com.alibaba.dubbo.config.annotation.Service#version()}
     */
    private String version = "";

    /**
     * dubbo group, may override by
     * {@link com.alibaba.dubbo.config.annotation.Service#group()}
     */
    private String group = "";

    /**
     * dubbo owner, may override by
     * {@link com.alibaba.dubbo.config.annotation.Service#owner()}
     */
    private String owner = "";

    /**
     * default timeout, default 0
     */
    private int timeout = 0;

    /**
     * 线程池类型
     */
    private String threadpool;

    /**
     * 服务延迟暴露时间，默认Spring初始化完成以后再暴露服务
     */
    private int delay = -1;

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getThreadpool() {
        return threadpool;
    }

    public void setThreadpool(String threadpool) {
        this.threadpool = threadpool;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAppname() {
        return this.appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getThreads() {
        return this.threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "DubboProperties{" +
                "appname='" + appname + '\'' +
                ", registry='" + registry + '\'' +
                ", protocol='" + protocol + '\'' +
                ", port=" + port +
                ", threads=" + threads +
                ", version='" + version + '\'' +
                ", group='" + group + '\'' +
                ", owner='" + owner + '\'' +
                ", timeout=" + timeout +
                ", threadpool='" + threadpool + '\'' +
                ", delay=" + delay +
                '}';
    }

}
