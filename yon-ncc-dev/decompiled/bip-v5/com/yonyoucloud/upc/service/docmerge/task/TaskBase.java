/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.scheduler.service.TaskService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 */
package com.yonyoucloud.upc.service.docmerge.task;

import com.yonyou.iuap.scheduler.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class TaskBase {
    private static final Logger log = LoggerFactory.getLogger(TaskBase.class);

    void scheduleTask(final TaskService taskService, final String taskId) {
        try {
            if (TransactionSynchronizationManager.isActualTransactionActive()) {
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                    public void afterCommit() {
                        taskService.schedule(taskId);
                    }
                });
            } else {
                taskService.schedule(taskId);
            }
        }
        catch (Exception e) {
            log.error("\u6267\u884c\u5f02\u6b65\u4efb\u52a1\u5931\u8d25\uff01", (Throwable)e);
        }
    }
}

