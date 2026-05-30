---
tags: [物料现存量, SQL查询, availableqty, currentstock, ROW_NUMBER, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-query-current-stock.md]
---

# 旗舰版用SQL查询物料现存量

> 通过 SQL 或 API 查询物料现存量，计算可用量（availableqty），使用 ROW_NUMBER 取每组最大可用量行。

## SQL 查询方式

查询 `ustock.currentstock` 表，关联可用量检查规则、计算规则、库存状态记录：

```java
availableqty = fcurrentqty + 预计入 - 预计出
```

使用 `ROW_NUMBER() OVER (PARTITION BY product_code ORDER BY availableqty DESC)` 取每个物料最大可用量行（rn=1）。

## API 查询方式

```java
Map<String, Object> reqMap = new HashMap<>();
reqMap.put("org", salesOrgId);
reqMap.put("warehouse", salesWarehouse);
reqMap.put("productn.code", codesWithBatch);
reqMap.put("billnum", "st_othoutrecord");
List<Map<String, Object>> res = yonbipUtil.queryCurrentStocks(reqMap);
// API: /yonbip/scm/stock/QueryCurrentStocksByCondition
```

## 涉及表

| 表 | 说明 |
|----|------|
| `ustock.currentstock` | 现存量主表 |
| `ustock.availablecalcrule` | 可用量计算规则 |
| `ustock.st_stockstatusrecord` | 库存状态 |
| `iuap_apdoc_coredoc.aa_warehouse` | 仓库 |

## 关键概念

- [[现存量查询]]
- [[可用量计算]]
- [[ROW_NUMBER]]
