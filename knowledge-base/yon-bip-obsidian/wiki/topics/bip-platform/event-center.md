---
title: "事件中心开发"
type: reference
source: "iuap-事件中心开发红皮书 (60页)"
tags: ["BIP", "旗舰版", "事件中心", "Event", "订阅", "RPC", "REST"]
created: 2026-06-01
---

# 事件中心开发

## 订阅注册参数

| 参数 | 说明 |
|------|------|
| 监听名称 | 订阅标识 |
| 节点编码 | 同一事件类型下唯一 |
| 重试策略 | 默认(5次) / 循环 / 禁用 |
| 请求方式 | REST(标准签名) / Token / RPC / 协同 |
| 事件接收地址 | REST 直接填 URL，RPC 格式: `rpc://service@id/alias` |
| 报警邮箱 | 失败报警通知 |
| 限流值 | 秒为单位，支持 4 位小数精度（0.0001=每10000秒1次，100=每秒100次） |
| 异步请求 | 勾选则业务处理完毕需回调事件中心 |
| 应用过滤 | 根据租户开通应用过滤 |
| 是否有序 | 按顺序消费 |
| 拉取模式 | 主动拉式消费，需指定过期时间 |

## 三种发送方式

### RPC（推荐）

```xml
<dependency>
    <groupId>com.yonyou.iuap</groupId>
    <artifactId>iuap-event-rpc</artifactId>
    <version>2.6.0-RELEASE</version>
</dependency>
```

```java
@Resource
private IEventSendService eventSendService;

BusinessEventBuilder builder = new BusinessEventBuilder();
builder.setSourceId("APPLICATION");
builder.setEventType("CREATE_APPLICATION");
builder.setUserObject(businessObject);
builder.setTenantCode("yht_tenant_id");
BusinessEvent event = builder.build();
// 多数据中心分发
event.getTenantIds().add("tenantId1");
event.getTenantIds().add("tenantId2");
eventSendService.sendEvent(event);
```

### REST

```http
POST https://example.yyuap.com/event-pub/pub/rest/sendEvent
Content-Type: application/json

{
  "eventType": "demo",
  "sourceID": "demo",
  "tenantCode": "cr2ru8x5",
  "userObject": "{\"operation\":\"add\"}",
  "uuid": "5d5ca9ff-...",
  "tenantIds": "tenantId1,tenantId2"
}
```

### EOS（本地事件，推荐）

共享逻辑数据源，接入事件中心消息发送服务。

## 事件中心地址

- 专属化：`https://example.yyuap.com/iuap-apcom-event/event-center/#/`
- Token 获取：`/iuap-apcom-event/event-center/tools/getToken?userId=xxx`

## 相关文档

- [[message-service]] — 事件驱动与消息发送互补
- [[open-platform]] — 事件网关是开放平台的一部分
- [[business-flow]] — 业务流触发事件
