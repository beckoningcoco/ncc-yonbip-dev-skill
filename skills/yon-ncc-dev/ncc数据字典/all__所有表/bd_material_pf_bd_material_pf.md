# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_material_pf | pk_material_pf | pk_material_pf | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(1024) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | billno | billno | billno | varchar2(50) | √ |
| 6 | billstatus | billstatus | billstatus | number(38, 0) | √ |  | -1 |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 8 | material | material | material | blob |
| 9 | materialcode | materialcode | materialcode | varchar2(40) |
| 10 | materialname | materialname | materialname | varchar2(300) |
| 11 | materialname2 | materialname2 | materialname2 | varchar2(300) |
| 12 | materialname3 | materialname3 | materialname3 | varchar2(300) |
| 13 | materialname4 | materialname4 | materialname4 | varchar2(300) |
| 14 | materialname5 | materialname5 | materialname5 | varchar2(300) |
| 15 | materialname6 | materialname6 | materialname6 | varchar2(300) |
| 16 | memo | memo | memo | varchar2(1024) |
| 17 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '01WL' |
| 18 | pk_group | pk_group | pk_group | char(20) | √ |
| 19 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | char(20) | √ |
| 21 | pk_targetorg | pk_targetorg | pk_targetorg | varchar2(20) |  |  | '~' |
| 22 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 23 | proposetime | proposetime | proposetime | char(19) |
| 24 | remark | remark | remark | varchar2(1024) |
| 25 | targetorg | targetorg | targetorg | number(38, 0) | √ |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | def5 | def5 | def5 | varchar2(101) |
| 31 | def6 | def6 | def6 | varchar2(101) |
| 32 | def7 | def7 | def7 | varchar2(101) |
| 33 | def8 | def8 | def8 | varchar2(101) |
| 34 | def9 | def9 | def9 | varchar2(101) |
| 35 | def10 | def10 | def10 | varchar2(101) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |