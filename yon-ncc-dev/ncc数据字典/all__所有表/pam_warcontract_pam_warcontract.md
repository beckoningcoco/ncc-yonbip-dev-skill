# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10464.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_warcontract | pk_warcontract | pk_warcontract | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | contract_name | contract_name | contract_name | varchar2(80) |
| 12 | con_version | con_version | con_version | varchar2(50) |
| 13 | effect_date | effect_date | effect_date | char(19) |
| 14 | memo | memo | memo | varchar2(200) |
| 15 | new_flag | new_flag | new_flag | char(1) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 20 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 21 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 22 | pk_warcontract_oid | pk_warcontract_oid | pk_warcontract_oid | varchar2(50) |
| 23 | response_man | response_man | response_man | varchar2(80) |
| 24 | sign_date | sign_date | sign_date | char(19) |
| 25 | sign_site | sign_site | sign_site | varchar2(80) |
| 26 | terminate_date | terminate_date | terminate_date | char(19) |
| 27 | transi_type | transi_type | transi_type | varchar2(30) |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | def11 | def11 | def11 | varchar2(101) |
| 39 | def12 | def12 | def12 | varchar2(101) |
| 40 | def13 | def13 | def13 | varchar2(101) |
| 41 | def14 | def14 | def14 | varchar2(101) |
| 42 | def15 | def15 | def15 | varchar2(101) |
| 43 | def16 | def16 | def16 | varchar2(101) |
| 44 | def17 | def17 | def17 | varchar2(101) |
| 45 | def18 | def18 | def18 | varchar2(101) |
| 46 | def19 | def19 | def19 | varchar2(101) |
| 47 | def20 | def20 | def20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |