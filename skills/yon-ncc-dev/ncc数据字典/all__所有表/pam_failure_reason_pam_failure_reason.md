# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_reason | pk_failure_reason | pk_failure_reason | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | reason_code | reason_code | reason_code | varchar2(40) |
| 7 | reason_name | reason_name | reason_name | varchar2(400) |
| 8 | reason_name2 | reason_name2 | reason_name2 | varchar2(400) |
| 9 | reason_name3 | reason_name3 | reason_name3 | varchar2(400) |
| 10 | reason_name4 | reason_name4 | reason_name4 | varchar2(400) |
| 11 | reason_name5 | reason_name5 | reason_name5 | varchar2(400) |
| 12 | reason_name6 | reason_name6 | reason_name6 | varchar2(400) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |