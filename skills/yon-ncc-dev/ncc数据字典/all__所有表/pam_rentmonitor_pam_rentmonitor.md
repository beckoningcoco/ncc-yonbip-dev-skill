# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce_b | pk_reduce_b | pk_reduce_b | char(20) | √ |
| 2 | accu_dep | accu_dep | accu_dep | number(28, 8) |
| 3 | begin_date | begin_date | begin_date | char(19) |
| 4 | bill_code_src | bill_code_src | bill_code_src | varchar2(20) |
| 5 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 6 | close_flag | close_flag | close_flag | char(1) |
| 7 | confirm_flag | confirm_flag | confirm_flag | char(1) |
| 8 | memo | memo | memo | varchar2(200) |
| 9 | net_money | net_money | net_money | number(28, 8) |
| 10 | new_value | new_value | new_value | number(28, 8) |
| 11 | origin_value | origin_value | origin_value | number(28, 8) |
| 12 | payable_flag | payable_flag | payable_flag | char(1) |
| 13 | pk_addreducestyle | pk_addreducestyle | pk_addreducestyle | varchar2(20) |  |  | '~' |
| 14 | pk_bill_b_src | pk_bill_b_src | pk_bill_b_src | varchar2(20) |
| 15 | pk_bill_src | pk_bill_src | pk_bill_src | varchar2(20) |
| 16 | pk_confirmer | pk_confirmer | pk_confirmer | varchar2(20) |  |  | '~' |
| 17 | pk_currency_fi | pk_currency_fi | pk_currency_fi | varchar2(20) |  |  | '~' |
| 18 | pk_equip | pk_equip | pk_equip | varchar2(20) | √ |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_icorg | pk_icorg | pk_icorg | varchar2(20) |  |  | '~' |
| 21 | pk_icorg_v | pk_icorg_v | pk_icorg_v | varchar2(20) |  |  | '~' |
| 22 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 23 | pk_location_after | pk_location_after | pk_location_after | varchar2(20) |  |  | '~' |
| 24 | pk_location_before | pk_location_before | pk_location_before | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_reason | pk_reason | pk_reason | varchar2(20) |  |  | '~' |
| 28 | pk_reduce | pk_reduce | pk_reduce | char(20) | √ |
| 29 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 30 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 31 | pk_transitype_src | pk_transitype_src | pk_transitype_src | varchar2(20) |
| 32 | pk_warehouse_in | pk_warehouse_in | pk_warehouse_in | varchar2(20) |  |  | '~' |
| 33 | pk_warehouse_out | pk_warehouse_out | pk_warehouse_out | varchar2(20) |  |  | '~' |
| 34 | pre_devaluate | pre_devaluate | pre_devaluate | number(28, 8) |
| 35 | pre_text1 | pre_text1 | pre_text1 | varchar2(128) |
| 36 | pre_text2 | pre_text2 | pre_text2 | varchar2(128) |
| 37 | pre_text3 | pre_text3 | pre_text3 | varchar2(128) |
| 38 | pre_text4 | pre_text4 | pre_text4 | varchar2(128) |
| 39 | pre_text5 | pre_text5 | pre_text5 | varchar2(128) |
| 40 | pre_text6 | pre_text6 | pre_text6 | varchar2(128) |
| 41 | pre_text7 | pre_text7 | pre_text7 | varchar2(128) |
| 42 | pre_text8 | pre_text8 | pre_text8 | varchar2(128) |
| 43 | pre_text9 | pre_text9 | pre_text9 | varchar2(128) |
| 44 | pre_text10 | pre_text10 | pre_text10 | varchar2(128) |
| 45 | purgefee | purgefee | purgefee | number(28, 4) |
| 46 | purgefee_global | purgefee_global | purgefee_global | number(28, 4) |
| 47 | purgefee_group | purgefee_group | purgefee_group | number(28, 4) |
| 48 | purgerevenue | purgerevenue | purgerevenue | number(28, 4) |
| 49 | purgerevenue_global | purgerevenue_global | purgerevenue_global | number(28, 4) |
| 50 | purgerevenue_group | purgerevenue_group | purgerevenue_group | number(28, 4) |
| 51 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 52 | rowno | rowno | rowno | varchar2(30) |
| 53 | salvage | salvage | salvage | number(28, 8) |
| 54 | salvage_rate | salvage_rate | salvage_rate | number(28, 8) |
| 55 | service_month | service_month | service_month | number(38, 0) |
| 56 | status_date_after | status_date_after | status_date_after | char(19) |
| 57 | status_date_before | status_date_before | status_date_before | char(19) |
| 58 | stock_in_flag | stock_in_flag | stock_in_flag | char(1) |
| 59 | stock_out_flag | stock_out_flag | stock_out_flag | char(1) |
| 60 | transi_type_src | transi_type_src | transi_type_src | varchar2(20) |
| 61 | unused_reason | unused_reason | unused_reason | varchar2(200) |
| 62 | used_month | used_month | used_month | number(38, 0) |
| 63 | def1 | def1 | def1 | varchar2(101) |
| 64 | def2 | def2 | def2 | varchar2(101) |
| 65 | def3 | def3 | def3 | varchar2(101) |
| 66 | def4 | def4 | def4 | varchar2(101) |
| 67 | def5 | def5 | def5 | varchar2(101) |
| 68 | def6 | def6 | def6 | varchar2(101) |
| 69 | def7 | def7 | def7 | varchar2(101) |
| 70 | def8 | def8 | def8 | varchar2(101) |
| 71 | def9 | def9 | def9 | varchar2(101) |
| 72 | def10 | def10 | def10 | varchar2(101) |
| 73 | def11 | def11 | def11 | varchar2(101) |
| 74 | def12 | def12 | def12 | varchar2(101) |
| 75 | def13 | def13 | def13 | varchar2(101) |
| 76 | def14 | def14 | def14 | varchar2(101) |
| 77 | def15 | def15 | def15 | varchar2(101) |
| 78 | def16 | def16 | def16 | varchar2(101) |
| 79 | def17 | def17 | def17 | varchar2(101) |
| 80 | def18 | def18 | def18 | varchar2(101) |
| 81 | def19 | def19 | def19 | varchar2(101) |
| 82 | def20 | def20 | def20 | varchar2(101) |
| 83 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 84 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |