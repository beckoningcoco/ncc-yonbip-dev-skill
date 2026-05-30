---
tags: [QuerySchema, 通用查询, IBillQueryRepository, 封装方法, Java]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-query-field-wrapper.md]
---

# 封装查询方法根据条件查询某字段

> 使用 QuerySchema + IBillQueryRepository 封装通用查询方法，根据条件查询单个字段值。

## 核心代码

```java
public static String queryField(MetaDataEnum metaDataEnum, String field, QueryConditionGroup queryConditionGroup) {
    QuerySchema querySchema = QuerySchema.create();
    querySchema.addSelect(field);
    querySchema.addCondition(queryConditionGroup);
    List<Map<String, Object>> data = UBaseContext.getBean(IBillQueryRepository.class)
        .queryMapBySchema(metaDataEnum.getUri(), querySchema, metaDataEnum.getDomain());
    if (CollectionUtils.isNotEmpty(data)) {
        return BizObject.fromMap(data.get(0)).getString(field);
    }
    return null;
}
```

通过 `UBaseContext.getBean` 获取 Spring Bean，支持跨模块调用。

## 关键概念

- [[QuerySchema]]
- [[IBillQueryRepository]]
- [[BizObject]]
