# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | data_info | data_info | data_info | clob |
| 3 | define | define | define | clob |
| 4 | ds_type | ds_type | ds_type | varchar2(36) |
| 5 | materialize | materialize | materialize | number(38, 0) |
| 6 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 7 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 8 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |