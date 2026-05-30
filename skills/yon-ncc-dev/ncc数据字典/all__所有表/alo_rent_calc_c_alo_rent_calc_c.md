# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc_c | pk_rent_calc_c | pk_rent_calc_c | char(20) | √ |
| 2 | adjust_rent | adjust_rent | adjust_rent | number(28, 8) |
| 3 | calculate_rent | calculate_rent | calculate_rent | number(28, 8) |
| 4 | calc_date_old | calc_date_old | calc_date_old | char(19) |
| 5 | cal_end_date | cal_end_date | cal_end_date | char(19) |
| 6 | cal_start_date | cal_start_date | cal_start_date | char(19) |
| 7 | days | days | days | number(38, 0) |
| 8 | lease_bill_code | lease_bill_code | lease_bill_code | varchar2(40) |
| 9 | memo | memo | memo | varchar2(200) |
| 10 | offhire_price | offhire_price | offhire_price | number(28, 8) |
| 11 | periods | periods | periods | number(38, 0) |
| 12 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 13 | pk_contract_oid | pk_contract_oid | pk_contract_oid | varchar2(20) |  |  | '~' |
| 14 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 15 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 18 | pk_lease | pk_lease | pk_lease | varchar2(20) |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_rent_calc | pk_rent_calc | pk_rent_calc | char(20) | √ |
| 22 | pre_rent | pre_rent | pre_rent | number(28, 8) |
| 23 | rent_calmode | rent_calmode | rent_calmode | number(38, 0) |
| 24 | rent_day | rent_day | rent_day | number(28, 8) |
| 25 | rent_type | rent_type | rent_type | varchar2(500) |
| 26 | rowno | rowno | rowno | varchar2(50) |
| 27 | sub_rent_type | sub_rent_type | sub_rent_type | varchar2(50) |
| 28 | transi_type | transi_type | transi_type | varchar2(30) |
| 29 | workloadnum | workloadnum | workloadnum | number(28, 8) |
| 30 | workload_unit | workload_unit | workload_unit | varchar2(300) |
| 31 | workload_unit2 | workload_unit2 | workload_unit2 | varchar2(300) |
| 32 | workload_unit3 | workload_unit3 | workload_unit3 | varchar2(300) |
| 33 | workload_unit4 | workload_unit4 | workload_unit4 | varchar2(300) |
| 34 | workload_unit5 | workload_unit5 | workload_unit5 | varchar2(300) |
| 35 | workload_unit6 | workload_unit6 | workload_unit6 | varchar2(300) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |