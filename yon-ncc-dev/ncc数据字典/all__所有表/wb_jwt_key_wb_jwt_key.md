# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 3 | private_key | private_key | private_key | clob |
| 4 | public_key | public_key | public_key | clob |
| 5 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 6 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |