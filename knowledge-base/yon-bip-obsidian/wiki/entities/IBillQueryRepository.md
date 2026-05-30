---
tags: [BIP, 查询, QuerySchema, 后端]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
---

# IBillQueryRepository

> BIP 平台标准查询接口，使用 QuerySchema + QueryCondition 链式构建查询，返回 IBillDO 或自定义 Map 结果。

## 核心用法

### 按条件查询

```java
QuerySchema querySchema = QuerySchema.create()
        .addSelect("id", "code", "name")
        .appendQueryCondition(
            QueryCondition.equalTo("code", bustype)
        );
List<IBillDO> result = billQueryRepository.queryBySchema(
    "ti.transtype.TranstypeVO", querySchema);
```

### 按 ID 查详情

```java
IBillDO bill = billQueryRepository.findById("st.othinrecord.OthInRecord", id);
```

### 按外部单号查询

```java
QuerySchema qs = QuerySchema.create()
        .addSelect("id", "verifystate", "oriBalance")
        .appendQueryCondition(
            QueryCondition.equalTo("src_billno", externalBillNo)
        );
List<IBillDO> bills = billQueryRepository.queryBySchema(EntityUri.FIAP_APSURE_EVENT_URI, qs);
```

## 实体 URI 规范

格式：`{模块}.{实体}.{类名}`，例：
- `st.othinrecord.OthInRecord` — 其他入库
- `fa.facategory.FixedAssetsCategoryVO` — 固定资产类别
- `earap.payable.PayableHeader` — 应付单

定义在 `EntityUri` 常量类中集中管理。

## 相关页面

- [[YonbipUtil]]
- [[API调用]]
- [[SuperDO]]
