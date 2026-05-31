/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.docmerge.model;

public class ServiceInfo {
    private String domainCloudCode;
    private String domainCloudName;
    private String subDomainCloudCode;
    private String subDomainCloudName;
    private String appCode;
    private String appName;
    private String serviceCode;
    private String serviceName;

    public String getDomainCloudCode() {
        return this.domainCloudCode;
    }

    public ServiceInfo setDomainCloudCode(String domainCloudCode) {
        this.domainCloudCode = domainCloudCode;
        return this;
    }

    public String getDomainCloudName() {
        return this.domainCloudName;
    }

    public ServiceInfo setDomainCloudName(String domainCloudName) {
        this.domainCloudName = domainCloudName;
        return this;
    }

    public String getSubDomainCloudCode() {
        return this.subDomainCloudCode;
    }

    public ServiceInfo setSubDomainCloudCode(String subDomainCloudCode) {
        this.subDomainCloudCode = subDomainCloudCode;
        return this;
    }

    public String getSubDomainCloudName() {
        return this.subDomainCloudName;
    }

    public ServiceInfo setSubDomainCloudName(String subDomainCloudName) {
        this.subDomainCloudName = subDomainCloudName;
        return this;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public ServiceInfo setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    public String getAppName() {
        return this.appName;
    }

    public ServiceInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public ServiceInfo setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}

