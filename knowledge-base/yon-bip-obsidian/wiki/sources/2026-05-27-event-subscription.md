---
tags: [事件订阅, 事件监听, 事件中心, Controller, 回调, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-event-subscription.md]
---

# 旗舰版配置事件订阅

> 事件订阅/事件监听：当系统业务事件发生时，异步回调指定接口。事件订阅配置流程和回调 Controller 写法。

## 事件订阅流程

1. 选择模块 → 配置回调地址（`域名 + 微服务编码 + controller路径`）
2. 配置白名单（YMS 管理控制台，实际可能不需要）
3. 重启微服务 → 测试接口连通性 → 增加事件订阅

## 事件监听流程

1. 管理员账号登录事件中心：`{域名}/iuap-apcom-event/ucf-wh/eventCenter/index.html#`
2. 选择事件类型 → 配置监听（节点编码、微服务编码、事件接收地址）
3. 事件接收地址格式：`${domain.url}/微服务编码(无-be)/controller地址`

## Controller 写法要点

返回值必须是字符串 `"success"` 或 `"true"`：
```java
@RequestMapping("/listener")
public String handle(HttpServletRequest request) {
    String sourceID = request.getParameter("sourceID");
    String eventType = request.getParameter("eventType");
    String userObject = request.getParameter("userObject"); // 单据id
    // 根据 eventType 执行业务逻辑
    return "success";
}
```

## 关键概念

- [[事件订阅]]
- [[事件监听]]
- [[事件中心]]
