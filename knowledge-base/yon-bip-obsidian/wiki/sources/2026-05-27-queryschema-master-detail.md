---
tags: [QuerySchema, 主子表, 查询条件, FindSchemaBuilder, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-queryschema-master-detail.md]
---

# QuerySchema根据自定义条件查询主子表数据

> 使用 FindSchemaBuilder 构建深度查询（含子表和特征字段），以及使用 QueryExtraCondition 实现 OR 条件。

## 构建主子表查询

```java
IEntity entity = metadataSupportService.getEntityByUri("znbzbx.commonexpensebill.CommonExpenseBillVO");
QuerySchema querySchema = new ExpenseBillQueryBuilder().build(entity, 4);
// depth=4 控制遍历深度
List<IBillDO> list = billQueryRepository.queryBySchema(uri, querySchema);
```

## 常用条件组合

- **字段 != Y OR IS NULL**：`QueryCondition.name("field").not_eq("Y").next(new QueryExtraCondition(ConditionOperator.or, ConditionOperator.is_null))`
- **字段A = xxx OR 字段B = xxx**：使用 `QueryConditionGroup(ConditionOperator.or)` 添加多个条件
- **主表和子表条件混合**：先构建主子表 QuerySchema，再 append 自定义条件

## 关键概念

- [[QuerySchema]]
- [[FindSchemaBuilder]]
- [[QueryExtraCondition]]
- [[主子表查询]]
