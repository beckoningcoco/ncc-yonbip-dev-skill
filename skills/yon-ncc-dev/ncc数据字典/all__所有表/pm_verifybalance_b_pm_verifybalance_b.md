# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_bala_b | pk_verify_bala_b | pk_verify_bala_b | char(20) | √ |
| 2 | bill_mny | bill_mny | bill_mny | number(28, 8) |  |  | 0 |
| 3 | bill_mny_global | bill_mny_global | bill_mny_global | number(28, 8) |  |  | 0 |
| 4 | bill_mny_group | bill_mny_group | bill_mny_group | number(28, 8) |  |  | 0 |
| 5 | bill_tax | bill_tax | bill_tax | number(28, 8) |  |  | 0 |
| 6 | bill_taxmny | bill_taxmny | bill_taxmny | number(28, 8) |  |  | 0 |
| 7 | bill_taxmny_global | bill_taxmny_global | bill_taxmny_global | number(28, 8) |  |  | 0 |
| 8 | bill_taxmny_group | bill_taxmny_group | bill_taxmny_group | number(28, 8) |  |  | 0 |
| 9 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 10 | calcostmny_global | calcostmny_global | calcostmny_global | number(28, 8) |
| 11 | calcostmny_group | calcostmny_group | calcostmny_group | number(28, 8) |
| 12 | memo | memo | memo | varchar2(300) |
| 13 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 14 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |  |  | 0 |
| 15 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 16 | pk_checkfactor | pk_checkfactor | pk_checkfactor | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 19 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 23 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 24 | pk_verify_balance | pk_verify_balance | pk_verify_balance | char(20) | √ |
| 25 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 26 | rowno | rowno | rowno | varchar2(20) |
| 27 | src_pk_invoice | src_pk_invoice | src_pk_invoice | varchar2(20) |
| 28 | taxrate | taxrate | taxrate | number(28, 8) |  |  | 0 |
| 29 | taxtype | taxtype | taxtype | number(38, 0) |
| 30 | tax_code | tax_code | tax_code | varchar2(20) |  |  | '~' |
| 31 | tot_taxmny | tot_taxmny | tot_taxmny | number(28, 8) |
| 32 | tot_taxmny_global | tot_taxmny_global | tot_taxmny_global | number(28, 8) |
| 33 | tot_taxmny_group | tot_taxmny_group | tot_taxmny_group | number(28, 8) |
| 34 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 35 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 36 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 37 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 38 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 39 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 40 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 41 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 42 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 43 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 44 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 45 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 46 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 47 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 48 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 49 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 50 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 51 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 52 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 53 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |