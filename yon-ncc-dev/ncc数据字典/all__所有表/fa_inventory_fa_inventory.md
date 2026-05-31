# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory | pk_inventory | pk_inventory | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | business_date | business_date | business_date | char(20) |
| 10 | check_note | check_note | check_note | varchar2(256) |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(80) |
| 12 | check_range | check_range | check_range | varchar2(256) |
| 13 | check_standard | check_standard | check_standard | number(38, 0) |  |  | 1 |
| 14 | end_date | end_date | end_date | char(20) |
| 15 | inventoryway | inventoryway | inventoryway | number(38, 0) |
| 16 | pk_alter | pk_alter | pk_alter | varchar2(50) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_profit | pk_profit | pk_profit | varchar2(50) |
| 21 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 22 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 23 | pk_reduce | pk_reduce | pk_reduce | varchar2(50) |
| 24 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 25 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 26 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 27 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 28 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 29 | start_date | start_date | start_date | char(20) |
| 30 | transi_type | transi_type | transi_type | varchar2(30) |
| 31 | def1 | def1 | def1 | varchar2(101) |
| 32 | def2 | def2 | def2 | varchar2(101) |
| 33 | def3 | def3 | def3 | varchar2(101) |
| 34 | def4 | def4 | def4 | varchar2(101) |
| 35 | def5 | def5 | def5 | varchar2(101) |
| 36 | def6 | def6 | def6 | varchar2(101) |
| 37 | def7 | def7 | def7 | varchar2(101) |
| 38 | def8 | def8 | def8 | varchar2(101) |
| 39 | def9 | def9 | def9 | varchar2(101) |
| 40 | def10 | def10 | def10 | varchar2(101) |
| 41 | def11 | def11 | def11 | varchar2(101) |
| 42 | def12 | def12 | def12 | varchar2(101) |
| 43 | def13 | def13 | def13 | varchar2(101) |
| 44 | def14 | def14 | def14 | varchar2(101) |
| 45 | def15 | def15 | def15 | varchar2(101) |
| 46 | def16 | def16 | def16 | varchar2(101) |
| 47 | def17 | def17 | def17 | varchar2(101) |
| 48 | def18 | def18 | def18 | varchar2(101) |
| 49 | def19 | def19 | def19 | varchar2(101) |
| 50 | def20 | def20 | def20 | varchar2(101) |
| 51 | creationtime | creationtime | creationtime | char(19) |
| 52 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 55 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |