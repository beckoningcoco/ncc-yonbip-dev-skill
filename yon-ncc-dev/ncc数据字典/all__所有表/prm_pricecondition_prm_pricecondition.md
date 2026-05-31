# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricecondition | pk_pricecondition | pk_pricecondition | char(20) | √ |
| 2 | areaclinnercode | areaclinnercode | areaclinnercode | varchar2(230) |
| 3 | csrcconditionid | csrcconditionid | csrcconditionid | varchar2(20) |
| 4 | csrcsaleorgid | csrcsaleorgid | csrcsaleorgid | varchar2(20) |
| 5 | customerinnercode | customerinnercode | customerinnercode | varchar2(230) |
| 6 | dbegindate | dbegindate | dbegindate | varchar2(19) |
| 7 | denddate | denddate | denddate | varchar2(19) |
| 8 | fcalctypeflag | fcalctypeflag | fcalctypeflag | number(38, 0) |
| 9 | fconditiontypeflag | fconditiontypeflag | fconditiontypeflag | number(38, 0) | √ |
| 10 | forigattributeflag | forigattributeflag | forigattributeflag | number(38, 0) |
| 11 | materialinnercode | materialinnercode | materialinnercode | varchar2(230) |
| 12 | ndiscount | ndiscount | ndiscount | number(28, 8) |
| 13 | pk_conditionsource | pk_conditionsource | pk_conditionsource | varchar2(20) |  |  | '~' |
| 14 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 15 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 16 | pk_custsaleclass | pk_custsaleclass | pk_custsaleclass | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 18 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 19 | pk_marsaleclass | pk_marsaleclass | pk_marsaleclass | varchar2(20) |  |  | '~' |
| 20 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 22 | vcode | vcode | vcode | varchar2(30) |
| 23 | vcomoperator1 | vcomoperator1 | vcomoperator1 | varchar2(50) |
| 24 | vcomoperator2 | vcomoperator2 | vcomoperator2 | varchar2(50) |
| 25 | vname | vname | vname | varchar2(45) |
| 26 | vname2 | vname2 | vname2 | varchar2(45) |
| 27 | vname3 | vname3 | vname3 | varchar2(45) |
| 28 | vname4 | vname4 | vname4 | varchar2(45) |
| 29 | vname5 | vname5 | vname5 | varchar2(45) |
| 30 | vname6 | vname6 | vname6 | varchar2(45) |
| 31 | vnote | vnote | vnote | varchar2(181) |
| 32 | vvalue1 | vvalue1 | vvalue1 | varchar2(30) |
| 33 | vvalue2 | vvalue2 | vvalue2 | varchar2(30) |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |