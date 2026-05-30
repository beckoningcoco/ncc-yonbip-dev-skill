---
tags: [调度任务, 后台任务, Controller, 异步执行, 回调平台, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-scheduler-task.md]
---

# 旗舰版后台任务/调度任务

> 开发定时调度任务（如每月自动生成收入确认单），含新建调度类型、编写 Controller、回调平台更新任务状态。

## 开发步骤

1. **新建调度类型**：配置接口属性（对应后端 Controller）
2. **新建后台任务**：设置调度周期等参数
3. **编写后端 Controller**：

```java
@RequestMapping("/task/addConfirm")
public Object addConfirm(HttpServletRequest request, @RequestBody Map<String, Object> paramMap) {
    String logId = request.getHeader("logId");
    ymsExecutor.execute(() -> {
        try {
            service.addConfirm(execDate);
            callbackPlatform(logId, 1, "执行成功");
        } catch (Exception e) {
            callbackPlatform(logId, 0, e.getMessage());
        }
    });
    Map<String, String> resultMap = new HashMap<>();
    resultMap.put("asynchronized", "true");
    return resultMap;
}
```

## 回调平台

```java
String url = PropertyUtil.getPropertyByKey("domain.iuap-apcom-coderule") + "/warning/warning/async/updateTaskLog";
AuthHttpClientUtils.execPost(url, null, null, param.toString());
```

任务标识为异步（`asynchronized: true`），完成后主动回调平台更新状态。

## 关键概念

- [[调度任务]]
- [[后台任务]]
- [[异步执行]]
