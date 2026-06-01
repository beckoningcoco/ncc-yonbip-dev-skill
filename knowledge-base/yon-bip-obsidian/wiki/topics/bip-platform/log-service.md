---
title: "日志服务"
type: reference
source: "iuap-日志服务红皮书 (36页)"
tags: ["BIP", "旗舰版", "日志", "审计", "BusinessLog"]
created: 2026-06-01
---

# 日志服务

三类日志：登录日志 / 操作日志 / 业务日志。

MDD 接入：元数据标签 `isCode/isName` + `jDiwork.recordLog()` 前端调用。非 MDD：`IBusinessLogService` RPC 接口或 REST 接口。

`BusinessLogVO`：userId, userName, action, billNo, billId, description, detail(JSON)。

线程池配置：`A44.log.threadpool.core/max/queue`。
