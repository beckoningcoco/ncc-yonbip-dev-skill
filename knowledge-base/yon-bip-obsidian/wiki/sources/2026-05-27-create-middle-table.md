---
tags: [中间表, 达梦数据库, DTO, IYmsJdbcApi, CRUD, SuperDO]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-create-middle-table.md]
---

# 新建中间表

> 在 BIP 中新建中间表的完整流程：建实体 → 建数据库表 → 建 Java DTO → 使用 IYmsJdbcApi CRUD。

## 流程

1. **新建实体**：在应用构建中创建实体
2. **建达梦表**：编写 DDL（含主键、索引、update 触发器自动更新 pubts）
3. **建 Java DTO**：继承 `SuperDO implements ILogicDelete`，加 `@YMSEntity` 注解

## CRUD 示例

```java
@Resource(name = "baseDAO", type = BaseDAO.class)
private IYmsJdbcApi ymsJdbcApi;

// 插入
VoucherSendEventDto dto = new VoucherSendEventDto();
dto.setId(String.valueOf(IdManager.getInstance().nextId()));
dto.setYtenantId(InvocationInfoProxy.getTenantid());
dto.setDr(0);
dto.set_status(2);
ymsJdbcApi.insertWithPK(dto);

// 更新
ymsJdbcApi.update("update ... set dr = 1 where ...");
```

## 关键概念

- [[中间表]]
- [[达梦数据库]]
- [[IYmsJdbcApi]]
- [[SuperDO]]
