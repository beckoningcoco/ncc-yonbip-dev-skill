# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disused | pk_disused | pk_disused | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | business_date | business_date | business_date | char(19) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 18 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 19 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 20 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 21 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 22 | saga_status | saga_status | saga_status | number(38, 0) |
| 23 | transi_type | transi_type | transi_type | varchar2(30) |
| 24 | def1 | def1 | def1 | varchar2(101) |
| 25 | def2 | def2 | def2 | varchar2(101) |
| 26 | def3 | def3 | def3 | varchar2(101) |
| 27 | def4 | def4 | def4 | varchar2(101) |
| 28 | def5 | def5 | def5 | varchar2(101) |
| 29 | def6 | def6 | def6 | varchar2(101) |
| 30 | def7 | def7 | def7 | varchar2(101) |
| 31 | def8 | def8 | def8 | varchar2(101) |
| 32 | def9 | def9 | def9 | varchar2(101) |
| 33 | def10 | def10 | def10 | varchar2(101) |
| 34 | def11 | def11 | def11 | varchar2(101) |
| 35 | def12 | def12 | def12 | varchar2(101) |
| 36 | def13 | def13 | def13 | varchar2(101) |
| 37 | def14 | def14 | def14 | varchar2(101) |
| 38 | def15 | def15 | def15 | varchar2(101) |
| 39 | def16 | def16 | def16 | varchar2(101) |
| 40 | def17 | def17 | def17 | varchar2(101) |
| 41 | def18 | def18 | def18 | varchar2(101) |
| 42 | def19 | def19 | def19 | varchar2(101) |
| 43 | def20 | def20 | def20 | varchar2(101) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |