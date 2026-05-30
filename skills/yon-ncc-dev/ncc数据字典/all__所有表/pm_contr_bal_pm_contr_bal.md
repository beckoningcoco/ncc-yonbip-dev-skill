# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10569.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_bal | pk_contr_bal | pk_contr_bal | char(20) | √ |
| 2 | alt_tax | alt_tax | alt_tax | number(28, 8) |
| 3 | alt_taxrate | alt_taxrate | alt_taxrate | number(28, 8) |
| 4 | apply_mny | apply_mny | apply_mny | number(28, 8) |  |  | 0 |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | balance_date | balance_date | balance_date | char(19) |
| 8 | bal_dif_taxmny | bal_dif_taxmny | bal_dif_taxmny | number(28, 8) |  |  | 0 |
| 9 | bal_taxmny | bal_taxmny | bal_taxmny | number(28, 8) |  |  | 0 |
| 10 | begin_flag | begin_flag | begin_flag | char(1) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billmaketime | billmaketime | billmaketime | char(19) |
| 13 | bill_code | bill_code | bill_code | varchar2(40) |
| 14 | bill_status | bill_status | bill_status | number(38, 0) |
| 15 | bill_type | bill_type | bill_type | varchar2(4) |  |  | '~' |
| 16 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 17 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 18 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 19 | curr_expe_mny | curr_expe_mny | curr_expe_mny | number(28, 8) |  |  | 0 |
| 20 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 21 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 22 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 23 | invoice_expe_mny | invoice_expe_mny | invoice_expe_mny | number(28, 8) |
| 24 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 25 | invoice_qual_mny | invoice_qual_mny | invoice_qual_mny | number(28, 8) |
| 26 | memo | memo | memo | varchar2(200) |
| 27 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 28 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 29 | pay_mny | pay_mny | pay_mny | number(28, 8) |  |  | 0 |
| 30 | pay_mode | pay_mode | pay_mode | number(38, 0) |
| 31 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 32 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 33 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 38 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 39 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 40 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 41 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 42 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 43 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 44 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 45 | polish_flag | polish_flag | polish_flag | char(1) |
| 46 | qual_apply_mny | qual_apply_mny | qual_apply_mny | number(28, 8) |  |  | 0 |
| 47 | qual_mny_deadline | qual_mny_deadline | qual_mny_deadline | char(19) |
| 48 | qual_mny_prop | qual_mny_prop | qual_mny_prop | number(28, 8) |  |  | 0 |
| 49 | qual_pay_date | qual_pay_date | qual_pay_date | char(19) |
| 50 | qual_pay_mny | qual_pay_mny | qual_pay_mny | number(28, 8) |  |  | 0 |
| 51 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |  |  | 0 |
| 52 | qual_time | qual_time | qual_time | number(38, 0) |
| 53 | qual_verify_mny | qual_verify_mny | qual_verify_mny | number(28, 8) |  |  | 0 |
| 54 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 55 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 56 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 57 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 58 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 59 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 60 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 61 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 62 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 63 | transi_type | transi_type | transi_type | varchar2(30) |
| 64 | verified_flag | verified_flag | verified_flag | char(1) |
| 65 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 66 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 67 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 68 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 69 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 70 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 71 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 72 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 73 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 74 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 75 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 76 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 77 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 78 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 79 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 80 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 81 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 82 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 83 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 84 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 85 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 86 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 87 | hdef21 | hdef21 | hdef21 | varchar2(101) |
| 88 | hdef22 | hdef22 | hdef22 | varchar2(101) |
| 89 | hdef23 | hdef23 | hdef23 | varchar2(101) |
| 90 | hdef24 | hdef24 | hdef24 | varchar2(101) |
| 91 | hdef25 | hdef25 | hdef25 | varchar2(101) |
| 92 | hdef26 | hdef26 | hdef26 | varchar2(101) |
| 93 | hdef27 | hdef27 | hdef27 | varchar2(101) |
| 94 | hdef28 | hdef28 | hdef28 | varchar2(101) |
| 95 | hdef29 | hdef29 | hdef29 | varchar2(101) |
| 96 | hdef30 | hdef30 | hdef30 | varchar2(101) |
| 97 | hdef31 | hdef31 | hdef31 | varchar2(101) |
| 98 | hdef32 | hdef32 | hdef32 | varchar2(101) |
| 99 | hdef33 | hdef33 | hdef33 | varchar2(101) |
| 100 | hdef34 | hdef34 | hdef34 | varchar2(101) |
| 101 | hdef35 | hdef35 | hdef35 | varchar2(101) |
| 102 | hdef36 | hdef36 | hdef36 | varchar2(101) |
| 103 | hdef37 | hdef37 | hdef37 | varchar2(101) |
| 104 | hdef38 | hdef38 | hdef38 | varchar2(101) |
| 105 | hdef39 | hdef39 | hdef39 | varchar2(101) |
| 106 | hdef40 | hdef40 | hdef40 | varchar2(101) |
| 107 | hdef41 | hdef41 | hdef41 | varchar2(101) |
| 108 | hdef42 | hdef42 | hdef42 | varchar2(101) |
| 109 | hdef43 | hdef43 | hdef43 | varchar2(101) |
| 110 | hdef44 | hdef44 | hdef44 | varchar2(101) |
| 111 | hdef45 | hdef45 | hdef45 | varchar2(101) |
| 112 | hdef46 | hdef46 | hdef46 | varchar2(101) |
| 113 | hdef47 | hdef47 | hdef47 | varchar2(101) |
| 114 | hdef48 | hdef48 | hdef48 | varchar2(101) |
| 115 | hdef49 | hdef49 | hdef49 | varchar2(101) |
| 116 | hdef50 | hdef50 | hdef50 | varchar2(101) |
| 117 | hdef51 | hdef51 | hdef51 | varchar2(101) |
| 118 | hdef52 | hdef52 | hdef52 | varchar2(101) |
| 119 | hdef53 | hdef53 | hdef53 | varchar2(101) |
| 120 | hdef54 | hdef54 | hdef54 | varchar2(101) |
| 121 | hdef55 | hdef55 | hdef55 | varchar2(101) |
| 122 | hdef56 | hdef56 | hdef56 | varchar2(101) |
| 123 | hdef57 | hdef57 | hdef57 | varchar2(101) |
| 124 | hdef58 | hdef58 | hdef58 | varchar2(101) |
| 125 | hdef59 | hdef59 | hdef59 | varchar2(101) |
| 126 | hdef60 | hdef60 | hdef60 | varchar2(101) |
| 127 | creationtime | creationtime | creationtime | char(19) |
| 128 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 129 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 130 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 131 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 132 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |