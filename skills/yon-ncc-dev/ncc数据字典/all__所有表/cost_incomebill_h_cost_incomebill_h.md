# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7695.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomebill_h | pk_incomebill_h | pk_incomebill_h | char(20) | √ |
| 2 | accountperiod | accountperiod | accountperiod | varchar2(20) |  |  | '~' |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(50) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | billid | billid | billid | varchar2(50) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billtype | billtype | billtype | varchar2(50) |
| 11 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 12 | busitype | busitype | busitype | varchar2(50) |
| 13 | dbilldate | dbilldate | dbilldate | char(19) |
| 14 | dconfirmtime | dconfirmtime | dconfirmtime | char(19) |
| 15 | emendenum | emendenum | emendenum | number(38, 0) |
| 16 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 17 | maketime | maketime | maketime | char(19) |
| 18 | pkorg | pkorg | pkorg | varchar2(50) |
| 19 | pk_confirmor | pk_confirmor | pk_confirmor | varchar2(50) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 24 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 25 | transtype | transtype | transtype | varchar2(50) |
| 26 | transtypepk | transtypepk | transtypepk | char(20) |
| 27 | vmemo | vmemo | vmemo | varchar2(200) |
| 28 | vtotalmny | vtotalmny | vtotalmny | number(28, 8) |
| 29 | def1 | def1 | def1 | varchar2(100) |
| 30 | def2 | def2 | def2 | varchar2(100) |
| 31 | def3 | def3 | def3 | varchar2(100) |
| 32 | def4 | def4 | def4 | varchar2(100) |
| 33 | def5 | def5 | def5 | varchar2(100) |
| 34 | def6 | def6 | def6 | varchar2(100) |
| 35 | def7 | def7 | def7 | varchar2(100) |
| 36 | def8 | def8 | def8 | varchar2(100) |
| 37 | def9 | def9 | def9 | varchar2(100) |
| 38 | def10 | def10 | def10 | varchar2(100) |
| 39 | def11 | def11 | def11 | varchar2(100) |
| 40 | def12 | def12 | def12 | varchar2(100) |
| 41 | def13 | def13 | def13 | varchar2(100) |
| 42 | def14 | def14 | def14 | varchar2(100) |
| 43 | def15 | def15 | def15 | varchar2(100) |
| 44 | def16 | def16 | def16 | varchar2(100) |
| 45 | def17 | def17 | def17 | varchar2(100) |
| 46 | def18 | def18 | def18 | varchar2(100) |
| 47 | def19 | def19 | def19 | varchar2(100) |
| 48 | def20 | def20 | def20 | varchar2(100) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |