---
tags: [问题处理, API, OpenAPI, 开放平台, 用户绑定]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/开放平台接口使用需要绑定用户]
---

# 开放平台接口使用需要绑定用户

> 解决调用标准 API 时报错"开放平台接口使用需要绑定用户"（错误码：1090003500084）。

## 原因

调度任务（或其他后台任务）中，框架会自动给线程赋值为机器人账号的 `yht_access_token`，该身份无法通过某些 API 的权限校验。

## 解决方案

**方案一**：手动获取 `yht_access_token` 并覆盖请求头
```java
request.setHeader("yht_access_token", yonBipTokenUtil.getYhtAccessToken(userId));
```

**方案二（推荐）**：新建线程异步执行
```java
new Thread(() -> { /* 业务逻辑 */ }).start();
```

> 注意：`YmsExecutors.getYmsExecutor()` 构建的线程会继承主线程身份信息，不可用于此方案。

## 关键概念
- [[yht_access_token]]
- [[YonBipTokenUtil]]
