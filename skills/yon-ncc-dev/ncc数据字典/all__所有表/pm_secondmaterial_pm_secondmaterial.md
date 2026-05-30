# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10700.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_secondmaterial | pk_secondmaterial | pk_secondmaterial | char(20) | √ |
| 2 | actual_deduct_money | actual_deduct_money | actual_deduct_money | number(28, 8) |
| 3 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 4 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 5 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 6 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 7 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 8 | material_num | material_num | material_num | number(28, 8) |
| 9 | memo | memo | memo | varchar2(200) |
| 10 | money_mny | money_mny | money_mny | number(28, 8) |
| 11 | money_taxmny | money_taxmny | money_taxmny | number(28, 8) |
| 12 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 13 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 14 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 17 | pk_materialacc | pk_materialacc | pk_materialacc | char(20) | √ |
| 18 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 19 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 23 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 24 | price | price | price | number(28, 8) |
| 25 | priceratio | priceratio | priceratio | number(28, 2) |  |  | 1 |
| 26 | rowno | rowno | rowno | varchar2(30) |
| 27 | tax | tax | tax | number(28, 8) |
| 28 | taxprice | taxprice | taxprice | number(28, 8) |
| 29 | taxrate | taxrate | taxrate | number(28, 8) |
| 30 | verified_flag | verified_flag | verified_flag | char(1) |
| 31 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 32 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 33 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | def11 | def11 | def11 | varchar2(101) |
| 45 | def12 | def12 | def12 | varchar2(101) |
| 46 | def13 | def13 | def13 | varchar2(101) |
| 47 | def14 | def14 | def14 | varchar2(101) |
| 48 | def15 | def15 | def15 | varchar2(101) |
| 49 | def16 | def16 | def16 | varchar2(101) |
| 50 | def17 | def17 | def17 | varchar2(101) |
| 51 | def18 | def18 | def18 | varchar2(101) |
| 52 | def19 | def19 | def19 | varchar2(101) |
| 53 | def20 | def20 | def20 | varchar2(101) |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |