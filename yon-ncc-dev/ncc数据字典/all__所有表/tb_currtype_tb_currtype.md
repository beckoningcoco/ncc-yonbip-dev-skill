# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currtype | pk_currtype | pk_currtype | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | currdigit | currdigit | currdigit | number(38, 0) | √ |
| 4 | currtypesign | currtypesign | currtypesign | varchar2(60) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | isdefault | isdefault | isdefault | char(1) |
| 7 | name | name | name | varchar2(200) | √ |
| 8 | name2 | name2 | name2 | varchar2(200) |
| 9 | name3 | name3 | name3 | varchar2(200) |
| 10 | name4 | name4 | name4 | varchar2(200) |
| 11 | name5 | name5 | name5 | varchar2(200) |
| 12 | name6 | name6 | name6 | varchar2(200) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |