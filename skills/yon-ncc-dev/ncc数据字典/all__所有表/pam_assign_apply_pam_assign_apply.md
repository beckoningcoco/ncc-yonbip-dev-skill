# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | complete_flag | complete_flag | complete_flag | char(1) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_applier | pk_applier | pk_applier | varchar2(20) |  |  | '~' |
| 14 | pk_appydept | pk_appydept | pk_appydept | varchar2(20) |  |  | '~' |
| 15 | pk_appydept_v | pk_appydept_v | pk_appydept_v | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 20 | pk_unit_used | pk_unit_used | pk_unit_used | varchar2(20) |  |  | '~' |
| 21 | pk_unit_used_v | pk_unit_used_v | pk_unit_used_v | varchar2(20) |  |  | '~' |
| 22 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 23 | pk_usedept_v | pk_usedept_v | pk_usedept_v | varchar2(20) |  |  | '~' |
| 24 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 25 | pre_text1 | pre_text1 | pre_text1 | varchar2(128) |
| 26 | pre_text2 | pre_text2 | pre_text2 | varchar2(128) |
| 27 | pre_text3 | pre_text3 | pre_text3 | varchar2(128) |
| 28 | pre_text4 | pre_text4 | pre_text4 | varchar2(128) |
| 29 | pre_text5 | pre_text5 | pre_text5 | varchar2(128) |
| 30 | pre_text6 | pre_text6 | pre_text6 | varchar2(128) |
| 31 | pre_text7 | pre_text7 | pre_text7 | varchar2(128) |
| 32 | pre_text8 | pre_text8 | pre_text8 | varchar2(128) |
| 33 | pre_text9 | pre_text9 | pre_text9 | varchar2(128) |
| 34 | pre_text10 | pre_text10 | pre_text10 | varchar2(128) |
| 35 | reason | reason | reason | varchar2(80) |
| 36 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 37 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 38 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 39 | saga_status | saga_status | saga_status | number(38, 0) |
| 40 | transi_type | transi_type | transi_type | varchar2(20) |
| 41 | def1 | def1 | def1 | varchar2(101) |
| 42 | def2 | def2 | def2 | varchar2(101) |
| 43 | def3 | def3 | def3 | varchar2(101) |
| 44 | def4 | def4 | def4 | varchar2(101) |
| 45 | def5 | def5 | def5 | varchar2(101) |
| 46 | def6 | def6 | def6 | varchar2(101) |
| 47 | def7 | def7 | def7 | varchar2(101) |
| 48 | def8 | def8 | def8 | varchar2(101) |
| 49 | def9 | def9 | def9 | varchar2(101) |
| 50 | def10 | def10 | def10 | varchar2(101) |
| 51 | def11 | def11 | def11 | varchar2(101) |
| 52 | def12 | def12 | def12 | varchar2(101) |
| 53 | def13 | def13 | def13 | varchar2(101) |
| 54 | def14 | def14 | def14 | varchar2(101) |
| 55 | def15 | def15 | def15 | varchar2(101) |
| 56 | def16 | def16 | def16 | varchar2(101) |
| 57 | def17 | def17 | def17 | varchar2(101) |
| 58 | def18 | def18 | def18 | varchar2(101) |
| 59 | def19 | def19 | def19 | varchar2(101) |
| 60 | def20 | def20 | def20 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |