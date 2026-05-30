# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6969.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mandate | pk_mandate | pk_mandate | char(20) | √ |
| 2 | actualpayer | actualpayer | actualpayer | varchar2(20) |  |  | '~' |
| 3 | bankaccsub | bankaccsub | bankaccsub | varchar2(20) |  |  | '~' |
| 4 | contractno | contractno | contractno | varchar2(50) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | varchar2(20) |  |  | '0' |
| 6 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 7 | frequency | frequency | frequency | varchar2(50) |
| 8 | frequencylmtime | frequencylmtime | frequencylmtime | char(19) |
| 9 | id | id | id | varchar2(50) | √ |
| 10 | islastversion | islastversion | islastversion | char(1) |
| 11 | mandatetype | mandatetype | mandatetype | varchar2(50) |  |  | '1' |
| 12 | orgcode | orgcode | orgcode | varchar2(50) |
| 13 | orgname1 | orgname1 | orgname1 | varchar2(200) | √ |
| 14 | orgname2 | orgname2 | orgname2 | varchar2(200) |
| 15 | payeebankacc | payeebankacc | payeebankacc | varchar2(20) |  |  | '~' |
| 16 | payeeid | payeeid | payeeid | varchar2(50) |
| 17 | payeetype | payeetype | payeetype | varchar2(50) |
| 18 | payingfirstname | payingfirstname | payingfirstname | varchar2(200) |
| 19 | payingid | payingid | payingid | varchar2(50) | √ |
| 20 | payinglastname | payinglastname | payinglastname | varchar2(200) |
| 21 | payingtype | payingtype | payingtype | varchar2(50) |
| 22 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_reference | pk_reference | pk_reference | varchar2(50) |
| 26 | signdate | signdate | signdate | char(19) | √ |
| 27 | signplace | signplace | signplace | varchar2(200) | √ |
| 28 | tradetype | tradetype | tradetype | number(38, 0) | √ |  | 0 |
| 29 | usedtimes | usedtimes | usedtimes | number(38, 0) |
| 30 | validfrom | validfrom | validfrom | char(19) | √ |
| 31 | validto | validto | validto | char(19) | √ |
| 32 | version | version | version | varchar2(50) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |