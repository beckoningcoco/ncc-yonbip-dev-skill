/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.docmerge.model;

public class ToDoItem {
    private String domainCloudName;
    private String appName;
    private String serviceName;
    private String code;
    private String name;
    private String suggestion;

    public ToDoItem() {
    }

    public ToDoItem(String domainCloudName, String appName, String serviceName) {
        this.domainCloudName = domainCloudName;
        this.appName = appName;
        this.serviceName = serviceName;
    }

    public String getDomainCloudName() {
        return this.domainCloudName;
    }

    public void setDomainCloudName(String domainCloudName) {
        this.domainCloudName = domainCloudName;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}

