# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 2 | affirm_date | affirm_date | affirm_date | char(19) |
| 3 | affirm_flag | affirm_flag | affirm_flag | char(1) |
| 4 | affirm_opinion | affirm_opinion | affirm_opinion | varchar2(200) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | varchar2(50) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 14 | contract_name | contract_name | contract_name | varchar2(120) |
| 15 | contract_name2 | contract_name2 | contract_name2 | varchar2(120) |
| 16 | contract_name3 | contract_name3 | contract_name3 | varchar2(120) |
| 17 | contract_name4 | contract_name4 | contract_name4 | varchar2(120) |
| 18 | contract_name5 | contract_name5 | contract_name5 | varchar2(120) |
| 19 | contract_name6 | contract_name6 | contract_name6 | varchar2(120) |
| 20 | contract_no | contract_no | contract_no | varchar2(50) |
| 21 | contract_period | contract_period | contract_period | number(38, 0) |
| 22 | con_version | con_version | con_version | varchar2(50) |
| 23 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 24 | deposit | deposit | deposit | number(28, 8) |
| 25 | deposit_global | deposit_global | deposit_global | number(28, 8) |
| 26 | deposit_group | deposit_group | deposit_group | number(28, 8) |
| 27 | deposit_org | deposit_org | deposit_org | number(28, 8) |
| 28 | earnest | earnest | earnest | number(28, 8) |
| 29 | earnest_global | earnest_global | earnest_global | number(28, 8) |
| 30 | earnest_group | earnest_group | earnest_group | number(28, 8) |
| 31 | earnest_org | earnest_org | earnest_org | number(28, 8) |
| 32 | effect_date | effect_date | effect_date | char(19) |
| 33 | fact_effect_date | fact_effect_date | fact_effect_date | char(19) |
| 34 | fact_terminate_date | fact_terminate_date | fact_terminate_date | char(19) |
| 35 | foregift | foregift | foregift | number(28, 8) |
| 36 | foregift_global | foregift_global | foregift_global | number(28, 8) |
| 37 | foregift_group | foregift_group | foregift_group | number(28, 8) |
| 38 | foregift_org | foregift_org | foregift_org | number(28, 8) |
| 39 | fullperiod_flag | fullperiod_flag | fullperiod_flag | char(1) |
| 40 | gather_expense | gather_expense | gather_expense | number(28, 8) |
| 41 | gather_expense_global | gather_expense_global | gather_expense_global | number(28, 8) |
| 42 | gather_expense_group | gather_expense_group | gather_expense_group | number(28, 8) |
| 43 | gather_expense_org | gather_expense_org | gather_expense_org | number(28, 8) |
| 44 | gather_money | gather_money | gather_money | number(28, 8) |
| 45 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 46 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 47 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 48 | gather_rent | gather_rent | gather_rent | number(28, 8) |
| 49 | gather_rent_global | gather_rent_global | gather_rent_global | number(28, 8) |
| 50 | gather_rent_group | gather_rent_group | gather_rent_group | number(28, 8) |
| 51 | gather_rent_org | gather_rent_org | gather_rent_org | number(28, 8) |
| 52 | is_pre | is_pre | is_pre | char(1) |
| 53 | lease_type | lease_type | lease_type | number(38, 0) |
| 54 | memo | memo | memo | varchar2(200) |
| 55 | new_flag | new_flag | new_flag | char(1) |
| 56 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 57 | pk_affirmant | pk_affirmant | pk_affirmant | varchar2(20) |  |  | '~' |
| 58 | pk_contract_oid | pk_contract_oid | pk_contract_oid | varchar2(20) |  |  | '~' |
| 59 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 60 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 61 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 62 | pk_fiorg_in | pk_fiorg_in | pk_fiorg_in | varchar2(20) |  |  | '~' |
| 63 | pk_fiorg_in_v | pk_fiorg_in_v | pk_fiorg_in_v | varchar2(20) |  |  | '~' |
| 64 | pk_fiorg_out | pk_fiorg_out | pk_fiorg_out | varchar2(20) |  |  | '~' |
| 65 | pk_fiorg_out_v | pk_fiorg_out_v | pk_fiorg_out_v | varchar2(20) |  |  | '~' |
| 66 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 67 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 68 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 69 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 70 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 71 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 72 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 73 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 74 | pk_payment | pk_payment | pk_payment | varchar2(20) |  |  | '~' |
| 75 | pk_raorg_in | pk_raorg_in | pk_raorg_in | varchar2(20) |  |  | '~' |
| 76 | pk_raorg_in_v | pk_raorg_in_v | pk_raorg_in_v | varchar2(20) |  |  | '~' |
| 77 | pk_raorg_out | pk_raorg_out | pk_raorg_out | varchar2(20) |  |  | '~' |
| 78 | pk_raorg_out_v | pk_raorg_out_v | pk_raorg_out_v | varchar2(20) |  |  | '~' |
| 79 | pk_recorder_out | pk_recorder_out | pk_recorder_out | varchar2(20) |  |  | '~' |
| 80 | pk_redept_out | pk_redept_out | pk_redept_out | varchar2(20) |  |  | '~' |
| 81 | pk_redept_out_v | pk_redept_out_v | pk_redept_out_v | varchar2(20) |  |  | '~' |
| 82 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 83 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 84 | prereceive | prereceive | prereceive | number(28, 8) |
| 85 | prereceive_global | prereceive_global | prereceive_global | number(28, 8) |
| 86 | prereceive_group | prereceive_group | prereceive_group | number(28, 8) |
| 87 | prereceive_org | prereceive_org | prereceive_org | number(28, 8) |
| 88 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 89 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 90 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 91 | saga_status | saga_status | saga_status | number(38, 0) |
| 92 | settle_money | settle_money | settle_money | number(28, 8) |
| 93 | settle_money_global | settle_money_global | settle_money_global | number(28, 8) |
| 94 | settle_money_group | settle_money_group | settle_money_group | number(28, 8) |
| 95 | settle_money_org | settle_money_org | settle_money_org | number(28, 8) |
| 96 | sign_date | sign_date | sign_date | char(19) |
| 97 | terminate_date | terminate_date | terminate_date | char(19) |
| 98 | transi_type | transi_type | transi_type | varchar2(30) |
| 99 | vers_begin_date | vers_begin_date | vers_begin_date | char(19) |
| 100 | vers_end_date | vers_end_date | vers_end_date | char(19) |
| 101 | def1 | def1 | def1 | varchar2(101) |
| 102 | def2 | def2 | def2 | varchar2(101) |
| 103 | def3 | def3 | def3 | varchar2(101) |
| 104 | def4 | def4 | def4 | varchar2(101) |
| 105 | def5 | def5 | def5 | varchar2(101) |
| 106 | def6 | def6 | def6 | varchar2(101) |
| 107 | def7 | def7 | def7 | varchar2(101) |
| 108 | def8 | def8 | def8 | varchar2(101) |
| 109 | def9 | def9 | def9 | varchar2(101) |
| 110 | def10 | def10 | def10 | varchar2(101) |
| 111 | def11 | def11 | def11 | varchar2(101) |
| 112 | def12 | def12 | def12 | varchar2(101) |
| 113 | def13 | def13 | def13 | varchar2(101) |
| 114 | def14 | def14 | def14 | varchar2(101) |
| 115 | def15 | def15 | def15 | varchar2(101) |
| 116 | def16 | def16 | def16 | varchar2(101) |
| 117 | def17 | def17 | def17 | varchar2(101) |
| 118 | def18 | def18 | def18 | varchar2(101) |
| 119 | def19 | def19 | def19 | varchar2(101) |
| 120 | def20 | def20 | def20 | varchar2(101) |
| 121 | creationtime | creationtime | creationtime | char(19) |
| 122 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 123 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 124 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 125 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 126 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |