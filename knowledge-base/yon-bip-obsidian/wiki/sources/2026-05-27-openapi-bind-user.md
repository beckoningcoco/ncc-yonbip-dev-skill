---
tags: [OpenAPI, 用户绑定, yht_access_token, 调度任务, 机器人账号, 问题处理, 机械院]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-openapi-bind-user.md]
---

# 开放平台接口使用需要绑定用户

> 项目: 机械院 | 调度任务中调用文件上传 API 报错"开放平台接口使用需要绑定用户"。

## 原因

调度任务中框架自动给线程赋值为机器人账号的 `yht_access_token`，该身份对身份要求强的 API 调用不通过。

## 解决方案

**方案一**：根据 user_id 获取 `yht_access_token`，设置到请求头覆盖机器人 token。（调度任务场景中测试失败，原因不明）

**方案二（最终采用）**：新建普通线程执行逻辑：
```java
new Thread(() -> {
    // 执行业务逻辑
}).start();
```

注意：`YmsExecutors.getYmsExecutor()` 构建的线程会**继承主线程的身份信息**，不可用。

## 关键概念

- [[yht_access_token]]
- [[用户身份绑定]]
- [[调度任务]]
- [[机器人账号]]
