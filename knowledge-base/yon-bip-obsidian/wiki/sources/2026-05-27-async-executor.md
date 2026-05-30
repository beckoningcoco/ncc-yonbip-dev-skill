---
tags: [异步执行, YmsExecutors, 线程池, 防止超时, Java]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-async-executor.md]
---

# 异步执行代码

> 在 BIP 中使用 YmsExecutors 获取线程池执行异步任务，防止前台超时。

## 低版本

```java
private final ExecutorService ymsExecutor = YmsExecutors.getYmsExecutor();
ymsExecutor.execute(() -> { /* 异步任务 */ });
```

## 高版本

```java
private final IYmsExecutorService ymsExecutor = YmsExecutors.getYmsExecutor();
```

## 典型场景

保存接口中异步执行审核、回写等耗时操作，异常时记录错误日志但不阻断主流程：

```java
ymsExecutor.execute(() -> {
    try {
        yonbipUtil.batchAuditSaleOrder(Arrays.asList(needId));
    } catch (Exception e) {
        yonbipUtil.makeErrorLogsForInterface(org, customerId, dept, billno, billType, e.getMessage());
    }
});
```

## 关键概念

- [[YmsExecutors]]
- [[异步处理]]
- [[线程池]]
