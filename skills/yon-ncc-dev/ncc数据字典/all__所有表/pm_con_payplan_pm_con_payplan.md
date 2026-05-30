# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_con_payplan | pk_con_payplan | pk_con_payplan | char(20) | √ |
| 2 | accrate | accrate | accrate | number(28, 8) |
| 3 | apply_global | apply_global | apply_global | number(28, 8) |
| 4 | apply_group | apply_group | apply_group | number(28, 8) |
| 5 | apply_mny | apply_mny | apply_mny | number(28, 8) |
| 6 | apply_orig | apply_orig | apply_orig | number(28, 8) |
| 7 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 8 | audittime | audittime | audittime | char(19) |
| 9 | begin_flag | begin_flag | begin_flag | char(1) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billmaketime | billmaketime | billmaketime | char(19) |
| 12 | bill_code | bill_code | bill_code | varchar2(50) |
| 13 | bill_status | bill_status | bill_status | number(38, 0) |
| 14 | bill_type | bill_type | bill_type | varchar2(50) |
| 15 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 16 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 17 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 18 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 19 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 20 | curr_mny_orig | curr_mny_orig | curr_mny_orig | number(28, 8) |
| 21 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 22 | curr_taxmny_orig | curr_taxmny_orig | curr_taxmny_orig | number(28, 8) |
| 23 | deadline | deadline | deadline | char(19) |
| 24 | effdate_chan_flag | effdate_chan_flag | effdate_chan_flag | char(1) |  |  | 'N' |
| 25 | effect_date | effect_date | effect_date | char(19) |
| 26 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 27 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 28 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 29 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 30 | ex_rate | ex_rate | ex_rate | number(28, 8) |
| 31 | finish_per | finish_per | finish_per | number(28, 8) |
| 32 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 33 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 34 | memo | memo | memo | varchar2(200) |
| 35 | nmny_global | nmny_global | nmny_global | number(28, 8) |
| 36 | nmny_group | nmny_group | nmny_group | number(28, 8) |
| 37 | nmny_org | nmny_org | nmny_org | number(28, 8) |
| 38 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 39 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 40 | ntaxmny_global | ntaxmny_global | ntaxmny_global | number(28, 8) |
| 41 | ntaxmny_group | ntaxmny_group | ntaxmny_group | number(28, 8) |
| 42 | ntaxmny_org | ntaxmny_org | ntaxmny_org | number(28, 8) |
| 43 | orig_mny | orig_mny | orig_mny | number(28, 8) |
| 44 | orig_taxmny | orig_taxmny | orig_taxmny | number(28, 8) |
| 45 | payment_day | payment_day | payment_day | number(38, 0) |
| 46 | pay_apply_flag | pay_apply_flag | pay_apply_flag | char(1) |
| 47 | pay_global | pay_global | pay_global | number(28, 8) |
| 48 | pay_group | pay_group | pay_group | number(28, 8) |
| 49 | pay_mny | pay_mny | pay_mny | number(28, 8) |
| 50 | pay_orig | pay_orig | pay_orig | number(28, 8) |
| 51 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 52 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 53 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 54 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 55 | pk_discontrpaycon | pk_discontrpaycon | pk_discontrpaycon | varchar2(50) |  |  | '~' |
| 56 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 57 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 58 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 59 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 60 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 61 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 62 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 63 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 64 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 65 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 66 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 67 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 68 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 69 | polish_flag | polish_flag | polish_flag | char(1) |
| 70 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 71 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 72 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 73 | saga_status | saga_status | saga_status | number(38, 0) |
| 74 | src_bill_bid | src_bill_bid | src_bill_bid | char(20) |
| 75 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 76 | src_pk_transi_type | src_pk_transi_type | src_pk_transi_type | varchar2(50) |
| 77 | tax | tax | tax | number(28, 8) |
| 78 | taxrate | taxrate | taxrate | number(28, 8) |
| 79 | taxtype | taxtype | taxtype | number(38, 0) |
| 80 | transi_type | transi_type | transi_type | varchar2(50) |
| 81 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 82 | verified_flag | verified_flag | verified_flag | char(1) |
| 83 | verify_global | verify_global | verify_global | number(28, 8) |
| 84 | verify_group | verify_group | verify_group | number(28, 8) |
| 85 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 86 | verify_orig | verify_orig | verify_orig | number(28, 8) |
| 87 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 88 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 89 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 90 | def1 | def1 | def1 | varchar2(101) |
| 91 | def2 | def2 | def2 | varchar2(101) |
| 92 | def3 | def3 | def3 | varchar2(101) |
| 93 | def4 | def4 | def4 | varchar2(101) |
| 94 | def5 | def5 | def5 | varchar2(101) |
| 95 | def6 | def6 | def6 | varchar2(101) |
| 96 | def7 | def7 | def7 | varchar2(101) |
| 97 | def8 | def8 | def8 | varchar2(101) |
| 98 | def9 | def9 | def9 | varchar2(101) |
| 99 | def10 | def10 | def10 | varchar2(101) |
| 100 | def11 | def11 | def11 | varchar2(101) |
| 101 | def12 | def12 | def12 | varchar2(101) |
| 102 | def13 | def13 | def13 | varchar2(101) |
| 103 | def14 | def14 | def14 | varchar2(101) |
| 104 | def15 | def15 | def15 | varchar2(101) |
| 105 | def16 | def16 | def16 | varchar2(101) |
| 106 | def17 | def17 | def17 | varchar2(101) |
| 107 | def18 | def18 | def18 | varchar2(101) |
| 108 | def19 | def19 | def19 | varchar2(101) |
| 109 | def20 | def20 | def20 | varchar2(101) |
| 110 | creationtime | creationtime | creationtime | char(19) |
| 111 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 112 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 113 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 114 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 115 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |