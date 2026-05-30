# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10678.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectstate | pk_projectstate | pk_projectstate | char(20) | √ |
| 2 | cannotdelete | cannotdelete | cannotdelete | char(1) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | memo | memo | memo | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | state_code | state_code | state_code | varchar2(50) |
| 8 | state_name | state_name | state_name | varchar2(300) |
| 9 | state_name2 | state_name2 | state_name2 | varchar2(300) |
| 10 | state_name3 | state_name3 | state_name3 | varchar2(300) |
| 11 | state_name4 | state_name4 | state_name4 | varchar2(300) |
| 12 | state_name5 | state_name5 | state_name5 | varchar2(300) |
| 13 | state_name6 | state_name6 | state_name6 | varchar2(300) |
| 14 | state_sort | state_sort | state_sort | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |