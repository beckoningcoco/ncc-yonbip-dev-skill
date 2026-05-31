# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | code | code | code | number(38, 0) | √ |
| 3 | combine | combine | combine | number(38, 0) | √ |
| 4 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 5 | end_point | end_point | end_point | varchar2(255) | √ |
| 6 | modified_time | modified_time | modified_time | timestamp(6) |  |  | null |
| 7 | name | name | name | varchar2(255) | √ |
| 8 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 9 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 10 | creator | creator | creator | varchar2(255) |
| 11 | modifier | modifier | modifier | varchar2(255) |
| 12 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |