# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_used_confirm | pk_used_confirm | pk_used_confirm | char(20) | √ |
| 2 | advance_payment | advance_payment | advance_payment | char(1) |
| 3 | asset_value_group | asset_value_group | asset_value_group | number(28, 8) |
| 4 | asset_value_org | asset_value_org | asset_value_org | number(28, 8) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 14 | end_date | end_date | end_date | char(19) |
| 15 | end_pay_date | end_pay_date | end_pay_date | char(19) |
| 16 | end_renewal_date | end_renewal_date | end_renewal_date | char(19) |
| 17 | equip_code | equip_code | equip_code | varchar2(40) |
| 18 | equip_name | equip_name | equip_name | varchar2(900) |
| 19 | equip_name2 | equip_name2 | equip_name2 | varchar2(900) |
| 20 | equip_name3 | equip_name3 | equip_name3 | varchar2(900) |
| 21 | equip_name4 | equip_name4 | equip_name4 | varchar2(900) |
| 22 | equip_name5 | equip_name5 | equip_name5 | varchar2(900) |
| 23 | equip_name6 | equip_name6 | equip_name6 | varchar2(900) |
| 24 | expect_restore_cost | expect_restore_cost | expect_restore_cost | number(28, 8) |
| 25 | incentive_amount | incentive_amount | incentive_amount | number(28, 8) |
| 26 | include_use | include_use | include_use | number(38, 0) |
| 27 | initial_cost | initial_cost | initial_cost | number(28, 8) |
| 28 | interest_type | interest_type | interest_type | number(38, 0) |
| 29 | isdeduct | isdeduct | isdeduct | char(1) |
| 30 | is_purchase_option | is_purchase_option | is_purchase_option | char(1) |
| 31 | is_renewal_option | is_renewal_option | is_renewal_option | char(1) |
| 32 | memo | memo | memo | varchar2(200) |
| 33 | model | model | model | varchar2(400) |
| 34 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 35 | paydate_type | paydate_type | paydate_type | number(38, 0) |
| 36 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 37 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 38 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 39 | pk_contract_eq | pk_contract_eq | pk_contract_eq | varchar2(50) | √ |
| 40 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 41 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 42 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 43 | pk_fa_category | pk_fa_category | pk_fa_category | varchar2(20) |  |  | '~' |
| 44 | pk_fiorg_in | pk_fiorg_in | pk_fiorg_in | varchar2(20) |  |  | '~' |
| 45 | pk_fiorg_in_v | pk_fiorg_in_v | pk_fiorg_in_v | varchar2(20) |  |  | '~' |
| 46 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 47 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 48 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 49 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 50 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 51 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 52 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 53 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 54 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 55 | pk_recorder_in | pk_recorder_in | pk_recorder_in | varchar2(20) |  |  | '~' |
| 56 | pk_redept_in | pk_redept_in | pk_redept_in | varchar2(20) |  |  | '~' |
| 57 | pk_redept_in_v | pk_redept_in_v | pk_redept_in_v | varchar2(20) |  |  | '~' |
| 58 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 59 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 60 | pk_yc_rate | pk_yc_rate | pk_yc_rate | varchar2(20) |  |  | '~' |
| 61 | pk_yc_rate_before | pk_yc_rate_before | pk_yc_rate_before | varchar2(20) |  |  | '~' |
| 62 | purchase_moneynotax | purchase_moneynotax | purchase_moneynotax | number(28, 8) |
| 63 | purchase_moneynotax_global | purchase_moneynotax_global | purchase_moneynotax_global | number(28, 8) |
| 64 | purchase_moneynotax_group | purchase_moneynotax_group | purchase_moneynotax_group | number(28, 8) |
| 65 | purchase_moneynotax_org | purchase_moneynotax_org | purchase_moneynotax_org | number(28, 8) |
| 66 | purchase_moneytax | purchase_moneytax | purchase_moneytax | number(28, 8) |
| 67 | purchase_moneytax_global | purchase_moneytax_global | purchase_moneytax_global | number(28, 8) |
| 68 | purchase_moneytax_group | purchase_moneytax_group | purchase_moneytax_group | number(28, 8) |
| 69 | purchase_moneytax_org | purchase_moneytax_org | purchase_moneytax_org | number(28, 8) |
| 70 | purchase_option | purchase_option | purchase_option | char(1) |
| 71 | purchase_tax | purchase_tax | purchase_tax | number(28, 8) |
| 72 | purchase_tax_global | purchase_tax_global | purchase_tax_global | number(28, 8) |
| 73 | purchase_tax_group | purchase_tax_group | purchase_tax_group | number(28, 8) |
| 74 | purchase_tax_org | purchase_tax_org | purchase_tax_org | number(28, 8) |
| 75 | record_date | record_date | record_date | char(19) |
| 76 | renewal_duration | renewal_duration | renewal_duration | number(38, 0) |
| 77 | renewal_option | renewal_option | renewal_option | char(1) |
| 78 | renewal_unit | renewal_unit | renewal_unit | varchar2(50) |
| 79 | renttype_enum | renttype_enum | renttype_enum | number(38, 0) |
| 80 | rent_calmode | rent_calmode | rent_calmode | number(38, 0) |
| 81 | rent_type | rent_type | rent_type | varchar2(500) |
| 82 | return_date | return_date | return_date | char(19) |
| 83 | spec | spec | spec | varchar2(400) |
| 84 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 85 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 86 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 87 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 88 | src_pk_bill_eq | src_pk_bill_eq | src_pk_bill_eq | varchar2(20) |
| 89 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 90 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 91 | start_date | start_date | start_date | char(19) |
| 92 | start_pay_date | start_pay_date | start_pay_date | char(19) |
| 93 | tax_category | tax_category | tax_category | varchar2(20) |  |  | '~' |
| 94 | tax_rate | tax_rate | tax_rate | number(28, 8) |
| 95 | trace_adjust | trace_adjust | trace_adjust | number(38, 0) |
| 96 | transi_type | transi_type | transi_type | varchar2(30) |
| 97 | used_percent | used_percent | used_percent | number(28, 8) |
| 98 | yearcount_rate | yearcount_rate | yearcount_rate | number(28, 8) |
| 99 | yearcount_rate_before | yearcount_rate_before | yearcount_rate_before | number(28, 8) |
| 100 | def1 | def1 | def1 | varchar2(101) |
| 101 | def2 | def2 | def2 | varchar2(101) |
| 102 | def3 | def3 | def3 | varchar2(101) |
| 103 | def4 | def4 | def4 | varchar2(101) |
| 104 | def5 | def5 | def5 | varchar2(101) |
| 105 | def6 | def6 | def6 | varchar2(101) |
| 106 | def7 | def7 | def7 | varchar2(101) |
| 107 | def8 | def8 | def8 | varchar2(101) |
| 108 | def9 | def9 | def9 | varchar2(101) |
| 109 | def10 | def10 | def10 | varchar2(101) |
| 110 | def11 | def11 | def11 | varchar2(101) |
| 111 | def12 | def12 | def12 | varchar2(101) |
| 112 | def13 | def13 | def13 | varchar2(101) |
| 113 | def14 | def14 | def14 | varchar2(101) |
| 114 | def15 | def15 | def15 | varchar2(101) |
| 115 | def16 | def16 | def16 | varchar2(101) |
| 116 | def17 | def17 | def17 | varchar2(101) |
| 117 | def18 | def18 | def18 | varchar2(101) |
| 118 | def19 | def19 | def19 | varchar2(101) |
| 119 | def20 | def20 | def20 | varchar2(101) |
| 120 | creationtime | creationtime | creationtime | char(19) |
| 121 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 122 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 123 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 124 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 125 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |