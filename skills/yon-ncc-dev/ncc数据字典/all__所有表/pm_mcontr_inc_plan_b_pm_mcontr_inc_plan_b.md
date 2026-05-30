# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income_plan_b | pk_income_plan_b | pk_income_plan_b | char(20) | √ |
| 2 | accrate | accrate | accrate | number(28, 8) |
| 3 | actu_mny_curr | actu_mny_curr | actu_mny_curr | number(28, 8) |
| 4 | actu_mny_global | actu_mny_global | actu_mny_global | number(28, 8) |
| 5 | actu_mny_group | actu_mny_group | actu_mny_group | number(28, 8) |
| 6 | actu_mny_orig | actu_mny_orig | actu_mny_orig | number(28, 8) |
| 7 | due_shou_mny | due_shou_mny | due_shou_mny | number(28, 8) |
| 8 | income_name | income_name | income_name | varchar2(50) |
| 9 | isdeposit | isdeposit | isdeposit | char(1) |
| 10 | mctr_mny | mctr_mny | mctr_mny | number(28, 8) |
| 11 | mctr_mny_orig | mctr_mny_orig | mctr_mny_orig | number(28, 8) |
| 12 | mctr_taxmny | mctr_taxmny | mctr_taxmny | number(28, 8) |
| 13 | memo | memo | memo | varchar2(300) |
| 14 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 15 | pk_checkfactor | pk_checkfactor | pk_checkfactor | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_income_plan | pk_income_plan | pk_income_plan | char(20) | √ |
| 18 | pk_mcontr_works | pk_mcontr_works | pk_mcontr_works | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 22 | prepayment_enum | prepayment_enum | prepayment_enum | number(38, 0) |
| 23 | rowno | rowno | rowno | varchar2(20) |
| 24 | shou_mny_global | shou_mny_global | shou_mny_global | number(28, 8) |
| 25 | shou_mny_group | shou_mny_group | shou_mny_group | number(28, 8) |
| 26 | shou_mny_org | shou_mny_org | shou_mny_org | number(28, 8) |
| 27 | shou_mny_orig | shou_mny_orig | shou_mny_orig | number(28, 8) |
| 28 | shou_taxmny_global | shou_taxmny_global | shou_taxmny_global | number(28, 8) |
| 29 | shou_taxmny_group | shou_taxmny_group | shou_taxmny_group | number(28, 8) |
| 30 | shou_taxmny_org | shou_taxmny_org | shou_taxmny_org | number(28, 8) |
| 31 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 32 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 33 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 34 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 35 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 36 | tax | tax | tax | number(28, 8) |
| 37 | taxrate | taxrate | taxrate | number(28, 8) |
| 38 | taxtype | taxtype | taxtype | number(38, 0) |
| 39 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 40 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 41 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 42 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 43 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 44 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 45 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 46 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 47 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 48 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 49 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 50 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 51 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 52 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 53 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 54 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 55 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 56 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 57 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 58 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |