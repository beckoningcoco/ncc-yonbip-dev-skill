# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plugin | pk_plugin | pk_plugin | char(20) | √ |
| 2 | classname | classname | classname | varchar2(50) |
| 3 | code | code | code | varchar2(50) |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | enabled | enabled | enabled | char(1) |
| 6 | industrytype | industrytype | industrytype | varchar2(20) |  |  | '~' |
| 7 | iorder | iorder | iorder | number(38, 0) |
| 8 | localtype | localtype | localtype | varchar2(20) |  |  | '~' |
| 9 | name | name | name | varchar2(300) |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | note | note | note | varchar2(50) |
| 16 | pk_expoint | pk_expoint | pk_expoint | varchar2(20) |
| 17 | pk_module | pk_module | pk_module | varchar2(20) |
| 18 | pos | pos | pos | varchar2(50) |
| 19 | singleton | singleton | singleton | char(1) |
| 20 | sync | sync | sync | char(1) |  |  | 'Y' |
| 21 | trans | trans | trans | char(1) |  |  | 'Y' |
| 22 | creator | creator | creator | char(20) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |