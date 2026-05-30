# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter | pk_alter | pk_alter | char(20) | √ |
| 2 | alterinfo | alterinfo | alterinfo | varchar2(1000) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_date | bill_date | bill_date | char(19) |
| 9 | bill_status | bill_status | bill_status | number(38, 0) |
| 10 | bill_type | bill_type | bill_type | varchar2(4) |
| 11 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(80) |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |
| 15 | pk_jobmngfil_after_batch | pk_jobmngfil_after_batch | pk_jobmngfil_after_batch | varchar2(20) |  |  | '~' |
| 16 | pk_jobmngfil_before_batch | pk_jobmngfil_before_batch | pk_jobmngfil_before_batch | varchar2(20) |  |  | '~' |
| 17 | pk_location_after_batch | pk_location_after_batch | pk_location_after_batch | varchar2(20) |  |  | '~' |
| 18 | pk_location_before_batch | pk_location_before_batch | pk_location_before_batch | varchar2(20) |  |  | '~' |
| 19 | pk_manager_after_batch | pk_manager_after_batch | pk_manager_after_batch | varchar2(20) |  |  | '~' |
| 20 | pk_manager_before_batch | pk_manager_before_batch | pk_manager_before_batch | varchar2(20) |  |  | '~' |
| 21 | pk_mandept_after_batch | pk_mandept_after_batch | pk_mandept_after_batch | varchar2(20) |  |  | '~' |
| 22 | pk_mandept_after_v_batch | pk_mandept_after_v_batch | pk_mandept_after_v_batch | varchar2(20) |  |  | '~' |
| 23 | pk_mandept_before_batch | pk_mandept_before_batch | pk_mandept_before_batch | varchar2(20) |  |  | '~' |
| 24 | pk_mandept_before_v_batch | pk_mandept_before_v_batch | pk_mandept_before_v_batch | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_reason | pk_reason | pk_reason | varchar2(20) |  |  | '~' |
| 28 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 29 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 30 | pk_usedept_after_batch | pk_usedept_after_batch | pk_usedept_after_batch | varchar2(20) |  |  | '~' |
| 31 | pk_usedept_after_v_batch | pk_usedept_after_v_batch | pk_usedept_after_v_batch | varchar2(20) |  |  | '~' |
| 32 | pk_usedept_before_batch | pk_usedept_before_batch | pk_usedept_before_batch | varchar2(20) |  |  | '~' |
| 33 | pk_usedept_before_v_batch | pk_usedept_before_v_batch | pk_usedept_before_v_batch | varchar2(20) |  |  | '~' |
| 34 | pk_usedunit_after_batch | pk_usedunit_after_batch | pk_usedunit_after_batch | varchar2(20) |  |  | '~' |
| 35 | pk_usedunit_after_v_batch | pk_usedunit_after_v_batch | pk_usedunit_after_v_batch | varchar2(20) |  |  | '~' |
| 36 | pk_usedunit_before_batch | pk_usedunit_before_batch | pk_usedunit_before_batch | varchar2(20) |  |  | '~' |
| 37 | pk_usedunit_before_v_batch | pk_usedunit_before_v_batch | pk_usedunit_before_v_batch | varchar2(20) |  |  | '~' |
| 38 | pk_user_after_batch | pk_user_after_batch | pk_user_after_batch | varchar2(20) |  |  | '~' |
| 39 | pk_user_before_batch | pk_user_before_batch | pk_user_before_batch | varchar2(20) |  |  | '~' |
| 40 | pre_text1 | pre_text1 | pre_text1 | varchar2(128) |
| 41 | pre_text2 | pre_text2 | pre_text2 | varchar2(128) |
| 42 | pre_text3 | pre_text3 | pre_text3 | varchar2(128) |
| 43 | pre_text4 | pre_text4 | pre_text4 | varchar2(128) |
| 44 | pre_text5 | pre_text5 | pre_text5 | varchar2(128) |
| 45 | pre_text6 | pre_text6 | pre_text6 | varchar2(128) |
| 46 | pre_text7 | pre_text7 | pre_text7 | varchar2(128) |
| 47 | pre_text8 | pre_text8 | pre_text8 | varchar2(128) |
| 48 | pre_text9 | pre_text9 | pre_text9 | varchar2(128) |
| 49 | pre_text10 | pre_text10 | pre_text10 | varchar2(128) |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |
| 54 | sum_accudep | sum_accudep | sum_accudep | number(28, 8) |
| 55 | sum_cards | sum_cards | sum_cards | number(38, 0) |
| 56 | sum_depamount | sum_depamount | sum_depamount | number(28, 8) |
| 57 | sum_devaluate | sum_devaluate | sum_devaluate | number(28, 8) |
| 58 | sum_localoriginvalue | sum_localoriginvalue | sum_localoriginvalue | number(28, 8) |
| 59 | sum_netrating | sum_netrating | sum_netrating | number(28, 8) |
| 60 | sum_netvalue | sum_netvalue | sum_netvalue | number(28, 8) |
| 61 | transi_type | transi_type | transi_type | varchar2(30) |
| 62 | def1 | def1 | def1 | varchar2(101) |
| 63 | def2 | def2 | def2 | varchar2(101) |
| 64 | def3 | def3 | def3 | varchar2(101) |
| 65 | def4 | def4 | def4 | varchar2(101) |
| 66 | def5 | def5 | def5 | varchar2(101) |
| 67 | def6 | def6 | def6 | varchar2(101) |
| 68 | def7 | def7 | def7 | varchar2(101) |
| 69 | def8 | def8 | def8 | varchar2(101) |
| 70 | def9 | def9 | def9 | varchar2(101) |
| 71 | def10 | def10 | def10 | varchar2(101) |
| 72 | def11 | def11 | def11 | varchar2(101) |
| 73 | def12 | def12 | def12 | varchar2(101) |
| 74 | def13 | def13 | def13 | varchar2(101) |
| 75 | def14 | def14 | def14 | varchar2(101) |
| 76 | def15 | def15 | def15 | varchar2(101) |
| 77 | def16 | def16 | def16 | varchar2(101) |
| 78 | def17 | def17 | def17 | varchar2(101) |
| 79 | def18 | def18 | def18 | varchar2(101) |
| 80 | def19 | def19 | def19 | varchar2(101) |
| 81 | def20 | def20 | def20 | varchar2(101) |
| 82 | creationtime | creationtime | creationtime | char(19) |
| 83 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 84 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 85 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 86 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 87 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |