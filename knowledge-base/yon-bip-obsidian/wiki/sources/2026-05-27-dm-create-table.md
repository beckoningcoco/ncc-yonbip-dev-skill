---
tags: [达梦数据库, 建表, SQL, 扩展实体, 索引, 触发器, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-dm-create-table.md]
---

# 旗舰版新建业务对象手动执行SQL建表

> 在旗舰版新建业务对象（扩展实体）后手动执行达梦 SQL 建表，含客开表（MDF 领域）和扩展子实体（标准领域）。

## 达梦建表要点

- 达梦不支持 `CREATE TABLE IF NOT EXISTS`，需确保表不存在
- MySQL 导出的建表语句需转换为达梦类型
- 小写驼峰表名需加双引号：`"c_monthlyCorporateBill"`
- 必备字段：`id`(PK), `pubts`(TIMESTAMP), `dr`(SMALLINT/INT), `ytenant_id`

## 标准操作

```sql
-- 建表
CREATE TABLE "schema"."table" (...);

-- 建租户索引
CREATE INDEX "idx_xxx_ytenant_id" ON "schema"."table" ("ytenant_id");

-- 建自动更新 pubts 的触发器
CREATE OR REPLACE TRIGGER "trg_xxx_pubts"
BEFORE UPDATE ON "schema"."table"
FOR EACH ROW
BEGIN
  :NEW."pubts" := CURRENT_TIMESTAMP;
END;

-- 加注释
COMMENT ON TABLE ... IS '说明';
COMMENT ON COLUMN ... IS '说明';

-- ALTER 增删字段
ALTER TABLE ... ADD "field" VARCHAR(108);
ALTER TABLE ... DROP COLUMN "field";
```

## 关键概念

- [[达梦数据库]]
- [[扩展实体]]
- [[DDL]]
