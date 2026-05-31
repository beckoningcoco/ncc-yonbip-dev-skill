# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_works | pk_contr_works | pk_contr_works | char(20) | √ |
| 2 | bal_mny | bal_mny | bal_mny | number(28, 8) |  |  | 0 |
| 3 | calcostmny | calcostmny | calcostmny | number(28, 8) |  |  | 0 |
| 4 | curr_mny | curr_mny | curr_mny | number(28, 8) |  |  | 0 |
| 5 | curr_num | curr_num | curr_num | number(28, 8) |
| 6 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 7 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 8 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 9 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 10 | ntot_comp_mny | ntot_comp_mny | ntot_comp_mny | number(28, 8) |  |  | 0 |
| 11 | ntot_pay_mny | ntot_pay_mny | ntot_pay_mny | number(28, 8) |  |  | 0 |
| 12 | oprnum | oprnum | oprnum | number(38, 0) |  |  | 0 |
| 13 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 14 | pk_child_oid | pk_child_oid | pk_child_oid | varchar2(20) |
| 15 | pk_contr | pk_contr | pk_contr | char(20) | √ |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 18 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 19 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 23 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 24 | price | price | price | number(28, 8) |  |  | 0 |
| 25 | rowno | rowno | rowno | varchar2(30) |
| 26 | service_prc_ratio | service_prc_ratio | service_prc_ratio | number(28, 8) |
| 27 | tax | tax | tax | number(28, 8) |
| 28 | taxprice | taxprice | taxprice | number(28, 8) |
| 29 | taxrate | taxrate | taxrate | number(28, 8) |
| 30 | tot_comp_mny | tot_comp_mny | tot_comp_mny | number(28, 8) |
| 31 | tot_comp_num | tot_comp_num | tot_comp_num | number(28, 8) |
| 32 | tot_cost_mny | tot_cost_mny | tot_cost_mny | number(28, 8) |  |  | 0 |
| 33 | tot_sld_mny | tot_sld_mny | tot_sld_mny | number(28, 8) |  |  | 0 |
| 34 | tot_sld_taxmny | tot_sld_taxmny | tot_sld_taxmny | number(28, 8) |
| 35 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 36 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 37 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 38 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 39 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 40 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 41 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 42 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 43 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 44 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 45 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 46 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 47 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 48 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 49 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 50 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 51 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 52 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 53 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 54 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |