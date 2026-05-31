# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8783.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_researchitem | pk_researchitem | pk_researchitem | char(20) | √ |
| 2 | data_type | data_type | data_type | number(38, 0) |
| 3 | item_code | item_code | item_code | varchar2(28) |
| 4 | item_name | item_name | item_name | varchar2(128) |
| 5 | item_name2 | item_name2 | item_name2 | varchar2(128) |
| 6 | item_name3 | item_name3 | item_name3 | varchar2(128) |
| 7 | item_name4 | item_name4 | item_name4 | varchar2(128) |
| 8 | item_name5 | item_name5 | item_name5 | varchar2(128) |
| 9 | item_name6 | item_name6 | item_name6 | varchar2(128) |
| 10 | item_state | item_state | item_state | number(38, 0) |
| 11 | item_year | item_year | item_year | char(4) |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | pk_researchitemglb | pk_researchitemglb | pk_researchitemglb | char(20) |
| 15 | ref_object | ref_object | ref_object | varchar2(50) |
| 16 | stat_condition_sql | stat_condition_sql | stat_condition_sql | varchar2(3000) |
| 17 | stat_mode | stat_mode | stat_mode | number(38, 0) |
| 18 | stat_object_sql | stat_object_sql | stat_object_sql | varchar2(3000) |
| 19 | sysinit_flag | sysinit_flag | sysinit_flag | char(1) |
| 20 | creationtime | creationtime | creationtime | char(19) | √ |
| 21 | creator | creator | creator | char(20) | √ |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | char(20) |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |