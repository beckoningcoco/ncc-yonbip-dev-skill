# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_type | pk_plan_type | pk_plan_type | char(20) | √ |
| 2 | after_plan_manner | after_plan_manner | after_plan_manner | number(38, 0) |
| 3 | ctrl_according | ctrl_according | ctrl_according | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | memo | memo | memo | varchar2(80) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | type_code | type_code | type_code | varchar2(40) |
| 9 | type_name | type_name | type_name | varchar2(120) |
| 10 | type_name2 | type_name2 | type_name2 | varchar2(120) |
| 11 | type_name3 | type_name3 | type_name3 | varchar2(120) |
| 12 | type_name4 | type_name4 | type_name4 | varchar2(120) |
| 13 | type_name5 | type_name5 | type_name5 | varchar2(120) |
| 14 | type_name6 | type_name6 | type_name6 | varchar2(120) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |