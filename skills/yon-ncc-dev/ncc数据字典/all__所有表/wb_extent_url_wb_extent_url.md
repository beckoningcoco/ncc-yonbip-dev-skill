# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12951.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 3 | extent_type | extent_type | extent_type | varchar2(255) | √ |
| 4 | modified_time | modified_time | modified_time | timestamp(6) |  |  | null |
| 5 | name | name | name | varchar2(255) |
| 6 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 7 | tag | tag | tag | varchar2(255) | √ |
| 8 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 9 | url | url | url | varchar2(255) | √ |
| 10 | url_header | url_header | url_header | clob |
| 11 | creator | creator | creator | varchar2(255) |
| 12 | modifier | modifier | modifier | varchar2(255) |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |