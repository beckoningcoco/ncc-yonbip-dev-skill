# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deployout | pk_deployout | pk_deployout | char(20) | √ |
| 2 | account_currency | account_currency | account_currency | varchar2(20) |
| 3 | account_rate | account_rate | account_rate | number(28, 8) |
| 4 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 5 | audittime | audittime | audittime | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | bill_code | bill_code | bill_code | varchar2(40) |
| 9 | bill_status | bill_status | bill_status | number(38, 0) |
| 10 | bill_type | bill_type | bill_type | varchar2(4) |
| 11 | business_date | business_date | business_date | char(19) |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 13 | confirm_flag | confirm_flag | confirm_flag | char(1) |
| 14 | deployer | deployer | deployer | varchar2(20) |  |  | '~' |
| 15 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 16 | pk_accbook_scale | pk_accbook_scale | pk_accbook_scale | varchar2(50) |
| 17 | pk_currency | pk_currency | pk_currency | varchar2(50) |
| 18 | pk_deployin | pk_deployin | pk_deployin | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 22 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 23 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 26 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 27 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 28 | reason | reason | reason | varchar2(50) |
| 29 | remark | remark | remark | varchar2(200) |
| 30 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 31 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 32 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 33 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 34 | transi_type | transi_type | transi_type | varchar2(30) |
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