---
tags: [审批流, BpmUtils, 工作流, approve, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-workflow-info.md]
---

# 获取审批流信息

> 通过 Java 代码获取审批流信息，支持 BpmUtils 工具类和手动调用审批流 API。

## 方式一：BpmUtils

```java
JSONObject workflowInfo = BpmUtils.getWorkflowInfo("RBSM", billnum, billId);
```

## 方式二：手动调用 API

```java
POST /iuap-apcom-workflownew/approve-component/api/v1/approve/load
Body: { "businessKey": "busiObj_billId" }
Header: Tenantappsource=xxx
```

返回值 `errcode=0` 表示成功，`data` 中为审批流信息。

## 关键概念

- [[BpmUtils]]
- [[审批流]]
- [[工作流 API]]
