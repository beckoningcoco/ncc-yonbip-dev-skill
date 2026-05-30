# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptreg | pk_receiptreg | pk_receiptreg | char(20) | √ |
| 2 | accdif_money | accdif_money | accdif_money | number(28, 8) |  |  | 0 |
| 3 | accdif_money_global | accdif_money_global | accdif_money_global | number(28, 8) |  |  | 0 |
| 4 | accdif_money_group | accdif_money_group | accdif_money_group | number(28, 8) |  |  | 0 |
| 5 | accdif_taxmny | accdif_taxmny | accdif_taxmny | number(28, 8) |  |  | 0 |
| 6 | accdif_taxmny_global | accdif_taxmny_global | accdif_taxmny_global | number(28, 8) |  |  | 0 |
| 7 | accdif_taxmny_group | accdif_taxmny_group | accdif_taxmny_group | number(28, 8) |  |  | 0 |
| 8 | account_days | account_days | account_days | number(38, 0) |
| 9 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 10 | audittime | audittime | audittime | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billmaketime | billmaketime | billmaketime | char(19) |
| 13 | bill_code | bill_code | bill_code | varchar2(40) |
| 14 | bill_nspare_mny | bill_nspare_mny | bill_nspare_mny | number(28, 8) |  |  | 0 |
| 15 | bill_status | bill_status | bill_status | number(38, 0) |
| 16 | bill_type | bill_type | bill_type | varchar2(4) |
| 17 | busidate | busidate | busidate | char(19) |
| 18 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 19 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 20 | contract_code | contract_code | contract_code | varchar2(50) |
| 21 | contract_name | contract_name | contract_name | varchar2(300) |
| 22 | contract_name2 | contract_name2 | contract_name2 | varchar2(300) |
| 23 | contract_name3 | contract_name3 | contract_name3 | varchar2(300) |
| 24 | contract_name4 | contract_name4 | contract_name4 | varchar2(300) |
| 25 | contract_name5 | contract_name5 | contract_name5 | varchar2(300) |
| 26 | contract_name6 | contract_name6 | contract_name6 | varchar2(300) |
| 27 | curr_mny | curr_mny | curr_mny | number(28, 8) |  |  | 0 |
| 28 | curr_mny_global | curr_mny_global | curr_mny_global | number(28, 8) |  |  | 0 |
| 29 | curr_mny_group | curr_mny_group | curr_mny_group | number(28, 8) |  |  | 0 |
| 30 | end_invoice_date | end_invoice_date | end_invoice_date | char(19) |
| 31 | invoice_code | invoice_code | invoice_code | varchar2(50) |
| 32 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |  |  | 0 |
| 33 | invoice_mny_global | invoice_mny_global | invoice_mny_global | number(28, 8) |  |  | 0 |
| 34 | invoice_mny_group | invoice_mny_group | invoice_mny_group | number(28, 8) |  |  | 0 |
| 35 | invoice_number | invoice_number | invoice_number | varchar2(8) |
| 36 | invoice_type | invoice_type | invoice_type | number(38, 0) |  |  | 1 |
| 37 | isqualitymy | isqualitymy | isqualitymy | char(1) |
| 38 | is_virtualinvoice | is_virtualinvoice | is_virtualinvoice | char(1) |
| 39 | memo | memo | memo | varchar2(200) |
| 40 | nexchangerate | nexchangerate | nexchangerate | varchar2(50) |
| 41 | payer | payer | payer | varchar2(20) |  |  | '~' |
| 42 | pay_deadline | pay_deadline | pay_deadline | char(19) |
| 43 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 44 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 45 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 46 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 47 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 48 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 49 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 50 | pk_payway | pk_payway | pk_payway | varchar2(20) |  |  | '~' |
| 51 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 52 | pk_salesman | pk_salesman | pk_salesman | varchar2(20) |  |  | '~' |
| 53 | pk_supbankacc | pk_supbankacc | pk_supbankacc | varchar2(20) |  |  | '~' |
| 54 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 55 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 56 | prepaid_mny | prepaid_mny | prepaid_mny | number(28, 8) |  |  | 0 |
| 57 | qual_mny_deadline | qual_mny_deadline | qual_mny_deadline | char(19) |
| 58 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |  |  | 0 |
| 59 | receipt_complete_flag | receipt_complete_flag | receipt_complete_flag | char(1) |  |  | 'N' |
| 60 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 61 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 62 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 63 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 64 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |  |  | '~' |
| 65 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 66 | start_invoice_date | start_invoice_date | start_invoice_date | char(19) |
| 67 | tax | tax | tax | number(28, 8) |  |  | 0 |
| 68 | tot_taxmny | tot_taxmny | tot_taxmny | number(28, 8) |  |  | 0 |
| 69 | tot_taxmny_global | tot_taxmny_global | tot_taxmny_global | number(28, 8) |  |  | 0 |
| 70 | tot_taxmny_group | tot_taxmny_group | tot_taxmny_group | number(28, 8) |  |  | 0 |
| 71 | transi_type | transi_type | transi_type | varchar2(30) |
| 72 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 73 | verify_mny_global | verify_mny_global | verify_mny_global | number(28, 8) |  |  | 0 |
| 74 | verify_mny_group | verify_mny_group | verify_mny_group | number(28, 8) |  |  | 0 |
| 75 | verify_tax | verify_tax | verify_tax | number(28, 8) |  |  | 0 |
| 76 | veri_taxmny | veri_taxmny | veri_taxmny | number(28, 8) |  |  | 0 |
| 77 | veri_taxmny_global | veri_taxmny_global | veri_taxmny_global | number(28, 8) |  |  | 0 |
| 78 | veri_taxmny_group | veri_taxmny_group | veri_taxmny_group | number(28, 8) |  |  | 0 |
| 79 | def1 | def1 | def1 | varchar2(101) |
| 80 | def2 | def2 | def2 | varchar2(101) |
| 81 | def3 | def3 | def3 | varchar2(101) |
| 82 | def4 | def4 | def4 | varchar2(101) |
| 83 | def5 | def5 | def5 | varchar2(101) |
| 84 | def6 | def6 | def6 | varchar2(101) |
| 85 | def7 | def7 | def7 | varchar2(101) |
| 86 | def8 | def8 | def8 | varchar2(101) |
| 87 | def9 | def9 | def9 | varchar2(101) |
| 88 | def10 | def10 | def10 | varchar2(101) |
| 89 | def11 | def11 | def11 | varchar2(101) |
| 90 | def12 | def12 | def12 | varchar2(101) |
| 91 | def13 | def13 | def13 | varchar2(101) |
| 92 | def14 | def14 | def14 | varchar2(101) |
| 93 | def15 | def15 | def15 | varchar2(101) |
| 94 | def16 | def16 | def16 | varchar2(101) |
| 95 | def17 | def17 | def17 | varchar2(101) |
| 96 | def18 | def18 | def18 | varchar2(101) |
| 97 | def19 | def19 | def19 | varchar2(101) |
| 98 | def20 | def20 | def20 | varchar2(101) |
| 99 | creationtime | creationtime | creationtime | char(19) |
| 100 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 101 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 102 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 103 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 104 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |