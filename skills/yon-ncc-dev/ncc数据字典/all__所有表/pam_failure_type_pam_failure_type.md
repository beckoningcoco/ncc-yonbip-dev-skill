# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_type | pk_failure_type | pk_failure_type | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | type_code | type_code | type_code | varchar2(40) |
| 8 | type_name | type_name | type_name | varchar2(400) |
| 9 | type_name2 | type_name2 | type_name2 | varchar2(400) |
| 10 | type_name3 | type_name3 | type_name3 | varchar2(400) |
| 11 | type_name4 | type_name4 | type_name4 | varchar2(400) |
| 12 | type_name5 | type_name5 | type_name5 | varchar2(400) |
| 13 | type_name6 | type_name6 | type_name6 | varchar2(400) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |