# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workload_b | pk_workload_b | pk_workload_b | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) |
| 3 | calculate_date | calculate_date | calculate_date | char(19) |
| 4 | calculate_flag | calculate_flag | calculate_flag | char(1) |
| 5 | coop_bill_code | coop_bill_code | coop_bill_code | varchar2(40) |
| 6 | coop_bill_type | coop_bill_type | coop_bill_type | varchar2(20) |
| 7 | coop_pk_bill_b | coop_pk_bill_b | coop_pk_bill_b | varchar2(20) |
| 8 | coop_transi_type | coop_transi_type | coop_transi_type | varchar2(30) |
| 9 | equip_code | equip_code | equip_code | varchar2(40) |
| 10 | equip_model | equip_model | equip_model | varchar2(400) |
| 11 | equip_name | equip_name | equip_name | varchar2(900) |
| 12 | equip_name2 | equip_name2 | equip_name2 | varchar2(900) |
| 13 | equip_name3 | equip_name3 | equip_name3 | varchar2(900) |
| 14 | equip_name4 | equip_name4 | equip_name4 | varchar2(900) |
| 15 | equip_name5 | equip_name5 | equip_name5 | varchar2(900) |
| 16 | equip_name6 | equip_name6 | equip_name6 | varchar2(900) |
| 17 | equip_spec | equip_spec | equip_spec | varchar2(400) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 20 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 23 | pk_lease_in | pk_lease_in | pk_lease_in | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_workload | pk_workload | pk_workload | char(20) | √ |
| 27 | rowno | rowno | rowno | varchar2(30) |
| 28 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 29 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |
| 30 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 31 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 32 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 33 | workdate | workdate | workdate | char(19) |
| 34 | workload | workload | workload | number(28, 8) |
| 35 | workload_unit | workload_unit | workload_unit | varchar2(75) |
| 36 | workload_unit2 | workload_unit2 | workload_unit2 | varchar2(75) |
| 37 | workload_unit3 | workload_unit3 | workload_unit3 | varchar2(75) |
| 38 | workload_unit4 | workload_unit4 | workload_unit4 | varchar2(75) |
| 39 | workload_unit5 | workload_unit5 | workload_unit5 | varchar2(75) |
| 40 | workload_unit6 | workload_unit6 | workload_unit6 | varchar2(75) |
| 41 | def1 | def1 | def1 | varchar2(101) |
| 42 | def2 | def2 | def2 | varchar2(101) |
| 43 | def3 | def3 | def3 | varchar2(101) |
| 44 | def4 | def4 | def4 | varchar2(101) |
| 45 | def5 | def5 | def5 | varchar2(101) |
| 46 | def6 | def6 | def6 | varchar2(101) |
| 47 | def7 | def7 | def7 | varchar2(101) |
| 48 | def8 | def8 | def8 | varchar2(101) |
| 49 | def9 | def9 | def9 | varchar2(101) |
| 50 | def10 | def10 | def10 | varchar2(101) |
| 51 | def11 | def11 | def11 | varchar2(101) |
| 52 | def12 | def12 | def12 | varchar2(101) |
| 53 | def13 | def13 | def13 | varchar2(101) |
| 54 | def14 | def14 | def14 | varchar2(101) |
| 55 | def15 | def15 | def15 | varchar2(101) |
| 56 | def16 | def16 | def16 | varchar2(101) |
| 57 | def17 | def17 | def17 | varchar2(101) |
| 58 | def18 | def18 | def18 | varchar2(101) |
| 59 | def19 | def19 | def19 | varchar2(101) |
| 60 | def20 | def20 | def20 | varchar2(101) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |