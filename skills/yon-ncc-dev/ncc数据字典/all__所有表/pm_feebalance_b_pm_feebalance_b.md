# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feebalance_b | pk_feebalance_b | pk_feebalance_b | char(20) | √ |
| 2 | apply_mny | apply_mny | apply_mny | number(28, 8) |  |  | 0 |
| 3 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 4 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 5 | curr_num | curr_num | curr_num | number(28, 8) |
| 6 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 7 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 8 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 9 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 10 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 11 | invoice_qual_mny | invoice_qual_mny | invoice_qual_mny | number(28, 8) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 14 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 15 | pay_mny | pay_mny | pay_mny | number(28, 8) |  |  | 0 |
| 16 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 17 | pk_feebalance | pk_feebalance | pk_feebalance | char(20) | √ |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 20 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 21 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 25 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 26 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 27 | price | price | price | number(28, 8) |
| 28 | qual_apply_mny | qual_apply_mny | qual_apply_mny | number(28, 8) |  |  | 0 |
| 29 | qual_length | qual_length | qual_length | number(38, 0) |
| 30 | qual_mny | qual_mny | qual_mny | number(28, 8) |  |  | 0 |
| 31 | qual_mny_date | qual_mny_date | qual_mny_date | char(19) |
| 32 | qual_mny_deadline | qual_mny_deadline | qual_mny_deadline | char(19) |
| 33 | qual_mny_prop | qual_mny_prop | qual_mny_prop | number(28, 8) |
| 34 | qual_pay_mny | qual_pay_mny | qual_pay_mny | number(28, 8) |  |  | 0 |
| 35 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |
| 36 | qual_verify_mny | qual_verify_mny | qual_verify_mny | number(28, 8) |  |  | 0 |
| 37 | service_prc_ratio | service_prc_ratio | service_prc_ratio | number(28, 8) |
| 38 | tax | tax | tax | number(28, 8) |
| 39 | taxprice | taxprice | taxprice | number(28, 8) |
| 40 | taxrate | taxrate | taxrate | number(28, 8) |
| 41 | taxtype | taxtype | taxtype | number(38, 0) |  |  | 1 |
| 42 | verified_flag | verified_flag | verified_flag | char(1) |
| 43 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 44 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 45 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 46 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 47 | def1 | def1 | def1 | varchar2(101) |
| 48 | def2 | def2 | def2 | varchar2(101) |
| 49 | def3 | def3 | def3 | varchar2(101) |
| 50 | def4 | def4 | def4 | varchar2(101) |
| 51 | def5 | def5 | def5 | varchar2(101) |
| 52 | def6 | def6 | def6 | varchar2(101) |
| 53 | def7 | def7 | def7 | varchar2(101) |
| 54 | def8 | def8 | def8 | varchar2(101) |
| 55 | def9 | def9 | def9 | varchar2(101) |
| 56 | def10 | def10 | def10 | varchar2(101) |
| 57 | def11 | def11 | def11 | varchar2(101) |
| 58 | def12 | def12 | def12 | varchar2(101) |
| 59 | def13 | def13 | def13 | varchar2(101) |
| 60 | def14 | def14 | def14 | varchar2(101) |
| 61 | def15 | def15 | def15 | varchar2(101) |
| 62 | def16 | def16 | def16 | varchar2(101) |
| 63 | def17 | def17 | def17 | varchar2(101) |
| 64 | def18 | def18 | def18 | varchar2(101) |
| 65 | def19 | def19 | def19 | varchar2(101) |
| 66 | def20 | def20 | def20 | varchar2(101) |
| 67 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 68 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |