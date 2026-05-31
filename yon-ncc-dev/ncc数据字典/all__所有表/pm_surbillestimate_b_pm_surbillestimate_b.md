# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_surbillestimate_b | pk_surbillestimate_b | pk_surbillestimate_b | char(20) | √ |
| 2 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 3 | comments | comments | comments | varchar2(200) |
| 4 | curr_num | curr_num | curr_num | number(28, 8) |
| 5 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 6 | estimate_price | estimate_price | estimate_price | number(28, 8) |
| 7 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 8 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 9 | estimate_taxprice | estimate_taxprice | estimate_taxprice | number(28, 8) |
| 10 | memo | memo | memo | varchar2(200) |
| 11 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 12 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 13 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 14 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 17 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 18 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 22 | pk_surbillestimate | pk_surbillestimate | pk_surbillestimate | char(20) | √ |
| 23 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 24 | pk_verify_b | pk_verify_b | pk_verify_b | varchar2(50) |
| 25 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 26 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 27 | src_tabcode | src_tabcode | src_tabcode | varchar2(50) |
| 28 | taxrate | taxrate | taxrate | number(28, 8) |
| 29 | taxtype | taxtype | taxtype | number(38, 0) |  |  | 1 |
| 30 | def1 | def1 | def1 | varchar2(101) |
| 31 | def2 | def2 | def2 | varchar2(101) |
| 32 | def3 | def3 | def3 | varchar2(101) |
| 33 | def4 | def4 | def4 | varchar2(101) |
| 34 | def5 | def5 | def5 | varchar2(101) |
| 35 | def6 | def6 | def6 | varchar2(101) |
| 36 | def7 | def7 | def7 | varchar2(101) |
| 37 | def8 | def8 | def8 | varchar2(101) |
| 38 | def9 | def9 | def9 | varchar2(101) |
| 39 | def10 | def10 | def10 | varchar2(101) |
| 40 | def11 | def11 | def11 | varchar2(101) |
| 41 | def12 | def12 | def12 | varchar2(101) |
| 42 | def13 | def13 | def13 | varchar2(101) |
| 43 | def14 | def14 | def14 | varchar2(101) |
| 44 | def15 | def15 | def15 | varchar2(101) |
| 45 | def16 | def16 | def16 | varchar2(101) |
| 46 | def17 | def17 | def17 | varchar2(101) |
| 47 | def18 | def18 | def18 | varchar2(101) |
| 48 | def19 | def19 | def19 | varchar2(101) |
| 49 | def20 | def20 | def20 | varchar2(101) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |