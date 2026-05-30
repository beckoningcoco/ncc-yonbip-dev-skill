# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypati | pk_paypati | pk_paypati | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | bankno | bankno | bankno | varchar2(30) |
| 4 | code_pvtype | code_pvtype | code_pvtype | varchar2(30) |
| 5 | code_rept | code_rept | code_rept | varchar2(30) |
| 6 | date_pay | date_pay | date_pay | char(19) |
| 7 | date_return | date_return | date_return | char(19) |
| 8 | dt_paymode | dt_paymode | dt_paymode | varchar2(30) |
| 9 | dt_paytype | dt_paytype | dt_paytype | varchar2(30) |
| 10 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 11 | eu_rept_lost | eu_rept_lost | eu_rept_lost | number(38, 0) |
| 12 | flag_blcc | flag_blcc | flag_blcc | char(1) |
| 13 | flag_rept_return | flag_rept_return | flag_rept_return | char(1) |
| 14 | flag_st | flag_st | flag_st | char(1) |
| 15 | name_psn_pay | name_psn_pay | name_psn_pay | varchar2(50) |
| 16 | name_psn_return | name_psn_return | name_psn_return | varchar2(50) |
| 17 | note | note | note | varchar2(256) |
| 18 | paymodenode | paymodenode | paymodenode | varchar2(256) |
| 19 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 20 | pk_blcc | pk_blcc | pk_blcc | varchar2(20) |  |  | '~' |
| 21 | pk_dept_pay | pk_dept_pay | pk_dept_pay | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_pay | pk_org_pay | pk_org_pay | varchar2(20) |  |  | '~' |
| 26 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 27 | pk_paymode | pk_paymode | pk_paymode | varchar2(20) |  |  | '~' |
| 28 | pk_paypati_reted | pk_paypati_reted | pk_paypati_reted | varchar2(20) |
| 29 | pk_paytype | pk_paytype | pk_paytype | varchar2(20) |  |  | '~' |
| 30 | pk_psn_pay | pk_psn_pay | pk_psn_pay | varchar2(20) |  |  | '~' |
| 31 | pk_psn_return | pk_psn_return | pk_psn_return | varchar2(20) |  |  | '~' |
| 32 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 33 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 34 | pk_st | pk_st | pk_st | varchar2(20) |  |  | '~' |
| 35 | pk_st_mid | pk_st_mid | pk_st_mid | varchar2(50) |
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
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |