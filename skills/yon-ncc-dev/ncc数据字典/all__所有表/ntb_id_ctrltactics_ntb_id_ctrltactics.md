# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(30) | √ |
| 3 | actionname | actionname | actionname | varchar2(30) | √ |
| 4 | actionname2 | actionname2 | actionname2 | varchar2(30) |
| 5 | actionname3 | actionname3 | actionname3 | varchar2(30) |
| 6 | actionname4 | actionname4 | actionname4 | varchar2(30) |
| 7 | actionname5 | actionname5 | actionname5 | varchar2(30) |
| 8 | actionname6 | actionname6 | actionname6 | varchar2(30) |
| 9 | billtype_code | billtype_code | billtype_code | varchar2(30) | √ |
| 10 | billtype_name | billtype_name | billtype_name | varchar2(30) | √ |
| 11 | billtype_name2 | billtype_name2 | billtype_name2 | varchar2(30) |
| 12 | billtype_name3 | billtype_name3 | billtype_name3 | varchar2(30) |
| 13 | billtype_name4 | billtype_name4 | billtype_name4 | varchar2(30) |
| 14 | billtype_name5 | billtype_name5 | billtype_name5 | varchar2(30) |
| 15 | billtype_name6 | billtype_name6 | billtype_name6 | varchar2(30) |
| 16 | busisystem | busisystem | busisystem | varchar2(10) |
| 17 | createdby | createdby | createdby | varchar2(20) |
| 18 | createddate | createddate | createddate | char(19) |
| 19 | isstart | isstart | isstart | char(1) |
| 20 | issystem | issystem | issystem | char(1) |
| 21 | isvirtualaction | isvirtualaction | isvirtualaction | char(1) |
| 22 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 23 | modifieddate | modifieddate | modifieddate | char(19) |
| 24 | parentctrltactics | parentctrltactics | parentctrltactics | varchar2(20) |
| 25 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |
| 28 | readydataadd | readydataadd | readydataadd | char(1) | √ |
| 29 | readydatareduce | readydatareduce | readydatareduce | char(1) | √ |
| 30 | rundataadd | rundataadd | rundataadd | char(1) | √ |
| 31 | rundatareduce | rundatareduce | rundatareduce | char(1) | √ |
| 32 | sys_code | sys_code | sys_code | varchar2(30) | √ |
| 33 | sys_name | sys_name | sys_name | varchar2(30) | √ |
| 34 | sys_obj | sys_obj | sys_obj | varchar2(20) | √ |
| 35 | upctdatetype | upctdatetype | upctdatetype | varchar2(30) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |