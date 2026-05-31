# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6508.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_d | pk_contract_d | pk_contract_d | char(20) | √ |
| 2 | calculate_date | calculate_date | calculate_date | char(19) |
| 3 | effect_date | effect_date | effect_date | char(19) |
| 4 | end_pay_date | end_pay_date | end_pay_date | char(19) |
| 5 | lease_out_no | lease_out_no | lease_out_no | varchar2(40) |
| 6 | offhire_price | offhire_price | offhire_price | number(28, 8) |
| 7 | pk_cal_means | pk_cal_means | pk_cal_means | varchar2(20) |  |  | '~' |
| 8 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 9 | pk_contract_b_oid | pk_contract_b_oid | pk_contract_b_oid | varchar2(20) |
| 10 | pk_contract_oid | pk_contract_oid | pk_contract_oid | varchar2(20) |
| 11 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 14 | pk_lease | pk_lease | pk_lease | varchar2(20) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pre_rent | pre_rent | pre_rent | number(28, 8) |
| 18 | renttype_enum | renttype_enum | renttype_enum | number(38, 0) |
| 19 | rent_calmode | rent_calmode | rent_calmode | number(38, 0) |
| 20 | rent_day | rent_day | rent_day | number(28, 8) |
| 21 | rent_type | rent_type | rent_type | varchar2(500) |
| 22 | return_date | return_date | return_date | char(19) |
| 23 | rowno | rowno | rowno | varchar2(30) |
| 24 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |
| 25 | start_date | start_date | start_date | char(19) |
| 26 | start_pay_date | start_pay_date | start_pay_date | char(19) |
| 27 | workload_unit | workload_unit | workload_unit | varchar2(300) |
| 28 | workload_unit2 | workload_unit2 | workload_unit2 | varchar2(300) |
| 29 | workload_unit3 | workload_unit3 | workload_unit3 | varchar2(300) |
| 30 | workload_unit4 | workload_unit4 | workload_unit4 | varchar2(300) |
| 31 | workload_unit5 | workload_unit5 | workload_unit5 | varchar2(300) |
| 32 | workload_unit6 | workload_unit6 | workload_unit6 | varchar2(300) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |