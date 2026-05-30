# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12972.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 3 | mea_multi | mea_multi | mea_multi | number(38, 0) |
| 4 | modified_time | modified_time | modified_time | timestamp(6) |  |  | null |
| 5 | seq | seq | seq | number(38, 0) |
| 6 | sub_type | sub_type | sub_type | varchar2(255) |
| 7 | text | text | text | varchar2(255) |
| 8 | type_code | type_code | type_code | varchar2(255) |
| 9 | unit_code | unit_code | unit_code | varchar2(50) |
| 10 | unit_name | unit_name | unit_name | varchar2(255) |
| 11 | creator | creator | creator | varchar2(255) |
| 12 | modifier | modifier | modifier | varchar2(255) |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |