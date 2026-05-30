# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_sche | pk_contr_sche | pk_contr_sche | char(20) | √ |
| 2 | apply_global | apply_global | apply_global | number(28, 8) |  |  | 0 |
| 3 | apply_group | apply_group | apply_group | number(28, 8) |  |  | 0 |
| 4 | apply_mny | apply_mny | apply_mny | number(28, 8) |  |  | 0 |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | bal_date | bal_date | bal_date | char(19) |
| 8 | bal_mny | bal_mny | bal_mny | number(28, 8) |  |  | 0 |
| 9 | bal_mny_global | bal_mny_global | bal_mny_global | number(28, 8) |  |  | 0 |
| 10 | bal_mny_group | bal_mny_group | bal_mny_group | number(28, 8) |  |  | 0 |
| 11 | bal_tax | bal_tax | bal_tax | number(28, 8) |  |  | 0 |
| 12 | bal_taxmny | bal_taxmny | bal_taxmny | number(28, 8) |  |  | 0 |
| 13 | bal_taxmny_global | bal_taxmny_global | bal_taxmny_global | number(28, 8) |  |  | 0 |
| 14 | bal_taxmny_group | bal_taxmny_group | bal_taxmny_group | number(28, 8) |  |  | 0 |
| 15 | begin_flag | begin_flag | begin_flag | char(1) |
| 16 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 17 | billmaketime | billmaketime | billmaketime | char(19) |
| 18 | bill_code | bill_code | bill_code | varchar2(40) |
| 19 | bill_status | bill_status | bill_status | number(38, 0) |
| 20 | bill_type | bill_type | bill_type | varchar2(4) |  |  | '~' |
| 21 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 22 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 23 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 24 | curr_expe_mny | curr_expe_mny | curr_expe_mny | number(28, 8) |  |  | 0 |
| 25 | curr_verify_mny | curr_verify_mny | curr_verify_mny | number(28, 8) |  |  | 0 |
| 26 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 27 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 28 | expe_mny_global | expe_mny_global | expe_mny_global | number(28, 8) |  |  | 0 |
| 29 | expe_mny_group | expe_mny_group | expe_mny_group | number(28, 8) |  |  | 0 |
| 30 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 31 | invoice_expe_mny | invoice_expe_mny | invoice_expe_mny | number(28, 8) |
| 32 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 33 | memo | memo | memo | varchar2(50) |
| 34 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 35 | nspare_mny | nspare_mny | nspare_mny | number(28, 8) |  |  | 0 |
| 36 | ntot_expe_mny | ntot_expe_mny | ntot_expe_mny | number(28, 8) |  |  | 0 |
| 37 | ntot_sched_mny | ntot_sched_mny | ntot_sched_mny | number(28, 8) |  |  | 0 |
| 38 | orig_expe_mny | orig_expe_mny | orig_expe_mny | number(28, 8) |  |  | 0 |
| 39 | orig_sche_mny | orig_sche_mny | orig_sche_mny | number(28, 8) |  |  | 0 |
| 40 | orig_shou_pay | orig_shou_pay | orig_shou_pay | number(28, 8) |  |  | 0 |
| 41 | orig_spare_mny | orig_spare_mny | orig_spare_mny | number(28, 8) |  |  | 0 |
| 42 | orig_tot_expe_mny | orig_tot_expe_mny | orig_tot_expe_mny | number(28, 8) |  |  | 0 |
| 43 | orig_tot_sched_mny | orig_tot_sched_mny | orig_tot_sched_mny | number(28, 8) |  |  | 0 |
| 44 | orig_tot_sld_mny | orig_tot_sld_mny | orig_tot_sld_mny | number(28, 8) |  |  | 0 |
| 45 | orig_verify_mny | orig_verify_mny | orig_verify_mny | number(28, 8) |  |  | 0 |
| 46 | payable_flag | payable_flag | payable_flag | char(1) |
| 47 | pay_global | pay_global | pay_global | number(28, 8) |  |  | 0 |
| 48 | pay_group | pay_group | pay_group | number(28, 8) |  |  | 0 |
| 49 | pay_mny | pay_mny | pay_mny | number(28, 8) |  |  | 0 |
| 50 | pay_mode | pay_mode | pay_mode | number(38, 0) |
| 51 | pay_prop | pay_prop | pay_prop | number(28, 8) |  |  | 100 |
| 52 | pay_tax | pay_tax | pay_tax | number(28, 8) |  |  | 0 |
| 53 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 54 | pk_checkfactor | pk_checkfactor | pk_checkfactor | varchar2(20) |  |  | '~' |
| 55 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 56 | pk_currtype_contr | pk_currtype_contr | pk_currtype_contr | varchar2(20) |  |  | '~' |
| 57 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 58 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 59 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 60 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 61 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 62 | pk_protocol_taxcode | pk_protocol_taxcode | pk_protocol_taxcode | varchar2(20) |  |  | '~' |
| 63 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 64 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 65 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 66 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 67 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 68 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 69 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 70 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 71 | polish_flag | polish_flag | polish_flag | char(1) |
| 72 | protocol_calcostmny | protocol_calcostmny | protocol_calcostmny | number(28, 8) |
| 73 | protocol_nosubtaxmny | protocol_nosubtaxmny | protocol_nosubtaxmny | number(28, 8) |
| 74 | protocol_nosubtaxrate | protocol_nosubtaxrate | protocol_nosubtaxrate | number(28, 8) |
| 75 | protocol_taxrate | protocol_taxrate | protocol_taxrate | number(28, 8) |
| 76 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 77 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 78 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 79 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 80 | sched_mny | sched_mny | sched_mny | number(28, 8) |
| 81 | sched_mny_global | sched_mny_global | sched_mny_global | number(28, 8) |  |  | 0 |
| 82 | sched_mny_group | sched_mny_group | sched_mny_group | number(28, 8) |  |  | 0 |
| 83 | sched_tax | sched_tax | sched_tax | number(28, 8) |
| 84 | sched_taxmny | sched_taxmny | sched_taxmny | number(28, 8) |
| 85 | servicebalrule | servicebalrule | servicebalrule | number(38, 0) |
| 86 | shou_pay_mny | shou_pay_mny | shou_pay_mny | number(28, 8) |  |  | 0 |
| 87 | shou_pay_mny_global | shou_pay_mny_global | shou_pay_mny_global | number(28, 8) |  |  | 0 |
| 88 | shou_pay_mny_group | shou_pay_mny_group | shou_pay_mny_group | number(28, 8) |  |  | 0 |
| 89 | shou_pay_taxmny | shou_pay_taxmny | shou_pay_taxmny | number(28, 8) |  |  | 0 |
| 90 | shou_pay_taxmny_global | shou_pay_taxmny_global | shou_pay_taxmny_global | number(28, 8) |  |  | 0 |
| 91 | shou_pay_taxmny_group | shou_pay_taxmny_group | shou_pay_taxmny_group | number(28, 8) |  |  | 0 |
| 92 | spare_mny_global | spare_mny_global | spare_mny_global | number(28, 8) |  |  | 0 |
| 93 | spare_mny_group | spare_mny_group | spare_mny_group | number(28, 8) |  |  | 0 |
| 94 | src_bill_code | src_bill_code | src_bill_code | varchar2(30) |
| 95 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 96 | supp_transactor | supp_transactor | supp_transactor | varchar2(20) |  |  | '~' |
| 97 | tot_cost_mny | tot_cost_mny | tot_cost_mny | number(28, 8) |  |  | 0 |
| 98 | tot_expe_global | tot_expe_global | tot_expe_global | number(28, 8) |  |  | 0 |
| 99 | tot_expe_group | tot_expe_group | tot_expe_group | number(28, 8) |  |  | 0 |
| 100 | tot_sld_mny | tot_sld_mny | tot_sld_mny | number(28, 8) |  |  | 0 |
| 101 | tot_sld_mny_global | tot_sld_mny_global | tot_sld_mny_global | number(28, 8) |  |  | 0 |
| 102 | tot_sld_mny_group | tot_sld_mny_group | tot_sld_mny_group | number(28, 8) |  |  | 0 |
| 103 | tot_sld_taxmny | tot_sld_taxmny | tot_sld_taxmny | number(28, 8) |  |  | 0 |
| 104 | tot_sld_taxmny_global | tot_sld_taxmny_global | tot_sld_taxmny_global | number(28, 8) |  |  | 0 |
| 105 | tot_sld_taxmny_group | tot_sld_taxmny_group | tot_sld_taxmny_group | number(28, 8) |  |  | 0 |
| 106 | transi_type | transi_type | transi_type | varchar2(30) |
| 107 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 108 | verified_flag | verified_flag | verified_flag | char(1) |
| 109 | verify_global | verify_global | verify_global | number(28, 8) |  |  | 0 |
| 110 | verify_group | verify_group | verify_group | number(28, 8) |  |  | 0 |
| 111 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 112 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 113 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 114 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 115 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 116 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 117 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 118 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 119 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 120 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 121 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 122 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 123 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 124 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 125 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 126 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 127 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 128 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 129 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 130 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 131 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 132 | creationtime | creationtime | creationtime | char(19) |
| 133 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 134 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 135 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 136 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 137 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |