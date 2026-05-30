# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8732.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interdocref | pk_interdocref | pk_interdocref | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | bhout | bhout | bhout | char(1) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billid | billid | billid | varchar2(50) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | billtype | billtype | billtype | varchar2(50) |
| 12 | bmout | bmout | bmout | char(1) |
| 13 | busitype | busitype | busitype | varchar2(50) |
| 14 | hsyscode | hsyscode | hsyscode | varchar2(50) |
| 15 | idissys | idissys | idissys | number(38, 0) |
| 16 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 17 | maketime | maketime | maketime | char(19) | √ |
| 18 | msyscode | msyscode | msyscode | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_hrp_ref | pk_hrp_ref | pk_hrp_ref | varchar2(20) |  |  | '~' |
| 21 | pk_mid_ref | pk_mid_ref | pk_mid_ref | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | transtype | transtype | transtype | varchar2(50) |
| 25 | zbcode | zbcode | zbcode | varchar2(200) |
| 26 | zbname | zbname | zbname | varchar2(200) |
| 27 | def1 | def1 | def1 | varchar2(101) |
| 28 | def2 | def2 | def2 | varchar2(101) |
| 29 | def3 | def3 | def3 | varchar2(101) |
| 30 | def4 | def4 | def4 | varchar2(101) |
| 31 | def5 | def5 | def5 | varchar2(101) |
| 32 | def6 | def6 | def6 | varchar2(101) |
| 33 | def7 | def7 | def7 | varchar2(101) |
| 34 | def8 | def8 | def8 | varchar2(101) |
| 35 | def9 | def9 | def9 | varchar2(101) |
| 36 | def10 | def10 | def10 | varchar2(101) |
| 37 | def11 | def11 | def11 | varchar2(101) |
| 38 | def12 | def12 | def12 | varchar2(101) |
| 39 | def13 | def13 | def13 | varchar2(101) |
| 40 | def14 | def14 | def14 | varchar2(101) |
| 41 | def15 | def15 | def15 | varchar2(101) |
| 42 | def16 | def16 | def16 | varchar2(101) |
| 43 | def17 | def17 | def17 | varchar2(101) |
| 44 | def18 | def18 | def18 | varchar2(101) |
| 45 | def19 | def19 | def19 | varchar2(101) |
| 46 | def20 | def20 | def20 | varchar2(101) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |