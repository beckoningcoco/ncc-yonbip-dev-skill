# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_b | pk_rentsettle_b | pk_rentsettle_b | char(20) | √ |
| 2 | calculate_date | calculate_date | calculate_date | char(19) |
| 3 | contract_no | contract_no | contract_no | varchar2(50) |
| 4 | expense | expense | expense | number(28, 8) |
| 5 | expense_global | expense_global | expense_global | number(28, 8) |
| 6 | expense_group | expense_group | expense_group | number(28, 8) |
| 7 | expense_org | expense_org | expense_org | number(28, 8) |
| 8 | gathermoney | gathermoney | gathermoney | number(28, 8) |
| 9 | gathermoney_global | gathermoney_global | gathermoney_global | number(28, 8) |
| 10 | gathermoney_group | gathermoney_group | gathermoney_group | number(28, 8) |
| 11 | gathermoney_org | gathermoney_org | gathermoney_org | number(28, 8) |
| 12 | memo | memo | memo | varchar2(50) |
| 13 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 14 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 15 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 16 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 19 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 20 | pk_materi_v | pk_materi_v | pk_materi_v | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_rentsettle | pk_rentsettle | pk_rentsettle | char(20) | √ |
| 24 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 25 | rentmoney | rentmoney | rentmoney | number(28, 8) |
| 26 | rentmoney_global | rentmoney_global | rentmoney_global | number(28, 8) |
| 27 | rentmoney_group | rentmoney_group | rentmoney_group | number(28, 8) |
| 28 | rentmoney_org | rentmoney_org | rentmoney_org | number(28, 8) |
| 29 | rowno | rowno | rowno | varchar2(30) |
| 30 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 31 | settlemoney_global | settlemoney_global | settlemoney_global | number(28, 8) |
| 32 | settlemoney_group | settlemoney_group | settlemoney_group | number(28, 8) |
| 33 | settlemoney_org | settlemoney_org | settlemoney_org | number(28, 8) |
| 34 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 35 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 36 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 37 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |  |  | '~' |
| 38 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 39 | def1 | def1 | def1 | varchar2(101) |
| 40 | def2 | def2 | def2 | varchar2(101) |
| 41 | def3 | def3 | def3 | varchar2(101) |
| 42 | def4 | def4 | def4 | varchar2(101) |
| 43 | def5 | def5 | def5 | varchar2(101) |
| 44 | def6 | def6 | def6 | varchar2(101) |
| 45 | def7 | def7 | def7 | varchar2(101) |
| 46 | def8 | def8 | def8 | varchar2(101) |
| 47 | def9 | def9 | def9 | varchar2(101) |
| 48 | def10 | def10 | def10 | varchar2(101) |
| 49 | def11 | def11 | def11 | varchar2(101) |
| 50 | def12 | def12 | def12 | varchar2(101) |
| 51 | def13 | def13 | def13 | varchar2(101) |
| 52 | def14 | def14 | def14 | varchar2(101) |
| 53 | def15 | def15 | def15 | varchar2(101) |
| 54 | def16 | def16 | def16 | varchar2(101) |
| 55 | def17 | def17 | def17 | varchar2(101) |
| 56 | def18 | def18 | def18 | varchar2(101) |
| 57 | def19 | def19 | def19 | varchar2(101) |
| 58 | def20 | def20 | def20 | varchar2(101) |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |