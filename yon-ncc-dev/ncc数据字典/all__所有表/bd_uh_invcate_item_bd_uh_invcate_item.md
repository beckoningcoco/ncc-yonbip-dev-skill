# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcateitem | pk_invcateitem | pk_invcateitem | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | amount_pati | amount_pati | amount_pati | number(28, 8) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(50) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 11 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 12 | busitype | busitype | busitype | varchar2(50) |
| 13 | emendenum | emendenum | emendenum | number(38, 0) |
| 14 | itemdes | itemdes | itemdes | varchar2(256) |
| 15 | itemid | itemid | itemid | varchar2(30) |
| 16 | itemname | itemname | itemname | varchar2(50) |
| 17 | itemno | itemno | itemno | number(38, 0) |
| 18 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 19 | maketime | maketime | maketime | char(19) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 25 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 26 | transtype | transtype | transtype | varchar2(50) |
| 27 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |