# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr | pk_contr | pk_contr | char(20) | √ |
| 2 | actu_teminate_time | actu_teminate_time | actu_teminate_time | char(19) |
| 3 | actu_validate_time | actu_validate_time | actu_validate_time | char(19) |
| 4 | alter_flag | alter_flag | alter_flag | char(1) |  |  | 'N' |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | balaflag | balaflag | balaflag | number(38, 0) |  |  | 1 |
| 8 | begin_flag | begin_flag | begin_flag | char(1) |  |  | 'N' |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | bill_code | bill_code | bill_code | varchar2(40) |
| 12 | bill_name | bill_name | bill_name | varchar2(300) |
| 13 | bill_name2 | bill_name2 | bill_name2 | varchar2(300) |
| 14 | bill_name3 | bill_name3 | bill_name3 | varchar2(300) |
| 15 | bill_name4 | bill_name4 | bill_name4 | varchar2(300) |
| 16 | bill_name5 | bill_name5 | bill_name5 | varchar2(300) |
| 17 | bill_name6 | bill_name6 | bill_name6 | varchar2(300) |
| 18 | bill_nspare_mny | bill_nspare_mny | bill_nspare_mny | number(28, 8) |  |  | 0 |
| 19 | bill_status | bill_status | bill_status | number(38, 0) |
| 20 | bill_type | bill_type | bill_type | varchar2(4) |
| 21 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 22 | calcostmny | calcostmny | calcostmny | number(28, 8) |  |  | 0 |
| 23 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 24 | contr_version | contr_version | contr_version | number(38, 0) |
| 25 | curr_bal_mny | curr_bal_mny | curr_bal_mny | number(28, 8) |  |  | 0 |
| 26 | curr_bal_taxmny | curr_bal_taxmny | curr_bal_taxmny | number(28, 8) |  |  | 0 |
| 27 | curr_mny | curr_mny | curr_mny | number(28, 8) |  |  | 0 |
| 28 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |  |  | 0 |
| 29 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 30 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 31 | last_v_flag | last_v_flag | last_v_flag | char(1) |  |  | 'Y' |
| 32 | memo | memo | memo | varchar2(4000) |
| 33 | modifystatus | modifystatus | modifystatus | number(38, 0) |
| 34 | modify_flag | modify_flag | modify_flag | char(1) |  |  | 'N' |
| 35 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 36 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 37 | nprepay_mny | nprepay_mny | nprepay_mny | number(28, 8) |  |  | 0 |
| 38 | nspare_mny | nspare_mny | nspare_mny | number(28, 8) |  |  | 0 |
| 39 | ntot_expe_bill_mny | ntot_expe_bill_mny | ntot_expe_bill_mny | number(28, 8) |  |  | 0 |
| 40 | ntot_expe_mny | ntot_expe_mny | ntot_expe_mny | number(28, 8) |  |  | 0 |
| 41 | ntot_sched_mny | ntot_sched_mny | ntot_sched_mny | number(28, 8) |  |  | 0 |
| 42 | pay_mny | pay_mny | pay_mny | number(28, 8) |  |  | 0 |
| 43 | pay_mode | pay_mode | pay_mode | number(38, 0) |
| 44 | pk_billcid | pk_billcid | pk_billcid | varchar2(50) |
| 45 | pk_billoid | pk_billoid | pk_billoid | varchar2(20) |
| 46 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 47 | pk_contracttype | pk_contracttype | pk_contracttype | varchar2(20) |  |  | '~' |
| 48 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 49 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 50 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 51 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 52 | pk_payment | pk_payment | pk_payment | varchar2(20) |  |  | '~' |
| 53 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 54 | pk_promisepsn | pk_promisepsn | pk_promisepsn | varchar2(20) |  |  | '~' |
| 55 | pk_promise_dept | pk_promise_dept | pk_promise_dept | varchar2(20) |  |  | '~' |
| 56 | pk_pro_dept_v | pk_pro_dept_v | pk_pro_dept_v | varchar2(20) |  |  | '~' |
| 57 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 58 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 59 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 60 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 61 | plan_teminate_time | plan_teminate_time | plan_teminate_time | char(19) |
| 62 | plan_validate_time | plan_validate_time | plan_validate_time | char(19) |
| 63 | prepayflag | prepayflag | prepayflag | char(1) |  |  | 'N' |
| 64 | promiseplace | promiseplace | promiseplace | varchar2(40) |
| 65 | promisetime | promisetime | promisetime | char(19) |
| 66 | receipt_complete_flag | receipt_complete_flag | receipt_complete_flag | char(1) |  |  | 'N' |
| 67 | sche_flag | sche_flag | sche_flag | char(1) |  |  | 'N' |
| 68 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 69 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 70 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 71 | stopline_prop | stopline_prop | stopline_prop | number(28, 8) |
| 72 | supply_taxmny | supply_taxmny | supply_taxmny | number(28, 8) |
| 73 | tax | tax | tax | number(28, 8) |  |  | 0 |
| 74 | taxrate | taxrate | taxrate | number(28, 8) |
| 75 | tot_comp_mny | tot_comp_mny | tot_comp_mny | number(28, 8) |
| 76 | tot_cost_mny | tot_cost_mny | tot_cost_mny | number(28, 8) |  |  | 0 |
| 77 | tot_sld_taxmny | tot_sld_taxmny | tot_sld_taxmny | number(28, 8) |  |  | 0 |
| 78 | tot_taxmny | tot_taxmny | tot_taxmny | number(28, 8) |
| 79 | transi_type | transi_type | transi_type | varchar2(30) |
| 80 | unit_price_contr | unit_price_contr | unit_price_contr | char(1) |
| 81 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 82 | visa_taxmny | visa_taxmny | visa_taxmny | number(28, 8) |
| 83 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 84 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 85 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 86 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 87 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 88 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 89 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 90 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 91 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 92 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 93 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 94 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 95 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 96 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 97 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 98 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 99 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 100 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 101 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 102 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 103 | hdef21 | hdef21 | hdef21 | varchar2(101) |
| 104 | hdef22 | hdef22 | hdef22 | varchar2(101) |
| 105 | hdef23 | hdef23 | hdef23 | varchar2(101) |
| 106 | hdef24 | hdef24 | hdef24 | varchar2(101) |
| 107 | hdef25 | hdef25 | hdef25 | varchar2(101) |
| 108 | hdef26 | hdef26 | hdef26 | varchar2(101) |
| 109 | hdef27 | hdef27 | hdef27 | varchar2(101) |
| 110 | hdef28 | hdef28 | hdef28 | varchar2(101) |
| 111 | hdef29 | hdef29 | hdef29 | varchar2(101) |
| 112 | hdef30 | hdef30 | hdef30 | varchar2(101) |
| 113 | hdef31 | hdef31 | hdef31 | varchar2(101) |
| 114 | hdef32 | hdef32 | hdef32 | varchar2(101) |
| 115 | hdef33 | hdef33 | hdef33 | varchar2(101) |
| 116 | hdef34 | hdef34 | hdef34 | varchar2(101) |
| 117 | hdef35 | hdef35 | hdef35 | varchar2(101) |
| 118 | hdef36 | hdef36 | hdef36 | varchar2(101) |
| 119 | hdef37 | hdef37 | hdef37 | varchar2(101) |
| 120 | hdef38 | hdef38 | hdef38 | varchar2(101) |
| 121 | hdef39 | hdef39 | hdef39 | varchar2(101) |
| 122 | hdef40 | hdef40 | hdef40 | varchar2(101) |
| 123 | hdef41 | hdef41 | hdef41 | varchar2(101) |
| 124 | hdef42 | hdef42 | hdef42 | varchar2(101) |
| 125 | hdef43 | hdef43 | hdef43 | varchar2(101) |
| 126 | hdef44 | hdef44 | hdef44 | varchar2(101) |
| 127 | hdef45 | hdef45 | hdef45 | varchar2(101) |
| 128 | hdef46 | hdef46 | hdef46 | varchar2(101) |
| 129 | hdef47 | hdef47 | hdef47 | varchar2(101) |
| 130 | hdef48 | hdef48 | hdef48 | varchar2(101) |
| 131 | hdef49 | hdef49 | hdef49 | varchar2(101) |
| 132 | hdef50 | hdef50 | hdef50 | varchar2(101) |
| 133 | hdef51 | hdef51 | hdef51 | varchar2(101) |
| 134 | hdef52 | hdef52 | hdef52 | varchar2(101) |
| 135 | hdef53 | hdef53 | hdef53 | varchar2(101) |
| 136 | hdef54 | hdef54 | hdef54 | varchar2(101) |
| 137 | hdef55 | hdef55 | hdef55 | varchar2(101) |
| 138 | hdef56 | hdef56 | hdef56 | varchar2(101) |
| 139 | hdef57 | hdef57 | hdef57 | varchar2(101) |
| 140 | hdef58 | hdef58 | hdef58 | varchar2(101) |
| 141 | hdef59 | hdef59 | hdef59 | varchar2(101) |
| 142 | hdef60 | hdef60 | hdef60 | varchar2(101) |
| 143 | creationtime | creationtime | creationtime | char(19) |
| 144 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 145 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 146 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 147 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 148 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |