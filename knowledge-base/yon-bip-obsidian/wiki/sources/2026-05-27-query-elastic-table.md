---
tags: [特征字段, elastic_field, 弹性字段查询, YonQL, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-query-elastic-table.md]
---

# 查询特征字段所在的表

> 查询某个特征字段（弹性字段）所在的表，以及通过 YonQL 查询弹性字段数据。

## 查询 elastic_field 表

```sql
SELECT vcol41 FROM yonbip_clm_contract.elastic_field WHERE field_name = 'WBS'
```

`elastic_field` 表在服务域下，通过 `field_name` 查询字段归属信息。

## YonQL 查询特征字段

```java
QuerySchema querySchema = QuerySchema.create()
    .addSelect("staffChangeDefines.id, staffChangeDefines.oalcbm, ...")
    .appendQueryCondition(QueryCondition.name("id").eq(billId));
List<? extends IBillDO> queryList = billQueryRepository.queryBySchema(
    "ss.mddstaffchange.staffchange", querySchema, "hrcloud-corehr-process");
```

特征字段在 YonQL 中通过 `弹性字段名.特征列名` 方式引用。

## 关键概念

- [[elastic_field]]
- [[弹性字段]]
- [[特征字段查询]]
