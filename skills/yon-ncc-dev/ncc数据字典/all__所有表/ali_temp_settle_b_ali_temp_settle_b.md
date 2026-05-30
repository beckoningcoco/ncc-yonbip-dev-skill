# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_b | pk_settle_b | pk_settle_b | char(20) | √ |
| 2 | amount | amount | amount | number(38, 0) |
| 3 | curr_money | curr_money | curr_money | number(28, 8) |
| 4 | curr_money_global | curr_money_global | curr_money_global | number(28, 8) |
| 5 | curr_money_group | curr_money_group | curr_money_group | number(28, 8) |
| 6 | curr_money_org | curr_money_org | curr_money_org | number(28, 8) |
| 7 | curr_origin_price | curr_origin_price | curr_origin_price | number(28, 8) |
| 8 | equip_code | equip_code | equip_code | varchar2(40) |
| 9 | equip_name | equip_name | equip_name | varchar2(400) |
| 10 | gather_money | gather_money | gather_money | number(28, 8) |
| 11 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 12 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 13 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 14 | lease_end_date | lease_end_date | lease_end_date | char(19) |
| 15 | lease_sta_date | lease_sta_date | lease_sta_date | char(19) |
| 16 | memo | memo | memo | varchar2(200) |
| 17 | model | model | model | varchar2(400) |
| 18 | payable_flag | payable_flag | payable_flag | char(1) |
| 19 | pk_freecustom | pk_freecustom | pk_freecustom | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_settle | pk_settle | pk_settle | char(20) | √ |
| 25 | rowno | rowno | rowno | varchar2(30) |
| 26 | spec | spec | spec | varchar2(400) |
| 27 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 28 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 29 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 30 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 31 | src_trans_type | src_trans_type | src_trans_type | varchar2(30) |
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