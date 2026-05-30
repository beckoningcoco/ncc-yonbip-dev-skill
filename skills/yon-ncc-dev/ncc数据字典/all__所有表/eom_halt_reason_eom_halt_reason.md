# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_halt_reason | pk_halt_reason | pk_halt_reason | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | gener_failure | gener_failure | gener_failure | char(1) |
| 4 | is_failure_halt | is_failure_halt | is_failure_halt | char(1) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pre_flag | pre_flag | pre_flag | char(1) |
| 9 | reason_code | reason_code | reason_code | varchar2(40) |
| 10 | reason_name | reason_name | reason_name | varchar2(120) |
| 11 | reason_name2 | reason_name2 | reason_name2 | varchar2(120) |
| 12 | reason_name3 | reason_name3 | reason_name3 | varchar2(120) |
| 13 | reason_name4 | reason_name4 | reason_name4 | varchar2(120) |
| 14 | reason_name5 | reason_name5 | reason_name5 | varchar2(120) |
| 15 | reason_name6 | reason_name6 | reason_name6 | varchar2(120) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |