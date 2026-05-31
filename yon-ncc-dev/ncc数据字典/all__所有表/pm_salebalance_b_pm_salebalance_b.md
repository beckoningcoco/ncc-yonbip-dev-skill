# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sale_balance_b | pk_sale_balance_b | pk_sale_balance_b | char(20) | √ |
| 2 | app_mny | app_mny | app_mny | number(28, 8) |
| 3 | app_taxmny_org | app_taxmny_org | app_taxmny_org | number(28, 8) |  |  | 0 |
| 4 | bal_dif_mny | bal_dif_mny | bal_dif_mny | number(28, 8) |
| 5 | bal_dif_taxmny | bal_dif_taxmny | bal_dif_taxmny | number(28, 8) |
| 6 | cha_taxmny_org | cha_taxmny_org | cha_taxmny_org | number(28, 8) |
| 7 | due_app_mny | due_app_mny | due_app_mny | number(28, 8) |
| 8 | due_mny_org | due_mny_org | due_mny_org | number(28, 8) |
| 9 | due_taxmny_org | due_taxmny_org | due_taxmny_org | number(28, 8) |
| 10 | income_name | income_name | income_name | varchar2(80) |
| 11 | memo | memo | memo | varchar2(50) |
| 12 | mny_org | mny_org | mny_org | number(28, 8) |
| 13 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 14 | pk_checkfactor | pk_checkfactor | pk_checkfactor | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_mcontr_alter_b | pk_mcontr_alter_b | pk_mcontr_alter_b | varchar2(20) |  |  | '~' |
| 17 | pk_mcontr_works | pk_mcontr_works | pk_mcontr_works | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_sale_balance | pk_sale_balance | pk_sale_balance | char(20) | √ |
| 21 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 22 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 23 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 24 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 25 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 26 | src_rowno | src_rowno | src_rowno | varchar2(50) |
| 27 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 28 | tax | tax | tax | number(28, 8) |
| 29 | taxmny_org | taxmny_org | taxmny_org | number(28, 8) |
| 30 | taxrate | taxrate | taxrate | number(28, 8) |
| 31 | tot_bal_mny | tot_bal_mny | tot_bal_mny | number(28, 8) |
| 32 | tot_bal_taxmny | tot_bal_taxmny | tot_bal_taxmny | number(28, 8) |
| 33 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 34 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 35 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 36 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 37 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 38 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 39 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 40 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 41 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 42 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 43 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 44 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 45 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 46 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 47 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 48 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 49 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 50 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 51 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 52 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |