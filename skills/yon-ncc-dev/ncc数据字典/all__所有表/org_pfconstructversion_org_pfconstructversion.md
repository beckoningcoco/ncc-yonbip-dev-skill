# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | islastversion | islastversion | islastversion | char(1) |
| 6 | name | name | name | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_pfconstruct | pk_pfconstruct | pk_pfconstruct | char(20) | √ |
| 10 | venddate | venddate | venddate | char(19) |
| 11 | vname | vname | vname | varchar2(200) |
| 12 | vname2 | vname2 | vname2 | varchar2(200) |
| 13 | vname3 | vname3 | vname3 | varchar2(200) |
| 14 | vname4 | vname4 | vname4 | varchar2(200) |
| 15 | vname5 | vname5 | vname5 | varchar2(200) |
| 16 | vname6 | vname6 | vname6 | varchar2(200) |
| 17 | vno | vno | vno | varchar2(50) |
| 18 | vstartdate | vstartdate | vstartdate | char(19) |
| 19 | def1 | def1 | def1 | varchar2(100) |
| 20 | def2 | def2 | def2 | varchar2(100) |
| 21 | def3 | def3 | def3 | varchar2(100) |
| 22 | def4 | def4 | def4 | varchar2(100) |
| 23 | def5 | def5 | def5 | varchar2(100) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |