# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypati | pk_paypati | pk_paypati | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | amt_after | amt_after | amt_after | number(28, 8) |
| 4 | amt_before | amt_before | amt_before | number(28, 8) |
| 5 | amt_remain | amt_remain | amt_remain | number(22, 8) |
| 6 | bankno | bankno | bankno | varchar2(30) |
| 7 | code_rept | code_rept | code_rept | varchar2(30) |
| 8 | date_pay | date_pay | date_pay | char(19) |
| 9 | dt_paymode | dt_paymode | dt_paymode | varchar2(30) |
| 10 | dt_prepay_type | dt_prepay_type | dt_prepay_type | varchar2(50) |
| 11 | dt_source | dt_source | dt_source | varchar2(20) |
| 12 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 13 | flag_blcc | flag_blcc | flag_blcc | char(1) |
| 14 | flag_link_zero | flag_link_zero | flag_link_zero | char(1) |
| 15 | forbid_cash | forbid_cash | forbid_cash | char(1) |
| 16 | name_psn_pay | name_psn_pay | name_psn_pay | varchar2(50) |
| 17 | note | note | note | varchar2(256) |
| 18 | paymodenode | paymodenode | paymodenode | varchar2(256) |
| 19 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 20 | pk_blcc | pk_blcc | pk_blcc | varchar2(20) |  |  | '~' |
| 21 | pk_dept_pay | pk_dept_pay | pk_dept_pay | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_pay | pk_org_pay | pk_org_pay | varchar2(20) |  |  | '~' |
| 25 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 26 | pk_patiacc | pk_patiacc | pk_patiacc | varchar2(50) |
| 27 | pk_paymode | pk_paymode | pk_paymode | varchar2(20) |  |  | '~' |
| 28 | pk_paypati_link | pk_paypati_link | pk_paypati_link | varchar2(50) |
| 29 | pk_prepay_type | pk_prepay_type | pk_prepay_type | char(20) |
| 30 | pk_psn_pay | pk_psn_pay | pk_psn_pay | varchar2(20) |  |  | '~' |
| 31 | pk_source | pk_source | pk_source | varchar2(20) |
| 32 | pk_st_link | pk_st_link | pk_st_link | varchar2(50) |
| 33 | trans_code | trans_code | trans_code | varchar2(50) |
| 34 | valid_date | valid_date | valid_date | char(19) |
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
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |