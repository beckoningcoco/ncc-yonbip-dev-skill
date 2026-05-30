# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_isolation | pk_isolation | pk_isolation | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_name | bill_name | bill_name | varchar2(200) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | isolate_obj | isolate_obj | isolate_obj | varchar2(600) |
| 13 | isolate_require | isolate_require | isolate_require | varchar2(200) |
| 14 | memo | memo | memo | varchar2(200) |
| 15 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | varchar2(20) |  |  | '~' |
| 18 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 19 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 20 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 24 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 25 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 26 | pk_usedorg | pk_usedorg | pk_usedorg | varchar2(20) |  |  | '~' |
| 27 | pk_usedunit | pk_usedunit | pk_usedunit | varchar2(20) |  |  | '~' |
| 28 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 29 | plend_bck_time | plend_bck_time | plend_bck_time | char(19) |
| 30 | plend_crt_time | plend_crt_time | plend_crt_time | char(19) |
| 31 | plstart_bck_time | plstart_bck_time | plstart_bck_time | char(19) |
| 32 | plstart_crt_time | plstart_crt_time | plstart_crt_time | char(19) |
| 33 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 34 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 35 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 36 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 37 | src_rowno | src_rowno | src_rowno | varchar2(30) |
| 38 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 39 | transi_type | transi_type | transi_type | varchar2(30) |
| 40 | def1 | def1 | def1 | varchar2(101) |
| 41 | def2 | def2 | def2 | varchar2(101) |
| 42 | def3 | def3 | def3 | varchar2(101) |
| 43 | def4 | def4 | def4 | varchar2(101) |
| 44 | def5 | def5 | def5 | varchar2(101) |
| 45 | creationtime | creationtime | creationtime | char(19) |
| 46 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 49 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |