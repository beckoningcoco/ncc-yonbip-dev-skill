# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | description | description | description | varchar2(255) |
| 3 | global_name | global_name | global_name | varchar2(36) | √ |
| 4 | global_option | global_option | global_option | varchar2(255) |
| 5 | global_sort | global_sort | global_sort | number(38, 0) |
| 6 | global_type | global_type | global_type | varchar2(255) | √ |
| 7 | global_value | global_value | global_value | varchar2(4000) |
| 8 | tenant_id | tenant_id | tenant_id | varchar2(20) |  |  | 'default' |
| 9 | visible | visible | visible | varchar2(20) |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |