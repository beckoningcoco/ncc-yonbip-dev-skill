# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mar_contr | pk_mar_contr | pk_mar_contr | char(20) | √ |
| 2 | actpercent_before | actpercent_before | actpercent_before | number(28, 8) |
| 3 | actual_mny_curr | actual_mny_curr | actual_mny_curr | number(28, 8) |
| 4 | actual_mny_global | actual_mny_global | actual_mny_global | number(28, 8) |
| 5 | actual_mny_group | actual_mny_group | actual_mny_group | number(28, 8) |
| 6 | actual_mny_orig | actual_mny_orig | actual_mny_orig | number(28, 8) |
| 7 | actu_teminate_time | actu_teminate_time | actu_teminate_time | char(19) |
| 8 | actu_validate_time | actu_validate_time | actu_validate_time | char(19) |
| 9 | alter_mny | alter_mny | alter_mny | number(28, 8) |
| 10 | alter_tax | alter_tax | alter_tax | number(28, 8) |
| 11 | alter_taxmny | alter_taxmny | alter_taxmny | number(28, 8) |
| 12 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 13 | audittime | audittime | audittime | char(19) |
| 14 | bal_mny_global | bal_mny_global | bal_mny_global | number(28, 8) |
| 15 | bal_mny_group | bal_mny_group | bal_mny_group | number(28, 8) |
| 16 | bal_mny_org | bal_mny_org | bal_mny_org | number(28, 8) |
| 17 | bal_taxmny_global | bal_taxmny_global | bal_taxmny_global | number(28, 8) |
| 18 | bal_taxmny_group | bal_taxmny_group | bal_taxmny_group | number(28, 8) |
| 19 | bal_taxmny_org | bal_taxmny_org | bal_taxmny_org | number(28, 8) |
| 20 | begin_flag | begin_flag | begin_flag | char(1) |  |  | 'N' |
| 21 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 22 | billmaketime | billmaketime | billmaketime | char(19) |
| 23 | bill_code | bill_code | bill_code | varchar2(40) |
| 24 | bill_name | bill_name | bill_name | varchar2(450) |
| 25 | bill_name2 | bill_name2 | bill_name2 | varchar2(450) |
| 26 | bill_name3 | bill_name3 | bill_name3 | varchar2(450) |
| 27 | bill_name4 | bill_name4 | bill_name4 | varchar2(450) |
| 28 | bill_name5 | bill_name5 | bill_name5 | varchar2(450) |
| 29 | bill_name6 | bill_name6 | bill_name6 | varchar2(450) |
| 30 | bill_status | bill_status | bill_status | number(38, 0) |
| 31 | bill_type | bill_type | bill_type | varchar2(4) |
| 32 | build_flag | build_flag | build_flag | char(1) |  |  | 'N' |
| 33 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 34 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 35 | cha_mny_global | cha_mny_global | cha_mny_global | number(28, 8) |
| 36 | cha_mny_group | cha_mny_group | cha_mny_group | number(28, 8) |
| 37 | cha_mny_org | cha_mny_org | cha_mny_org | number(28, 8) |
| 38 | cha_taxmny_global | cha_taxmny_global | cha_taxmny_global | number(28, 8) |
| 39 | cha_taxmny_group | cha_taxmny_group | cha_taxmny_group | number(28, 8) |
| 40 | cha_taxmny_org | cha_taxmny_org | cha_taxmny_org | number(28, 8) |
| 41 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 42 | confirm_receipt_mode | confirm_receipt_mode | confirm_receipt_mode | number(38, 0) |  |  | 0 |
| 43 | contr_bal_taxmny | contr_bal_taxmny | contr_bal_taxmny | number(28, 8) |
| 44 | contr_version | contr_version | contr_version | number(38, 0) |
| 45 | final_bal_flag | final_bal_flag | final_bal_flag | char(1) |
| 46 | income_flag | income_flag | income_flag | char(1) |  |  | 'N' |
| 47 | income_mode | income_mode | income_mode | number(38, 0) |
| 48 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 49 | last_v_flag | last_v_flag | last_v_flag | char(1) |  |  | 'Y' |
| 50 | memo | memo | memo | varchar2(300) |
| 51 | mny_curr | mny_curr | mny_curr | number(28, 8) |
| 52 | mny_global | mny_global | mny_global | number(28, 8) |
| 53 | mny_group | mny_group | mny_group | number(28, 8) |
| 54 | mny_orig | mny_orig | mny_orig | number(28, 8) |
| 55 | modifystatus | modifystatus | modifystatus | number(38, 0) |
| 56 | modify_flag | modify_flag | modify_flag | char(1) |  |  | 'N' |
| 57 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 58 | pk_billcid | pk_billcid | pk_billcid | varchar2(50) |
| 59 | pk_billoid | pk_billoid | pk_billoid | varchar2(20) |
| 60 | pk_contracttype | pk_contracttype | pk_contracttype | varchar2(20) |  |  | '~' |
| 61 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 62 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 63 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 64 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 65 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 66 | pk_income | pk_income | pk_income | varchar2(20) |  |  | '~' |
| 67 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 68 | pk_org_currtype | pk_org_currtype | pk_org_currtype | varchar2(20) |  |  | '~' |
| 69 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 70 | pk_plan | pk_plan | pk_plan | varchar2(36) |  |  | '~' |
| 71 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 72 | pk_projecttype | pk_projecttype | pk_projecttype | varchar2(20) |  |  | '~' |
| 73 | pk_promisepsn | pk_promisepsn | pk_promisepsn | varchar2(20) |  |  | '~' |
| 74 | pk_promise_dept | pk_promise_dept | pk_promise_dept | varchar2(20) |  |  | '~' |
| 75 | pk_pro_dept_v | pk_pro_dept_v | pk_pro_dept_v | varchar2(20) |  |  | '~' |
| 76 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 77 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 78 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 79 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 80 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 81 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 82 | plan_teminate_time | plan_teminate_time | plan_teminate_time | char(19) |
| 83 | plan_validate_time | plan_validate_time | plan_validate_time | char(19) |
| 84 | pre_mny_global | pre_mny_global | pre_mny_global | number(28, 8) |
| 85 | pre_mny_group | pre_mny_group | pre_mny_group | number(28, 8) |
| 86 | pre_mny_org | pre_mny_org | pre_mny_org | number(28, 8) |
| 87 | pre_taxmny_global | pre_taxmny_global | pre_taxmny_global | number(28, 8) |
| 88 | pre_taxmny_group | pre_taxmny_group | pre_taxmny_group | number(28, 8) |
| 89 | pre_taxmny_org | pre_taxmny_org | pre_taxmny_org | number(28, 8) |
| 90 | promiseplace | promiseplace | promiseplace | varchar2(40) |
| 91 | promisetime | promisetime | promisetime | char(19) |
| 92 | provide_register_complete | provide_register_complete | provide_register_complete | char(1) |  |  | 'N' |
| 93 | pro_flag | pro_flag | pro_flag | char(1) |  |  | 'N' |
| 94 | qual_bal_taxmny | qual_bal_taxmny | qual_bal_taxmny | number(28, 8) |
| 95 | qual_shou_taxmny | qual_shou_taxmny | qual_shou_taxmny | number(28, 8) |
| 96 | reqduration | reqduration | reqduration | number(38, 0) |
| 97 | req_finish_date | req_finish_date | req_finish_date | char(19) |
| 98 | req_start_date | req_start_date | req_start_date | char(19) |
| 99 | shou_mny_curr | shou_mny_curr | shou_mny_curr | number(28, 8) |
| 100 | shou_mny_global | shou_mny_global | shou_mny_global | number(28, 8) |
| 101 | shou_mny_group | shou_mny_group | shou_mny_group | number(28, 8) |
| 102 | shou_mny_orig | shou_mny_orig | shou_mny_orig | number(28, 8) |
| 103 | shou_taxmny_curr | shou_taxmny_curr | shou_taxmny_curr | number(28, 8) |
| 104 | shou_taxmny_global | shou_taxmny_global | shou_taxmny_global | number(28, 8) |
| 105 | shou_taxmny_group | shou_taxmny_group | shou_taxmny_group | number(28, 8) |
| 106 | shou_taxmny_orig | shou_taxmny_orig | shou_taxmny_orig | number(28, 8) |
| 107 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 108 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 109 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 110 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 111 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 112 | surinvoice_mny | surinvoice_mny | surinvoice_mny | number(28, 8) |
| 113 | tax | tax | tax | number(28, 8) |
| 114 | taxmny_curr | taxmny_curr | taxmny_curr | number(28, 8) |
| 115 | taxmny_global | taxmny_global | taxmny_global | number(28, 8) |
| 116 | taxmny_group | taxmny_group | taxmny_group | number(28, 8) |
| 117 | taxmny_orig | taxmny_orig | taxmny_orig | number(28, 8) |
| 118 | taxrate | taxrate | taxrate | number(28, 8) |
| 119 | total_mny | total_mny | total_mny | number(28, 8) |
| 120 | total_taxmny | total_taxmny | total_taxmny | number(28, 8) |
| 121 | transi_type | transi_type | transi_type | varchar2(30) |
| 122 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 123 | verify_mny_curr | verify_mny_curr | verify_mny_curr | number(28, 8) |
| 124 | verify_mny_global | verify_mny_global | verify_mny_global | number(28, 8) |
| 125 | verify_mny_group | verify_mny_group | verify_mny_group | number(28, 8) |
| 126 | verify_mny_orig | verify_mny_orig | verify_mny_orig | number(28, 8) |
| 127 | wbs_status_after | wbs_status_after | wbs_status_after | number(38, 0) |
| 128 | wbs_status_before | wbs_status_before | wbs_status_before | number(38, 0) |
| 129 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 130 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 131 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 132 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 133 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 134 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 135 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 136 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 137 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 138 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 139 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 140 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 141 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 142 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 143 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 144 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 145 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 146 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 147 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 148 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 149 | creationtime | creationtime | creationtime | char(19) |
| 150 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 151 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 152 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 153 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 154 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |