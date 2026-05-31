---
name: SQL语句模板
description: >
  历史执行过的一些SQL语句，会从这里保存，当需要生成SQL时，可以参考当前资料。 
---

## 旗舰版 SQL

- select * from uorders.orders where id = '?'

  描述: 查询旗舰版 销售订单主表的 sql

- ```sql
  -- 查字段当前定义
  SELECT COLUMN_NAME, DATA_TYPE, DATA_LENGTH
  FROM ALL_TAB_COLUMNS
  WHERE OWNER = '{schema}'
    AND TABLE_NAME = '{table_name}'
    AND COLUMN_NAME = '{column_name}';

  -- 扩字段长度（达梦 VARCHAR2 最大 4000，超出用 CLOB）
  ALTER TABLE {schema}.{table_name} MODIFY {column_name} VARCHAR2({new_length});
  ```

  描述: 达梦数据库扩字段长度（解决 DataIntegrityViolationException 列长度超出定义报错） 





## NCC SQL 