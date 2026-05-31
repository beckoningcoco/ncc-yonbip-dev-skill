# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12947.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | code_type | code_type | code_type | varchar2(255) |
| 3 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 4 | enum_code | enum_code | enum_code | varchar2(255) | √ |
| 5 | enum_name | enum_name | enum_name | varchar2(255) |
| 6 | group_id | group_id | group_id | varchar2(255) | √ |
| 7 | modified_time | modified_time | modified_time | timestamp(6) |  |  | null |
| 8 | name_type | name_type | name_type | varchar2(255) |
| 9 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |