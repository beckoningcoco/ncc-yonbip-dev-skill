# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_bal_b | pk_contr_bal_b | pk_contr_bal_b | char(20) | √ |
| 2 | bala_mny | bala_mny | bala_mny | number(28, 8) |  |  | 0 |
| 3 | bala_num | bala_num | bala_num | number(28, 8) |
| 4 | bala_tax | bala_tax | bala_tax | number(28, 8) |
| 5 | bala_taxmny | bala_taxmny | bala_taxmny | number(28, 8) |
| 6 | calcostmny | calcostmny | calcostmny | number(28, 8) |  |  | 0 |
| 7 | curr_expe_mny | curr_expe_mny | curr_expe_mny | number(28, 8) |
| 8 | dif_mny | dif_mny | dif_mny | number(28, 8) |  |  | 0 |
| 9 | dif_taxmny | dif_taxmny | dif_taxmny | number(28, 8) |
| 10 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 11 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 14 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 15 | ntot_sche_mny | ntot_sche_mny | ntot_sche_mny | number(28, 8) |
| 16 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 17 | pk_contr_alter_b | pk_contr_alter_b | pk_contr_alter_b | varchar2(20) |  |  | '~' |
| 18 | pk_contr_bal | pk_contr_bal | pk_contr_bal | char(20) | √ |
| 19 | pk_contr_works | pk_contr_works | pk_contr_works | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 22 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 23 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 27 | price | price | price | number(28, 8) |
| 28 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |
| 29 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 30 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 31 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 32 | src_rowno | src_rowno | src_rowno | varchar2(50) |
| 33 | taxprice | taxprice | taxprice | number(28, 8) |
| 34 | taxrate | taxrate | taxrate | number(28, 8) |
| 35 | tot_comp_num | tot_comp_num | tot_comp_num | number(28, 8) |
| 36 | verified_flag | verified_flag | verified_flag | char(1) |
| 37 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 38 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 39 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 40 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 41 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 42 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 43 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 44 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 45 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 46 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 47 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 48 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 49 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 50 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 51 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 52 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 53 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 54 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 55 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 56 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 57 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |