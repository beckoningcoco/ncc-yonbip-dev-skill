# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6550.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_c | pk_rentsettle_c | pk_rentsettle_c | char(20) | √ |
| 2 | adjustment_rent | adjustment_rent | adjustment_rent | number(28, 8) |
| 3 | adjustment_rent_global | adjustment_rent_global | adjustment_rent_global | number(28, 8) |
| 4 | adjustment_rent_group | adjustment_rent_group | adjustment_rent_group | number(28, 8) |
| 5 | adjustment_rent_org | adjustment_rent_org | adjustment_rent_org | number(28, 8) |
| 6 | calculate_rent | calculate_rent | calculate_rent | number(28, 8) |
| 7 | end_date | end_date | end_date | char(19) |
| 8 | expense | expense | expense | number(28, 8) |
| 9 | expense_code | expense_code | expense_code | varchar2(20) |  |  | '~' |
| 10 | expense_global | expense_global | expense_global | number(28, 8) |
| 11 | expense_group | expense_group | expense_group | number(28, 8) |
| 12 | expense_org | expense_org | expense_org | number(28, 8) |
| 13 | gathermoney | gathermoney | gathermoney | varchar2(50) |
| 14 | gathermoney_global | gathermoney_global | gathermoney_global | number(28, 8) |
| 15 | gathermoney_group | gathermoney_group | gathermoney_group | number(28, 8) |
| 16 | gathermoney_org | gathermoney_org | gathermoney_org | number(28, 8) |
| 17 | incomplete_period_day | incomplete_period_day | incomplete_period_day | number(38, 0) |
| 18 | memo | memo | memo | varchar2(50) |
| 19 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 20 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 21 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 22 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_lease_target | pk_lease_target | pk_lease_target | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_rentsettle | pk_rentsettle | pk_rentsettle | char(20) | √ |
| 28 | pre_rent | pre_rent | pre_rent | number(28, 8) |
| 29 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 30 | rent_calmode | rent_calmode | rent_calmode | varchar2(20) |  |  | '~' |
| 31 | rent_day | rent_day | rent_day | number(28, 8) |
| 32 | rent_type | rent_type | rent_type | varchar2(500) |
| 33 | rowno | rowno | rowno | varchar2(30) |
| 34 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 35 | settlemoney_global | settlemoney_global | settlemoney_global | number(28, 8) |
| 36 | settlemoney_group | settlemoney_group | settlemoney_group | number(28, 8) |
| 37 | settlemoney_org | settlemoney_org | settlemoney_org | number(28, 8) |
| 38 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 39 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 40 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 41 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |  |  | '~' |
| 42 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 43 | start_date | start_date | start_date | char(19) |
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