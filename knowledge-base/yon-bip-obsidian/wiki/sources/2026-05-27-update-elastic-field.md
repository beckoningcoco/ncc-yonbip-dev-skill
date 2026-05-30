---
tags: [特征字段, 弹性字段, BizContext, MetaRepository, SQL更新, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-update-elastic-field.md]
---

# 更新特征字段

> 通过 Java 代码更新特征字段（弹性字段），使用 BizContext.getMetaRepository() 解析 fieldUri 获取表名和列名。

## 单条更新

```java
Entity entity = BizContext.getMetaRepository().entity(uri);
List<Property> attributes = entity.getElasticAttributes();
for (Property property : attributes) {
    Entity characterEntity = (Entity) property.type();
    String tableName = characterEntity.getPrimitiveTableName() + "_" + attribute.getSeqIndex();
    String columnName = attribute.columnName();
    ymsJdbcApi.update("update " + schema + "." + tableName + " set " + columnName + " = ? where id = ?", param);
}
```

## 批量更新

单条更新的批量版本，使用 `WHERE id IN (?)` + 流式收集参数。

核心思路：从 fieldUri 解析出实体 URI、弹性字段名、特征列名，通过元数据仓库获取特征表的物理表名和列名，直接执行 UPDATE SQL。

## 关键概念

- [[弹性字段]]
- [[特征字段]]
- [[BizContext]]
- [[MetaRepository]]
