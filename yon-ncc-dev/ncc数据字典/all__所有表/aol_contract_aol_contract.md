# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6533.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | varchar2(50) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | contract_name | contract_name | contract_name | varchar2(120) |
| 12 | contract_name2 | contract_name2 | contract_name2 | varchar2(120) |
| 13 | contract_name3 | contract_name3 | contract_name3 | varchar2(120) |
| 14 | contract_name4 | contract_name4 | contract_name4 | varchar2(120) |
| 15 | contract_name5 | contract_name5 | contract_name5 | varchar2(120) |
| 16 | contract_name6 | contract_name6 | contract_name6 | varchar2(120) |
| 17 | contract_no | contract_no | contract_no | varchar2(50) |
| 18 | con_version | con_version | con_version | varchar2(50) |
| 19 | deposit | deposit | deposit | number(28, 8) |
| 20 | deposit_global | deposit_global | deposit_global | number(28, 8) |
| 21 | deposit_group | deposit_group | deposit_group | number(28, 8) |
| 22 | deposit_org | deposit_org | deposit_org | number(28, 8) |
| 23 | earnest | earnest | earnest | number(28, 8) |
| 24 | earnest_global | earnest_global | earnest_global | number(28, 8) |
| 25 | earnest_group | earnest_group | earnest_group | number(28, 8) |
| 26 | earnest_org | earnest_org | earnest_org | number(28, 8) |
| 27 | effect_date | effect_date | effect_date | char(19) |
| 28 | foregift | foregift | foregift | number(28, 8) |
| 29 | foregift_global | foregift_global | foregift_global | number(28, 8) |
| 30 | foregift_group | foregift_group | foregift_group | number(28, 8) |
| 31 | foregift_org | foregift_org | foregift_org | number(28, 8) |
| 32 | gather_money | gather_money | gather_money | number(28, 8) |
| 33 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 34 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 35 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 36 | gather_rent | gather_rent | gather_rent | number(28, 8) |
| 37 | gather_rent_global | gather_rent_global | gather_rent_global | number(28, 8) |
| 38 | gather_rent_group | gather_rent_group | gather_rent_group | number(28, 8) |
| 39 | gather_rent_org | gather_rent_org | gather_rent_org | number(28, 8) |
| 40 | is_pre | is_pre | is_pre | char(1) |
| 41 | memo | memo | memo | varchar2(200) |
| 42 | new_flag | new_flag | new_flag | char(1) |
| 43 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 44 | pk_contract_oid | pk_contract_oid | pk_contract_oid | varchar2(20) |
| 45 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 46 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 47 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 48 | pk_fiorg_in | pk_fiorg_in | pk_fiorg_in | varchar2(20) |  |  | '~' |
| 49 | pk_fiorg_in_v | pk_fiorg_in_v | pk_fiorg_in_v | varchar2(20) |  |  | '~' |
| 50 | pk_fiorg_out | pk_fiorg_out | pk_fiorg_out | varchar2(20) |  |  | '~' |
| 51 | pk_fiorg_out_v | pk_fiorg_out_v | pk_fiorg_out_v | varchar2(20) |  |  | '~' |
| 52 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 53 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 54 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 55 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 56 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 57 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 58 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 59 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 60 | pk_payment | pk_payment | pk_payment | varchar2(20) |  |  | '~' |
| 61 | pk_raorg_in | pk_raorg_in | pk_raorg_in | varchar2(20) |  |  | '~' |
| 62 | pk_raorg_in_v | pk_raorg_in_v | pk_raorg_in_v | varchar2(20) |  |  | '~' |
| 63 | pk_raorg_out | pk_raorg_out | pk_raorg_out | varchar2(20) |  |  | '~' |
| 64 | pk_raorg_out_v | pk_raorg_out_v | pk_raorg_out_v | varchar2(20) |  |  | '~' |
| 65 | pk_recorder_out | pk_recorder_out | pk_recorder_out | varchar2(20) |  |  | '~' |
| 66 | pk_redept_out | pk_redept_out | pk_redept_out | varchar2(20) |  |  | '~' |
| 67 | pk_redept_out_v | pk_redept_out_v | pk_redept_out_v | varchar2(20) |  |  | '~' |
| 68 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 69 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 70 | renew | renew | renew | char(1) |
| 71 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 72 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 73 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 74 | saga_status | saga_status | saga_status | number(38, 0) |
| 75 | settle_money | settle_money | settle_money | number(28, 8) |
| 76 | settle_money_global | settle_money_global | settle_money_global | number(28, 8) |
| 77 | settle_money_group | settle_money_group | settle_money_group | number(28, 8) |
| 78 | settle_money_org | settle_money_org | settle_money_org | number(28, 8) |
| 79 | sign_date | sign_date | sign_date | char(19) |
| 80 | terminate_date | terminate_date | terminate_date | char(19) |
| 81 | transi_type | transi_type | transi_type | varchar2(30) |
| 82 | vers_begin_date | vers_begin_date | vers_begin_date | char(19) |
| 83 | vers_end_date | vers_end_date | vers_end_date | char(19) |
| 84 | def1 | def1 | def1 | varchar2(101) |
| 85 | def2 | def2 | def2 | varchar2(101) |
| 86 | def3 | def3 | def3 | varchar2(101) |
| 87 | def4 | def4 | def4 | varchar2(101) |
| 88 | def5 | def5 | def5 | varchar2(101) |
| 89 | def6 | def6 | def6 | varchar2(101) |
| 90 | def7 | def7 | def7 | varchar2(101) |
| 91 | def8 | def8 | def8 | varchar2(101) |
| 92 | def9 | def9 | def9 | varchar2(101) |
| 93 | def10 | def10 | def10 | varchar2(101) |
| 94 | def11 | def11 | def11 | varchar2(101) |
| 95 | def12 | def12 | def12 | varchar2(101) |
| 96 | def13 | def13 | def13 | varchar2(101) |
| 97 | def14 | def14 | def14 | varchar2(101) |
| 98 | def15 | def15 | def15 | varchar2(101) |
| 99 | def16 | def16 | def16 | varchar2(101) |
| 100 | def17 | def17 | def17 | varchar2(101) |
| 101 | def18 | def18 | def18 | varchar2(101) |
| 102 | def19 | def19 | def19 | varchar2(101) |
| 103 | def20 | def20 | def20 | varchar2(101) |
| 104 | creationtime | creationtime | creationtime | char(19) |
| 105 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 106 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 107 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 108 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 109 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |