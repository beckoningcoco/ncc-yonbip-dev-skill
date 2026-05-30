# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory | pk_inventory | pk_inventory | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_code_src | bill_code_src | bill_code_src | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 11 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 13 | check_range | check_range | check_range | varchar2(2000) |
| 14 | check_standard | check_standard | check_standard | number(38, 0) |
| 15 | end_date | end_date | end_date | char(19) |
| 16 | inventoryway | inventoryway | inventoryway | number(38, 0) |
| 17 | invitem | invitem | invitem | varchar2(500) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_alter | pk_alter | pk_alter | varchar2(20) |  |  | '~' |
| 20 | pk_bill_src | pk_bill_src | pk_bill_src | varchar2(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_profit | pk_profit | pk_profit | varchar2(20) |  |  | '~' |
| 25 | pk_reduce | pk_reduce | pk_reduce | varchar2(20) |  |  | '~' |
| 26 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 27 | pk_transitype_src | pk_transitype_src | pk_transitype_src | varchar2(20) |  |  | '~' |
| 28 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 29 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 30 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 31 | saga_status | saga_status | saga_status | number(38, 0) |
| 32 | start_date | start_date | start_date | char(19) |
| 33 | transi_type | transi_type | transi_type | varchar2(30) |
| 34 | transi_type_src | transi_type_src | transi_type_src | varchar2(30) |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |