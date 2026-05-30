# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialacc_b | pk_materialacc_b | pk_materialacc_b | char(20) | √ |
| 2 | actual_deduct_money | actual_deduct_money | actual_deduct_money | number(28, 8) |
| 3 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 4 | curr_actual_num | curr_actual_num | curr_actual_num | number(28, 8) |
| 5 | curr_cance_num | curr_cance_num | curr_cance_num | number(28, 8) |
| 6 | curr_draw_num | curr_draw_num | curr_draw_num | number(28, 8) |
| 7 | curr_net_num | curr_net_num | curr_net_num | number(28, 8) |
| 8 | diversity_num | diversity_num | diversity_num | number(28, 8) |
| 9 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 10 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 11 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 12 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | money_mny | money_mny | money_mny | number(28, 8) |
| 15 | money_taxmny | money_taxmny | money_taxmny | number(28, 8) |
| 16 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 17 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 18 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 21 | pk_materialacc | pk_materialacc | pk_materialacc | char(20) | √ |
| 22 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 23 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 27 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 28 | price | price | price | number(28, 8) |
| 29 | priceratio | priceratio | priceratio | number(28, 2) |  |  | 1 |
| 30 | prior_actual_num | prior_actual_num | prior_actual_num | number(28, 8) |
| 31 | rowno | rowno | rowno | varchar2(30) |
| 32 | stockorg | stockorg | stockorg | varchar2(20) |  |  | '~' |
| 33 | stockorg_v | stockorg_v | stockorg_v | varchar2(20) |  |  | '~' |
| 34 | tax | tax | tax | number(28, 8) |
| 35 | taxprice | taxprice | taxprice | number(28, 8) |
| 36 | taxrate | taxrate | taxrate | number(28, 8) |
| 37 | tot_actual_num | tot_actual_num | tot_actual_num | number(28, 8) |
| 38 | tot_cance_num | tot_cance_num | tot_cance_num | number(28, 8) |
| 39 | tot_draw_num | tot_draw_num | tot_draw_num | number(28, 8) |
| 40 | tot_net_num | tot_net_num | tot_net_num | number(28, 8) |
| 41 | verified_flag | verified_flag | verified_flag | char(1) |
| 42 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 43 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 44 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 45 | def1 | def1 | def1 | varchar2(101) |
| 46 | def2 | def2 | def2 | varchar2(101) |
| 47 | def3 | def3 | def3 | varchar2(101) |
| 48 | def4 | def4 | def4 | varchar2(101) |
| 49 | def5 | def5 | def5 | varchar2(101) |
| 50 | def6 | def6 | def6 | varchar2(101) |
| 51 | def7 | def7 | def7 | varchar2(101) |
| 52 | def8 | def8 | def8 | varchar2(101) |
| 53 | def9 | def9 | def9 | varchar2(101) |
| 54 | def10 | def10 | def10 | varchar2(101) |
| 55 | def11 | def11 | def11 | varchar2(101) |
| 56 | def12 | def12 | def12 | varchar2(101) |
| 57 | def13 | def13 | def13 | varchar2(101) |
| 58 | def14 | def14 | def14 | varchar2(101) |
| 59 | def15 | def15 | def15 | varchar2(101) |
| 60 | def16 | def16 | def16 | varchar2(101) |
| 61 | def17 | def17 | def17 | varchar2(101) |
| 62 | def18 | def18 | def18 | varchar2(101) |
| 63 | def19 | def19 | def19 | varchar2(101) |
| 64 | def20 | def20 | def20 | varchar2(101) |
| 65 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |