# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6502.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exemption_b | pk_exemption_b | pk_exemption_b | char(20) | √ |
| 2 | asset_value_group | asset_value_group | asset_value_group | number(28, 8) |
| 3 | asset_value_group_before | asset_value_group_before | asset_value_group_before | number(28, 8) |
| 4 | asset_value_org | asset_value_org | asset_value_org | number(28, 8) |
| 5 | asset_value_org_before | asset_value_org_before | asset_value_org_before | number(28, 8) |
| 6 | end_date | end_date | end_date | char(19) |
| 7 | equip_code | equip_code | equip_code | varchar2(40) |
| 8 | equip_name | equip_name | equip_name | varchar2(900) |
| 9 | equip_name2 | equip_name2 | equip_name2 | varchar2(900) |
| 10 | equip_name3 | equip_name3 | equip_name3 | varchar2(900) |
| 11 | equip_name4 | equip_name4 | equip_name4 | varchar2(900) |
| 12 | equip_name5 | equip_name5 | equip_name5 | varchar2(900) |
| 13 | equip_name6 | equip_name6 | equip_name6 | varchar2(900) |
| 14 | exemption_flag | exemption_flag | exemption_flag | char(1) |
| 15 | include_use | include_use | include_use | number(38, 0) |
| 16 | memo | memo | memo | varchar2(50) |
| 17 | model | model | model | varchar2(400) |
| 18 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 19 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 20 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 21 | pk_exempter | pk_exempter | pk_exempter | varchar2(20) |  |  | '~' |
| 22 | pk_exemption | pk_exemption | pk_exemption | char(20) | √ |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_lease_in | pk_lease_in | pk_lease_in | varchar2(20) |
| 25 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 26 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | purchase_option | purchase_option | purchase_option | char(1) |
| 30 | rowno | rowno | rowno | varchar2(30) |
| 31 | spec | spec | spec | varchar2(400) |
| 32 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 33 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 34 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 35 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |  |  | '~' |
| 36 | src_pk_bill_b_oid | src_pk_bill_b_oid | src_pk_bill_b_oid | varchar2(20) |  |  | '~' |
| 37 | src_pk_bill_eq | src_pk_bill_eq | src_pk_bill_eq | varchar2(20) |
| 38 | src_pk_bill_eq_oid | src_pk_bill_eq_oid | src_pk_bill_eq_oid | varchar2(20) |
| 39 | src_pk_bill_oid | src_pk_bill_oid | src_pk_bill_oid | varchar2(20) |  |  | '~' |
| 40 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 41 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 42 | start_date | start_date | start_date | char(19) |
| 43 | start_pay_date | start_pay_date | start_pay_date | char(19) |
| 44 | def1 | def1 | def1 | varchar2(101) |
| 45 | def2 | def2 | def2 | varchar2(101) |
| 46 | def3 | def3 | def3 | varchar2(101) |
| 47 | def4 | def4 | def4 | varchar2(101) |
| 48 | def5 | def5 | def5 | varchar2(101) |
| 49 | def6 | def6 | def6 | varchar2(101) |
| 50 | def7 | def7 | def7 | varchar2(101) |
| 51 | def8 | def8 | def8 | varchar2(101) |
| 52 | def9 | def9 | def9 | varchar2(101) |
| 53 | def10 | def10 | def10 | varchar2(101) |
| 54 | def11 | def11 | def11 | varchar2(101) |
| 55 | def12 | def12 | def12 | varchar2(101) |
| 56 | def13 | def13 | def13 | varchar2(101) |
| 57 | def14 | def14 | def14 | varchar2(101) |
| 58 | def15 | def15 | def15 | varchar2(101) |
| 59 | def16 | def16 | def16 | varchar2(101) |
| 60 | def17 | def17 | def17 | varchar2(101) |
| 61 | def18 | def18 | def18 | varchar2(101) |
| 62 | def19 | def19 | def19 | varchar2(101) |
| 63 | def20 | def20 | def20 | varchar2(101) |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |