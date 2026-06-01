---
title: "业务流开发（推单/拉单/回写）"
type: reference
source: "iuap-业务流开发红皮书 (73页)"
tags: ["BIP", "旗舰版", "业务流", "推单", "拉单", "回写", "Rule"]
created: 2026-06-01
---

# 业务流开发

## 两种引擎

| 引擎 | 说明 | 特点 |
|------|------|------|
| 预置单据转换规则 | 平台内置 | 领域服务内运行，引预置 Rule 链 |
| 自定义业务流 | 独立服务 + SDK | 完全自定义，HTTP 方式交互 |

## Rule 链体系

### 自定义业务流 Rule

| Rule | 作用 |
|------|------|
| `BizFlowPushRule` | 单条自动推单：HTTP 请求业务流服务 → 过滤 → 查上游数据 → 转换 → 保存下游 |
| `BizFlowBatchPushRule` | 批量推单，兼容 BizFlowPushRule |
| `BizFlowWriteBackRule` | 回写：HTTP 请求 → 过滤 → 查上下游 → 转换 → 保存 |

### 预置业务流 Rule 链

```
QueryPullAndPushRule          → 查询上游数据（主子表条件查询）
DivideVoucherByInnerCoRule    → 内部购销转换规则（来源组织+交易类型+目标组织）
DivideVoucherBySocialRule     → 社会化分单（来源租户+交易类型）
DivideVoucherByTenantRule     → 租户级分单
DivideVoucherByFlowRule       → 业务流规则查询
DivideVoucherForPullRule      → 合单/拆单处理 + 虚拟子表
BeforePullAndPushRule         → 关联查询 → 回写设置 → 业务流设置 → 数据转换 → 交易类型
```

### 回写 Rule 链

```
BackWriteBeforeRule
  ├── 删除操作: 查下游数据库 (id, code)
  ├── 更新(有子表回写): 查下游防子表丢失
  ├── 更新(无子表回写): 用页面数据
  └── 非新增: 做差量回写
```

## 关键参数

| 方法 | 参数 |
|------|------|
| `DivideVoucherByInnerCoRule` | `srcOrg`, `srcBizTypeId`, `tarOrg` |
| `DivideVoucherBySocialRule` | `srcTenant`, `srcBizTypeId`, `sysid` |
| `DivideVoucherByTenantRule` | `srcBizTypeId`, `sysid` |

## 触发时机

- **手动触发**：预置按钮
- **动作触发**：配置在规则链上（如 submit 后自动推单）
- 支持主子孙推拉单、分单、合单、回写

## 多版本

建业务流时启用版本控制，发布=新版本。下游单据记录业务流 ID，`/searchRule` 按 ID 过滤。**旧版本和新版本互不干扰，谨慎使用。**

## 相关文档

- [[yts-distributed-tx]] — 业务流推单常涉及分布式事务
- [[event-center]] — 业务流可触发事件
- [[scheduler-task]] — 定时批量推单依赖调度任务
