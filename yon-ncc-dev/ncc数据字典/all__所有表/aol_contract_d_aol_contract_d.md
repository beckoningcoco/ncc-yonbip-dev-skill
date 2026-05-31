# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_d | pk_contract_d | pk_contract_d | char(20) | √ |
| 2 | adjustment_rent | adjustment_rent | adjustment_rent | number(28, 8) |
| 3 | adjustment_rent_global | adjustment_rent_global | adjustment_rent_global | number(28, 8) |
| 4 | adjustment_rent_group | adjustment_rent_group | adjustment_rent_group | number(28, 8) |
| 5 | adjustment_rent_org | adjustment_rent_org | adjustment_rent_org | number(28, 8) |
| 6 | ar_src_pk_bill | ar_src_pk_bill | ar_src_pk_bill | varchar2(20) |
| 7 | calculate_rent | calculate_rent | calculate_rent | number(28, 8) |
| 8 | end_date | end_date | end_date | char(19) |
| 9 | gather_money | gather_money | gather_money | number(28, 8) |
| 10 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 11 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 12 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 13 | incomplete_period_day | incomplete_period_day | incomplete_period_day | number(38, 0) |
| 14 | is_pre | is_pre | is_pre | char(1) |
| 15 | memo | memo | memo | varchar2(400) |
| 16 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 17 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 18 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_lease_target | pk_lease_target | pk_lease_target | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pre_rent | pre_rent | pre_rent | number(28, 8) |
| 24 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 25 | renttype_enum | renttype_enum | renttype_enum | number(38, 0) |
| 26 | rent_calmode | rent_calmode | rent_calmode | number(38, 0) |
| 27 | rent_day | rent_day | rent_day | number(28, 8) |
| 28 | rent_type | rent_type | rent_type | varchar2(500) |
| 29 | rowno | rowno | rowno | varchar2(50) |
| 30 | start_date | start_date | start_date | char(19) |
| 31 | use_tech | use_tech | use_tech | varchar2(400) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |