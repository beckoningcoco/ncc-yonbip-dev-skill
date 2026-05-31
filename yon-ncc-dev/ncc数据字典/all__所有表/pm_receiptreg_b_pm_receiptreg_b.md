# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptreg_b | pk_receiptreg_b | pk_receiptreg_b | char(20) | √ |
| 2 | accdif_money | accdif_money | accdif_money | number(28, 8) |  |  | 0 |
| 3 | accdif_money_global | accdif_money_global | accdif_money_global | number(28, 8) |  |  | 0 |
| 4 | accdif_money_group | accdif_money_group | accdif_money_group | number(28, 8) |  |  | 0 |
| 5 | accdif_taxmny | accdif_taxmny | accdif_taxmny | number(28, 8) |  |  | 0 |
| 6 | accdif_taxmny_global | accdif_taxmny_global | accdif_taxmny_global | number(28, 8) |  |  | 0 |
| 7 | accdif_taxmny_group | accdif_taxmny_group | accdif_taxmny_group | number(28, 8) |  |  | 0 |
| 8 | calcostmny | calcostmny | calcostmny | number(28, 8) |  |  | 0 |
| 9 | contract_body_id | contract_body_id | contract_body_id | varchar2(50) |
| 10 | contract_code | contract_code | contract_code | varchar2(50) |
| 11 | contract_id | contract_id | contract_id | varchar2(50) |
| 12 | contract_name | contract_name | contract_name | varchar2(300) |
| 13 | contract_name2 | contract_name2 | contract_name2 | varchar2(300) |
| 14 | contract_name3 | contract_name3 | contract_name3 | varchar2(300) |
| 15 | contract_name4 | contract_name4 | contract_name4 | varchar2(300) |
| 16 | contract_name5 | contract_name5 | contract_name5 | varchar2(300) |
| 17 | contract_name6 | contract_name6 | contract_name6 | varchar2(300) |
| 18 | curr_mny | curr_mny | curr_mny | number(28, 8) |  |  | 0 |
| 19 | curr_mny_global | curr_mny_global | curr_mny_global | number(28, 8) |  |  | 0 |
| 20 | curr_mny_group | curr_mny_group | curr_mny_group | number(28, 8) |  |  | 0 |
| 21 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 22 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 23 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 24 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |  |  | 0 |
| 25 | invoice_mny_global | invoice_mny_global | invoice_mny_global | number(28, 8) |  |  | 0 |
| 26 | invoice_mny_group | invoice_mny_group | invoice_mny_group | number(28, 8) |  |  | 0 |
| 27 | is_verify | is_verify | is_verify | varchar2(1) |  |  | 'Y' |
| 28 | memo | memo | memo | varchar2(200) |
| 29 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |  |  | 0 |
| 30 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |  |  | 0 |
| 31 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 32 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 35 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 39 | pk_receiptreg | pk_receiptreg | pk_receiptreg | char(20) | √ |
| 40 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 41 | prepaid_mny | prepaid_mny | prepaid_mny | number(28, 8) |  |  | 0 |
| 42 | prepaid_mny_global | prepaid_mny_global | prepaid_mny_global | number(28, 8) |  |  | 0 |
| 43 | prepaid_mny_group | prepaid_mny_group | prepaid_mny_group | number(28, 8) |  |  | 0 |
| 44 | qual_mny_deadline | qual_mny_deadline | qual_mny_deadline | char(19) |
| 45 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |  |  | 0 |
| 46 | rowno | rowno | rowno | varchar2(30) |
| 47 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 48 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |  |  | '~' |
| 49 | src_bill_typeid | src_bill_typeid | src_bill_typeid | varchar2(20) |  |  | '~' |
| 50 | src_contr_type | src_contr_type | src_contr_type | varchar2(50) |  |  | '~' |
| 51 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 52 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 53 | src_prepaid_mny | src_prepaid_mny | src_prepaid_mny | number(28, 8) |  |  | 0 |
| 54 | src_qual_taxmny | src_qual_taxmny | src_qual_taxmny | number(28, 8) |  |  | 0 |
| 55 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 56 | summary | summary | summary | varchar2(50) |
| 57 | tax | tax | tax | number(28, 8) |  |  | 0 |
| 58 | taxrate | taxrate | taxrate | number(28, 8) |  |  | 0 |
| 59 | taxtype | taxtype | taxtype | number(38, 0) |  |  | 1 |
| 60 | tax_code | tax_code | tax_code | varchar2(20) |  |  | '~' |
| 61 | tot_taxmny | tot_taxmny | tot_taxmny | number(28, 8) |  |  | 0 |
| 62 | tot_taxmny_global | tot_taxmny_global | tot_taxmny_global | number(28, 8) |  |  | 0 |
| 63 | tot_taxmny_group | tot_taxmny_group | tot_taxmny_group | number(28, 8) |  |  | 0 |
| 64 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 65 | verify_mny_global | verify_mny_global | verify_mny_global | number(28, 8) |  |  | 0 |
| 66 | verify_mny_group | verify_mny_group | verify_mny_group | number(28, 8) |  |  | 0 |
| 67 | verify_tax | verify_tax | verify_tax | number(28, 8) |  |  | 0 |
| 68 | veri_taxmny | veri_taxmny | veri_taxmny | number(28, 8) |  |  | 0 |
| 69 | veri_taxmny_global | veri_taxmny_global | veri_taxmny_global | number(28, 8) |  |  | 0 |
| 70 | veri_taxmny_group | veri_taxmny_group | veri_taxmny_group | number(28, 8) |  |  | 0 |
| 71 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 72 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 73 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 74 | def1 | def1 | def1 | varchar2(101) |
| 75 | def2 | def2 | def2 | varchar2(101) |
| 76 | def3 | def3 | def3 | varchar2(101) |
| 77 | def4 | def4 | def4 | varchar2(101) |
| 78 | def5 | def5 | def5 | varchar2(101) |
| 79 | def6 | def6 | def6 | varchar2(101) |
| 80 | def7 | def7 | def7 | varchar2(101) |
| 81 | def8 | def8 | def8 | varchar2(101) |
| 82 | def9 | def9 | def9 | varchar2(101) |
| 83 | def10 | def10 | def10 | varchar2(101) |
| 84 | def11 | def11 | def11 | varchar2(101) |
| 85 | def12 | def12 | def12 | varchar2(101) |
| 86 | def13 | def13 | def13 | varchar2(101) |
| 87 | def14 | def14 | def14 | varchar2(101) |
| 88 | def15 | def15 | def15 | varchar2(101) |
| 89 | def16 | def16 | def16 | varchar2(101) |
| 90 | def17 | def17 | def17 | varchar2(101) |
| 91 | def18 | def18 | def18 | varchar2(101) |
| 92 | def19 | def19 | def19 | varchar2(101) |
| 93 | def20 | def20 | def20 | varchar2(101) |
| 94 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 95 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |