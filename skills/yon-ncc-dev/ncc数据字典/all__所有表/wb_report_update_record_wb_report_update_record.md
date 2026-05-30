# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | ana_id | ana_id | ana_id | varchar2(255) | √ |
| 3 | create_time | create_time | create_time | timestamp(6) | √ |  | null |
| 4 | primeval_id | primeval_id | primeval_id | varchar2(255) |
| 5 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 6 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 7 | update_type | update_type | update_type | varchar2(255) | √ |
| 8 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |