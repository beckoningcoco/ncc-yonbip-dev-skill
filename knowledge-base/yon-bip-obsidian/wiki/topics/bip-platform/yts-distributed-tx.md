---
title: "分布式事务（YTS）"
type: reference
source: "iuap-分布式事务红皮书 (43页)"
tags: ["BIP", "旗舰版", "分布式事务", "YTS", "Sagas", "TCC", "MDD"]
created: 2026-06-01
---

# 分布式事务（YTS）

> YTS = Yonyou Transaction Service，统一分布式事务框架。

## Sagas 模式

补偿模式：每个参与者都有正向操作 + 反向补偿操作。正向失败 → 反向回滚已提交的参与者。

特点：不具备隔离性，反向操作必须成功。允许短暂数据不一致。

## TCC 模式

| 阶段 | 说明 |
|------|------|
| Try | 尝试执行：业务检查 + 预留资源 + 设置中间状态 |
| Confirm | 确认：用预留资源真正执行业务，中间状态 → 最终状态 |
| Cancel | 回滚：释放预留资源，恢复中间状态 |

特点：两阶段实现资源隔离，业务侵入性高，每个阶段完成后提交本地事务。

## MDD 接入

### 规则 config 配置

```json
{
  "needDTC": "true",
  "transactionType": "sagas",
  "params": "param,testcacel"
}
```

| 参数 | 说明 |
|------|------|
| `needDTC` | true = 开启 YTS 事务 |
| `transactionType` | `sagas` 或 `tcc` |
| `params` | 正向 map 中需传给 cancel 的 key，逗号分隔 |

### ISagaRule 接口

```java
public interface ISagaRule {
    RuleExecuteResult cancel(BillContext billContext, 
        Map<String,Object> paramMap) throws Exception;
}
```

### ITccRule 接口

```java
public interface ITccRule {
    RuleExecuteResult confirm(BillContext billContext, 
        Map<String,Object> paramMap) throws Exception;
    RuleExecuteResult cancel(BillContext billContext, 
        Map<String,Object> paramMap) throws Exception;
}
```

## 异常事务自动重试

云端控制台为每个微服务配置自动重试间隔和总次数，解决因服务不稳定或网络故障导致 cancel/confirm 异常的数据不一致问题。

## 相关文档

- [[business-flow]] — 业务流推单常用分布式事务
- [[yms-dev-process]] — YMS控制台监控YTS异常事务
- [[mdd-backend]] — MDD规则config配置YTS事务
