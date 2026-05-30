# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expense_b | pk_expense_b | pk_expense_b | char(20) | √ |
| 2 | exp_cost_date | exp_cost_date | exp_cost_date | char(19) |
| 3 | exp_jobmngfil | exp_jobmngfil | exp_jobmngfil | varchar2(20) |  |  | '~' |
| 4 | exp_rent | exp_rent | exp_rent | number(28, 8) |
| 5 | exp_rent_global | exp_rent_global | exp_rent_global | number(28, 8) |
| 6 | exp_rent_group | exp_rent_group | exp_rent_group | number(28, 8) |
| 7 | exp_rent_org | exp_rent_org | exp_rent_org | number(28, 8) |
| 8 | gather_money | gather_money | gather_money | number(28, 8) |
| 9 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 10 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 11 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 14 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 15 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 16 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 17 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 18 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 19 | pk_expense | pk_expense | pk_expense | char(20) | √ |
| 20 | pk_freecustom | pk_freecustom | pk_freecustom | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 23 | pk_lease_target | pk_lease_target | pk_lease_target | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 26 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 29 | rowno | rowno | rowno | varchar2(50) |
| 30 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 31 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 32 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 33 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |  |  | '~' |
| 34 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |