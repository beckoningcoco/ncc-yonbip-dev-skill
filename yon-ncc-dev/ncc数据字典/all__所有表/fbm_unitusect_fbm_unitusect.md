# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unitusect | pk_unitusect | pk_unitusect | char(20) | √ |
| 2 | billmoney | billmoney | billmoney | number(28, 8) |
| 3 | charge | charge | charge | char(1) |
| 4 | credmoney | credmoney | credmoney | number(28, 8) |
| 5 | currchargedate | currchargedate | currchargedate | char(19) |
| 6 | enddate | enddate | enddate | char(19) |
| 7 | isoccsharepleamount | isoccsharepleamount | isoccsharepleamount | number(28, 8) |
| 8 | isoccunitpleamount | isoccunitpleamount | isoccunitpleamount | number(28, 8) |
| 9 | issuedate | issuedate | issuedate | char(19) |
| 10 | openbill_date | openbill_date | openbill_date | char(19) |
| 11 | pk_billcurr | pk_billcurr | pk_billcurr | varchar2(20) |  |  | '~' |
| 12 | pk_credcurr | pk_credcurr | pk_credcurr | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_openregister | pk_openregister | pk_openregister | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 18 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 19 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |
| 20 | pk_usectmanage | pk_usectmanage | pk_usectmanage | varchar2(20) |  |  | '~' |
| 21 | previchargedate | previchargedate | previchargedate | char(19) |
| 22 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 23 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 24 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 25 | saga_status | saga_status | saga_status | number(38, 0) |
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
| 36 | def11 | def11 | def11 | varchar2(101) |
| 37 | def12 | def12 | def12 | varchar2(101) |
| 38 | def13 | def13 | def13 | varchar2(101) |
| 39 | def14 | def14 | def14 | varchar2(101) |
| 40 | def15 | def15 | def15 | varchar2(101) |
| 41 | def16 | def16 | def16 | varchar2(101) |
| 42 | def17 | def17 | def17 | varchar2(101) |
| 43 | def18 | def18 | def18 | varchar2(101) |
| 44 | def19 | def19 | def19 | varchar2(101) |
| 45 | def20 | def20 | def20 | varchar2(101) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |