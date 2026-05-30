# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankbillinfoquery | pk_ebankbillinfoquery | pk_ebankbillinfoquery | char(20) | √ |
| 2 | account | account | account | varchar2(50) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(50) |
| 5 | approver | approver | approver | varchar2(50) |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | billid | billid | billid | varchar2(50) |
| 8 | billmaker | billmaker | billmaker | varchar2(50) |
| 9 | billmoney | billmoney | billmoney | number(28, 8) |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | billstatus | billstatus | billstatus | varchar2(50) |
| 12 | billtype | billtype | billtype | varchar2(50) |
| 13 | busitype | busitype | busitype | varchar2(50) |
| 14 | cdxynum | cdxynum | cdxynum | varchar2(50) |
| 15 | ebillnum | ebillnum | ebillnum | varchar2(50) |
| 16 | emendenum | emendenum | emendenum | number(38, 0) |
| 17 | gatheorg | gatheorg | gatheorg | varchar2(50) |
| 18 | gatherbank | gatherbank | gatherbank | varchar2(50) |
| 19 | gatherorgbank | gatherorgbank | gatherorgbank | varchar2(50) |
| 20 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 21 | maketime | maketime | maketime | char(19) | √ |
| 22 | outbillorg | outbillorg | outbillorg | varchar2(50) |
| 23 | outdate | outdate | outdate | char(19) |
| 24 | paybank | paybank | paybank | varchar2(50) |
| 25 | payorg | payorg | payorg | varchar2(50) |
| 26 | payorgbankaccount | payorgbankaccount | payorgbankaccount | varchar2(50) |
| 27 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 33 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 34 | srcgroup | srcgroup | srcgroup | varchar2(20) |  |  | '~' |
| 35 | srcorg | srcorg | srcorg | varchar2(20) |  |  | '~' |
| 36 | tradecontractdate | tradecontractdate | tradecontractdate | varchar2(50) |
| 37 | tradedate | tradedate | tradedate | char(19) |
| 38 | transtype | transtype | transtype | varchar2(50) |
| 39 | def1 | def1 | def1 | varchar2(101) |
| 40 | def2 | def2 | def2 | varchar2(101) |
| 41 | def3 | def3 | def3 | varchar2(101) |
| 42 | def4 | def4 | def4 | varchar2(101) |
| 43 | def5 | def5 | def5 | varchar2(101) |
| 44 | def6 | def6 | def6 | varchar2(101) |
| 45 | def7 | def7 | def7 | varchar2(101) |
| 46 | def8 | def8 | def8 | varchar2(101) |
| 47 | def9 | def9 | def9 | varchar2(101) |
| 48 | def10 | def10 | def10 | varchar2(101) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |