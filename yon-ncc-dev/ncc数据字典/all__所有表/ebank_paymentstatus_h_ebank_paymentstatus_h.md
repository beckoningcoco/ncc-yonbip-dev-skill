# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7843.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpaymentstatus_h | pk_ebankpaymentstatus_h | pk_ebankpaymentstatus_h | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(50) |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billbusitype | billbusitype | billbusitype | varchar2(50) |
| 7 | billid | billid | billid | varchar2(50) |
| 8 | billmaker | billmaker | billmaker | varchar2(50) |
| 9 | billmoney | billmoney | billmoney | number(28, 8) |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | billtype | billtype | billtype | varchar2(50) |
| 12 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 13 | busitype | busitype | busitype | varchar2(50) |
| 14 | dbilldata | dbilldata | dbilldata | char(19) |
| 15 | emendenum | emendenum | emendenum | number(38, 0) |
| 16 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 17 | maketime | maketime | maketime | char(19) | √ |
| 18 | paymentsenddate | paymentsenddate | paymentsenddate | char(19) |
| 19 | paymentsender | paymentsender | paymentsender | varchar2(20) |  |  | '~' |
| 20 | paymentserialnum | paymentserialnum | paymentserialnum | varchar2(50) |
| 21 | pkorg | pkorg | pkorg | varchar2(50) |
| 22 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 28 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 29 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 30 | srcgroup | srcgroup | srcgroup | varchar2(20) |  |  | '~' |
| 31 | transtype | transtype | transtype | varchar2(50) |
| 32 | transtypepk | transtypepk | transtypepk | char(20) | √ |
| 33 | def1 | def1 | def1 | varchar2(101) |
| 34 | def2 | def2 | def2 | varchar2(101) |
| 35 | def3 | def3 | def3 | number(28, 8) |
| 36 | def4 | def4 | def4 | varchar2(101) |
| 37 | def5 | def5 | def5 | varchar2(101) |
| 38 | def6 | def6 | def6 | varchar2(101) |
| 39 | def7 | def7 | def7 | varchar2(101) |
| 40 | def8 | def8 | def8 | varchar2(101) |
| 41 | def9 | def9 | def9 | varchar2(101) |
| 42 | def10 | def10 | def10 | varchar2(101) |
| 43 | creationtime | creationtime | creationtime | char(19) |
| 44 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 47 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |