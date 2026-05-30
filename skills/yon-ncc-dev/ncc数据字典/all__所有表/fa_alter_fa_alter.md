# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8094.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter | pk_alter | pk_alter | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | batch_position_after | batch_position_after | batch_position_after | varchar2(50) |
| 5 | batch_position_before | batch_position_before | batch_position_before | varchar2(50) |
| 6 | batch_usedept_after | batch_usedept_after | batch_usedept_after | varchar2(4000) |  |  | '~' |
| 7 | batch_usedept_before | batch_usedept_before | batch_usedept_before | varchar2(4000) |  |  | '~' |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(40) |
| 11 | bill_src_sub | bill_src_sub | bill_src_sub | varchar2(20) |
| 12 | bill_status | bill_status | bill_status | number(38, 0) |
| 13 | bill_type | bill_type | bill_type | varchar2(4) |
| 14 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 15 | business_date | business_date | business_date | char(19) |
| 16 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 17 | deal_person | deal_person | deal_person | varchar2(20) |  |  | '~' |
| 18 | defpk | defpk | defpk | varchar2(256) |
| 19 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 20 | pk_batch_assetuser_after | pk_batch_assetuser_after | pk_batch_assetuser_after | varchar2(20) |  |  | '~' |
| 21 | pk_batch_assetuser_before | pk_batch_assetuser_before | pk_batch_assetuser_before | varchar2(20) |  |  | '~' |
| 22 | pk_batch_equiporg_after | pk_batch_equiporg_after | pk_batch_equiporg_after | varchar2(20) |  |  | '~' |
| 23 | pk_batch_equiporg_before | pk_batch_equiporg_before | pk_batch_equiporg_before | varchar2(20) |  |  | '~' |
| 24 | pk_batch_equiporg_v_after | pk_batch_equiporg_v_after | pk_batch_equiporg_v_after | varchar2(20) |  |  | '~' |
| 25 | pk_batch_equiporg_v_before | pk_batch_equiporg_v_before | pk_batch_equiporg_v_before | varchar2(20) |  |  | '~' |
| 26 | pk_batch_jobmngfil_after | pk_batch_jobmngfil_after | pk_batch_jobmngfil_after | varchar2(20) |  |  | '~' |
| 27 | pk_batch_jobmngfil_before | pk_batch_jobmngfil_before | pk_batch_jobmngfil_before | varchar2(20) |  |  | '~' |
| 28 | pk_batch_mandept_after | pk_batch_mandept_after | pk_batch_mandept_after | varchar2(20) |  |  | '~' |
| 29 | pk_batch_mandept_before | pk_batch_mandept_before | pk_batch_mandept_before | varchar2(20) |  |  | '~' |
| 30 | pk_batch_mandept_v_after | pk_batch_mandept_v_after | pk_batch_mandept_v_after | varchar2(20) |  |  | '~' |
| 31 | pk_batch_mandept_v_before | pk_batch_mandept_v_before | pk_batch_mandept_v_before | varchar2(20) |  |  | '~' |
| 32 | pk_batch_ownerorg_after | pk_batch_ownerorg_after | pk_batch_ownerorg_after | varchar2(20) |  |  | '~' |
| 33 | pk_batch_ownerorg_before | pk_batch_ownerorg_before | pk_batch_ownerorg_before | varchar2(20) |  |  | '~' |
| 34 | pk_batch_ownerorg_v_after | pk_batch_ownerorg_v_after | pk_batch_ownerorg_v_after | varchar2(20) |  |  | '~' |
| 35 | pk_batch_ownerorg_v_before | pk_batch_ownerorg_v_before | pk_batch_ownerorg_v_before | varchar2(20) |  |  | '~' |
| 36 | pk_bill_src | pk_bill_src | pk_bill_src | varchar2(20) |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 40 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 41 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 42 | pk_reason | pk_reason | pk_reason | varchar2(20) |  |  | '~' |
| 43 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 44 | pk_transitype_src | pk_transitype_src | pk_transitype_src | varchar2(20) |  |  | '~' |
| 45 | remark | remark | remark | varchar2(200) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 50 | sum_accudep | sum_accudep | sum_accudep | number(28, 8) |
| 51 | sum_cards | sum_cards | sum_cards | number(38, 0) |
| 52 | sum_depamount | sum_depamount | sum_depamount | number(28, 8) |
| 53 | sum_devaluate | sum_devaluate | sum_devaluate | number(28, 8) |
| 54 | sum_localoriginvalue | sum_localoriginvalue | sum_localoriginvalue | number(28, 8) |
| 55 | sum_netrating | sum_netrating | sum_netrating | number(28, 8) |
| 56 | sum_netvalue | sum_netvalue | sum_netvalue | number(28, 8) |
| 57 | transi_type | transi_type | transi_type | varchar2(30) |
| 58 | transi_type_src | transi_type_src | transi_type_src | varchar2(30) |
| 59 | def1 | def1 | def1 | varchar2(101) |
| 60 | def2 | def2 | def2 | varchar2(101) |
| 61 | def3 | def3 | def3 | varchar2(101) |
| 62 | def4 | def4 | def4 | varchar2(101) |
| 63 | def5 | def5 | def5 | varchar2(101) |
| 64 | def6 | def6 | def6 | varchar2(101) |
| 65 | def7 | def7 | def7 | varchar2(101) |
| 66 | def8 | def8 | def8 | varchar2(101) |
| 67 | def9 | def9 | def9 | varchar2(101) |
| 68 | def10 | def10 | def10 | varchar2(101) |
| 69 | def11 | def11 | def11 | varchar2(101) |
| 70 | def12 | def12 | def12 | varchar2(101) |
| 71 | def13 | def13 | def13 | varchar2(101) |
| 72 | def14 | def14 | def14 | varchar2(101) |
| 73 | def15 | def15 | def15 | varchar2(101) |
| 74 | def16 | def16 | def16 | varchar2(101) |
| 75 | def17 | def17 | def17 | varchar2(101) |
| 76 | def18 | def18 | def18 | varchar2(101) |
| 77 | def19 | def19 | def19 | varchar2(101) |
| 78 | def20 | def20 | def20 | varchar2(101) |
| 79 | creationtime | creationtime | creationtime | char(19) |
| 80 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 81 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 82 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 83 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 84 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |