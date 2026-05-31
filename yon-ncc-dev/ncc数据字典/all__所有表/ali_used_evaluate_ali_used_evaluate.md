# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate | pk_evaluate | pk_evaluate | char(20) | √ |  | '~' |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_date | bill_date | bill_date | char(19) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 12 | end_date | end_date | end_date | char(19) |
| 13 | equip_code | equip_code | equip_code | varchar2(40) |
| 14 | equip_name | equip_name | equip_name | varchar2(900) |
| 15 | equip_name2 | equip_name2 | equip_name2 | varchar2(900) |
| 16 | equip_name3 | equip_name3 | equip_name3 | varchar2(900) |
| 17 | equip_name4 | equip_name4 | equip_name4 | varchar2(900) |
| 18 | equip_name5 | equip_name5 | equip_name5 | varchar2(900) |
| 19 | equip_name6 | equip_name6 | equip_name6 | varchar2(900) |
| 20 | include_use | include_use | include_use | number(38, 0) |
| 21 | ispurchase_option | ispurchase_option | ispurchase_option | char(1) |
| 22 | is_purchase_option_before | is_purchase_option_before | is_purchase_option_before | char(1) |
| 23 | is_renewal_option | is_renewal_option | is_renewal_option | char(1) |
| 24 | is_renewal_option_before | is_renewal_option_before | is_renewal_option_before | char(1) |
| 25 | memo | memo | memo | varchar2(50) |
| 26 | model | model | model | varchar2(400) |
| 27 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 28 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 29 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 30 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 31 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 32 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 33 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 34 | pk_fiorg_in | pk_fiorg_in | pk_fiorg_in | varchar2(20) |  |  | '~' |
| 35 | pk_fiorg_in_v | pk_fiorg_in_v | pk_fiorg_in_v | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 38 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 41 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 42 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 43 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 45 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 46 | pk_record_dept | pk_record_dept | pk_record_dept | varchar2(20) |  |  | '~' |
| 47 | pk_record_dept_v | pk_record_dept_v | pk_record_dept_v | varchar2(20) |  |  | '~' |
| 48 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 49 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 50 | purchase_notax | purchase_notax | purchase_notax | number(28, 8) |
| 51 | purchase_notax_global | purchase_notax_global | purchase_notax_global | number(28, 8) |
| 52 | purchase_notax_group | purchase_notax_group | purchase_notax_group | number(28, 8) |
| 53 | purchase_notax_org | purchase_notax_org | purchase_notax_org | number(28, 8) |
| 54 | purchase_option | purchase_option | purchase_option | char(1) |
| 55 | purchase_tax | purchase_tax | purchase_tax | number(28, 8) |
| 56 | purchase_tax_global | purchase_tax_global | purchase_tax_global | number(28, 8) |
| 57 | purchase_tax_group | purchase_tax_group | purchase_tax_group | number(28, 8) |
| 58 | purchase_tax_org | purchase_tax_org | purchase_tax_org | number(28, 8) |
| 59 | renewal_company | renewal_company | renewal_company | number(38, 0) |
| 60 | renewal_duration | renewal_duration | renewal_duration | number(38, 0) |
| 61 | renewal_option | renewal_option | renewal_option | char(1) |
| 62 | renttype_enum | renttype_enum | renttype_enum | number(38, 0) |
| 63 | rent_calmode | rent_calmode | rent_calmode | number(38, 0) |
| 64 | rent_day | rent_day | rent_day | number(28, 8) |
| 65 | rent_daynotax | rent_daynotax | rent_daynotax | number(28, 8) |
| 66 | rent_daynotax_org | rent_daynotax_org | rent_daynotax_org | number(28, 8) |
| 67 | rent_day_org | rent_day_org | rent_day_org | number(28, 8) |
| 68 | rent_type | rent_type | rent_type | varchar2(500) |
| 69 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 70 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 71 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 72 | saga_status | saga_status | saga_status | number(38, 0) |
| 73 | spec | spec | spec | varchar2(400) |
| 74 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 75 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 76 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 77 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |  |  | '~' |
| 78 | src_pk_bill_b_oid | src_pk_bill_b_oid | src_pk_bill_b_oid | varchar2(20) |  |  | '~' |
| 79 | src_pk_bill_eq | src_pk_bill_eq | src_pk_bill_eq | varchar2(20) |
| 80 | src_pk_bill_eq_oid | src_pk_bill_eq_oid | src_pk_bill_eq_oid | varchar2(20) |
| 81 | src_pk_bill_oid | src_pk_bill_oid | src_pk_bill_oid | varchar2(20) |  |  | '~' |
| 82 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 83 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 84 | start_date | start_date | start_date | char(19) |
| 85 | start_pay_date | start_pay_date | start_pay_date | char(19) |
| 86 | tax_category | tax_category | tax_category | varchar2(20) |  |  | '~' |
| 87 | tax_rate | tax_rate | tax_rate | number(28, 8) |
| 88 | transi_type | transi_type | transi_type | varchar2(30) |
| 89 | def1 | def1 | def1 | varchar2(101) |
| 90 | def2 | def2 | def2 | varchar2(101) |
| 91 | def3 | def3 | def3 | varchar2(101) |
| 92 | def4 | def4 | def4 | varchar2(101) |
| 93 | def5 | def5 | def5 | varchar2(101) |
| 94 | def6 | def6 | def6 | varchar2(101) |
| 95 | def7 | def7 | def7 | varchar2(101) |
| 96 | def8 | def8 | def8 | varchar2(101) |
| 97 | def9 | def9 | def9 | varchar2(101) |
| 98 | def10 | def10 | def10 | varchar2(101) |
| 99 | def11 | def11 | def11 | varchar2(101) |
| 100 | def12 | def12 | def12 | varchar2(101) |
| 101 | def13 | def13 | def13 | varchar2(101) |
| 102 | def14 | def14 | def14 | varchar2(101) |
| 103 | def15 | def15 | def15 | varchar2(101) |
| 104 | def16 | def16 | def16 | varchar2(101) |
| 105 | def17 | def17 | def17 | varchar2(101) |
| 106 | def18 | def18 | def18 | varchar2(101) |
| 107 | def19 | def19 | def19 | varchar2(101) |
| 108 | def20 | def20 | def20 | varchar2(101) |
| 109 | creationtime | creationtime | creationtime | char(19) |
| 110 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 111 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 112 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 113 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 114 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |