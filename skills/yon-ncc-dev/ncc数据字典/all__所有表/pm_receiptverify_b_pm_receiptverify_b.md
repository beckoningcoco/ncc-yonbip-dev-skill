# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10686.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_b | pk_verify_b | pk_verify_b | char(20) | √ |
| 2 | bill_mny | bill_mny | bill_mny | number(28, 8) |  |  | 0 |
| 3 | bill_mny_global | bill_mny_global | bill_mny_global | number(28, 8) |  |  | 0 |
| 4 | bill_mny_group | bill_mny_group | bill_mny_group | number(28, 8) |  |  | 0 |
| 5 | bill_supplier | bill_supplier | bill_supplier | varchar2(20) |  |  | '~' |
| 6 | bill_tax | bill_tax | bill_tax | number(28, 8) |  |  | 0 |
| 7 | bill_taxmny | bill_taxmny | bill_taxmny | number(28, 8) |  |  | 0 |
| 8 | bill_taxmny_global | bill_taxmny_global | bill_taxmny_global | number(28, 8) |  |  | 0 |
| 9 | bill_taxmny_group | bill_taxmny_group | bill_taxmny_group | number(28, 8) |  |  | 0 |
| 10 | calcostmny | calcostmny | calcostmny | number(28, 8) |  |  | 0 |
| 11 | comments | comments | comments | varchar2(50) |
| 12 | contrtype | contrtype | contrtype | varchar2(50) |
| 13 | expe_mny | expe_mny | expe_mny | number(28, 8) |
| 14 | finish_flag | finish_flag | finish_flag | char(1) |
| 15 | invoice_code | invoice_code | invoice_code | varchar2(50) |
| 16 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |  |  | 0 |
| 17 | invoice_mny_global | invoice_mny_global | invoice_mny_global | number(28, 8) |  |  | 0 |
| 18 | invoice_mny_group | invoice_mny_group | invoice_mny_group | number(28, 8) |  |  | 0 |
| 19 | invoice_number | invoice_number | invoice_number | varchar2(8) |
| 20 | invoice_tax | invoice_tax | invoice_tax | number(28, 8) |
| 21 | invoice_taxmny | invoice_taxmny | invoice_taxmny | number(28, 8) |  |  | 0 |
| 22 | invoice_taxmny_global | invoice_taxmny_global | invoice_taxmny_global | number(28, 8) |  |  | 0 |
| 23 | invoice_taxmny_group | invoice_taxmny_group | invoice_taxmny_group | number(28, 8) |  |  | 0 |
| 24 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |  |  | 0 |
| 25 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |  |  | 0 |
| 26 | pk_billcontr | pk_billcontr | pk_billcontr | varchar2(50) |
| 27 | pk_billcontr_b | pk_billcontr_b | pk_billcontr_b | varchar2(50) |
| 28 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 29 | pk_contr | pk_contr | pk_contr | varchar2(50) |
| 30 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 31 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 32 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_invoice | pk_invoice | pk_invoice | varchar2(50) |
| 35 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 36 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 40 | pk_receiptverify | pk_receiptverify | pk_receiptverify | char(20) | √ |
| 41 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 42 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 43 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 44 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 45 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 46 | qual_mny | qual_mny | qual_mny | number(28, 8) |
| 47 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 48 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 49 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 50 | tabcode | tabcode | tabcode | varchar2(50) |
| 51 | taxrate | taxrate | taxrate | number(28, 8) |  |  | 0 |
| 52 | taxtype | taxtype | taxtype | number(38, 0) |
| 53 | tax_code | tax_code | tax_code | varchar2(20) |  |  | '~' |
| 54 | def1 | def1 | def1 | varchar2(101) |
| 55 | def2 | def2 | def2 | varchar2(101) |
| 56 | def3 | def3 | def3 | varchar2(101) |
| 57 | def4 | def4 | def4 | varchar2(101) |
| 58 | def5 | def5 | def5 | varchar2(101) |
| 59 | def6 | def6 | def6 | varchar2(101) |
| 60 | def7 | def7 | def7 | varchar2(101) |
| 61 | def8 | def8 | def8 | varchar2(101) |
| 62 | def9 | def9 | def9 | varchar2(101) |
| 63 | def10 | def10 | def10 | varchar2(101) |
| 64 | def11 | def11 | def11 | varchar2(101) |
| 65 | def12 | def12 | def12 | varchar2(101) |
| 66 | def13 | def13 | def13 | varchar2(101) |
| 67 | def14 | def14 | def14 | varchar2(101) |
| 68 | def15 | def15 | def15 | varchar2(101) |
| 69 | def16 | def16 | def16 | varchar2(101) |
| 70 | def17 | def17 | def17 | varchar2(101) |
| 71 | def18 | def18 | def18 | varchar2(101) |
| 72 | def19 | def19 | def19 | varchar2(101) |
| 73 | def20 | def20 | def20 | varchar2(101) |
| 74 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 75 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |