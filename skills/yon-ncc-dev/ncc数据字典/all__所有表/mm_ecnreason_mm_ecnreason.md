# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecnreason | pk_ecnreason | pk_ecnreason | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) | √ |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | vcode | vcode | vcode | varchar2(20) |
| 6 | vdiscript | vdiscript | vdiscript | varchar2(50) |
| 7 | vname | vname | vname | varchar2(300) |
| 8 | vname2 | vname2 | vname2 | varchar2(300) |
| 9 | vname3 | vname3 | vname3 | varchar2(300) |
| 10 | vname4 | vname4 | vname4 | varchar2(300) |
| 11 | vname5 | vname5 | vname5 | varchar2(300) |
| 12 | vname6 | vname6 | vname6 | varchar2(300) |
| 13 | vnote | vnote | vnote | varchar2(200) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |