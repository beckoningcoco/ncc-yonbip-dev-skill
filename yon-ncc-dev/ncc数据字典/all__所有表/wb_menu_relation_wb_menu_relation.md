# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(255) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | label_code | label_code | label_code | varchar2(255) | √ |
| 5 | label_value | label_value | label_value | varchar2(255) | √ |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 8 | menu_action | menu_action | menu_action | varchar2(255) |
| 9 | menu_id | menu_id | menu_id | varchar2(255) |
| 10 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 11 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 12 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |