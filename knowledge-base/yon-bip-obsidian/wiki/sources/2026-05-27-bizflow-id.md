---
tags: [业务流, bizFlow, 单据转换, 交易类型, business_flow]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bizflow-id.md]
---

# 实时获取单据的业务流ID

> 在接口中动态获取单据的业务流 ID（bizFlow），使保存单据后审核自动触发下游单据推送。

## 调用方式

在保存接口报文表头传入 `bizFlow` 字段：
```java
reqBody.put("bizFlow", bizFlowId);
```

## 动态获取

根据交易类型 ID 查询业务流。业务流可能为组织级或集团级（集团级 `org_id` 为空）：

```sql
SELECT * FROM iuap_apcom_businesssflow.business_flow
WHERE ytenant_id = ? AND is_current_version = 1 AND dr = 0
  AND transaction_type_id = ? AND sub_id = 'GYLFW'
  AND (org_id IS NULL OR org_id = '')
```

## 涉及表

- `iuap_apcom_businesssflow.business_flow` — 业务流配置表

## 关键概念

- [[业务流]]
- [[bizFlow]]
- [[单据转换规则]]
