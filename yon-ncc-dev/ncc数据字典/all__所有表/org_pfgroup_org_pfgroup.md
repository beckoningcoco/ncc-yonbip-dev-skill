# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfgroup | pk_pfgroup | pk_pfgroup | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | enablestate | enablestate | enablestate | varchar2(50) |
| 4 | gcode | gcode | gcode | varchar2(50) |
| 5 | gname | gname | gname | varchar2(200) |
| 6 | gname2 | gname2 | gname2 | varchar2(200) |
| 7 | gname3 | gname3 | gname3 | varchar2(200) |
| 8 | gname4 | gname4 | gname4 | varchar2(200) |
| 9 | gname5 | gname5 | gname5 | varchar2(200) |
| 10 | gname6 | gname6 | gname6 | varchar2(200) |
| 11 | innercode | innercode | innercode | varchar2(50) |
| 12 | isbudget | isbudget | isbudget | char(1) |
| 13 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_pfconstruct | pk_pfconstruct | pk_pfconstruct | char(20) | √ |
| 17 | principal | principal | principal | varchar2(20) |  |  | '~' |
| 18 | vnote | vnote | vnote | varchar2(1536) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |