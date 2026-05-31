# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | dep_items | dep_items | dep_items | varchar2(4000) |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 7 | obj_rel_id | obj_rel_id | obj_rel_id | varchar2(255) | √ |
| 8 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 9 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |