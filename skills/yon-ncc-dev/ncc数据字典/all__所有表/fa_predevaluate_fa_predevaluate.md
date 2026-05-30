# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predevaluate | pk_predevaluate | pk_predevaluate | char(20) | √ |
| 2 | assetgroup_carring_account | assetgroup_carring_account | assetgroup_carring_account | number(28, 8) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | business_date | business_date | business_date | char(19) |
| 11 | carring_account | carring_account | carring_account | number(28, 8) |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 13 | currentresume | currentresume | currentresume | number(28, 8) |
| 14 | currentresume_global | currentresume_global | currentresume_global | number(28, 8) |
| 15 | currentresume_group | currentresume_group | currentresume_group | number(28, 8) |
| 16 | headquarters_carring_account | headquarters_carring_account | headquarters_carring_account | number(28, 8) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | originalbillid | originalbillid | originalbillid | varchar2(50) |
| 19 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 20 | pk_assetgroup | pk_assetgroup | pk_assetgroup | varchar2(20) |  |  | '~' |
| 21 | pk_assetgroup_headquarters | pk_assetgroup_headquarters | pk_assetgroup_headquarters | varchar2(50) |
| 22 | pk_currency | pk_currency | pk_currency | varchar2(20) |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 27 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 28 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 29 | recorder | recorder | recorder | varchar2(20) |  |  | '~' |
| 30 | resume_this_group | resume_this_group | resume_this_group | number(28, 8) |
| 31 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 32 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 33 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 34 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 35 | transi_type | transi_type | transi_type | varchar2(30) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |