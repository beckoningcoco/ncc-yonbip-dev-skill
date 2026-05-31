# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indidataorder | pk_indidataorder | pk_indidataorder | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(50) |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(50) |
| 8 | billno | billno | billno | varchar2(50) |
| 9 | billtype | billtype | billtype | varchar2(50) |
| 10 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 11 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 12 | emendenum | emendenum | emendenum | number(38, 0) |
| 13 | endperiod | endperiod | endperiod | varchar2(20) |  |  | '~' |
| 14 | indiclass | indiclass | indiclass | varchar2(50) |
| 15 | layout | layout | layout | varchar2(200) |
| 16 | passdate | passdate | passdate | char(19) |
| 17 | passperiod | passperiod | passperiod | varchar2(50) |
| 18 | passyear | passyear | passyear | varchar2(50) |
| 19 | pkindicatortp | pkindicatortp | pkindicatortp | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_staindi | pk_staindi | pk_staindi | varchar2(20) |  |  | '~' |
| 23 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 24 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 25 | startperiod | startperiod | startperiod | varchar2(20) |  |  | '~' |
| 26 | transtype | transtype | transtype | varchar2(50) |
| 27 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 28 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |