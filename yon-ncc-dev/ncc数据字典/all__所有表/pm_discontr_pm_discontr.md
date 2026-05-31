# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discontr | pk_discontr | pk_discontr | char(20) | √ |
| 2 | actu_teminate_time | actu_teminate_time | actu_teminate_time | char(19) |
| 3 | actu_validate_time | actu_validate_time | actu_validate_time | char(19) |
| 4 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 5 | audittime | audittime | audittime | char(19) |
| 6 | begin_flag | begin_flag | begin_flag | char(1) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(300) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 14 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 15 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 16 | contr_name | contr_name | contr_name | varchar2(300) |
| 17 | contr_version | contr_version | contr_version | number(38, 0) |
| 18 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 19 | curr_mny_global | curr_mny_global | curr_mny_global | number(28, 8) |
| 20 | curr_mny_group | curr_mny_group | curr_mny_group | number(28, 8) |
| 21 | curr_mny_orig | curr_mny_orig | curr_mny_orig | number(28, 8) |
| 22 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 23 | curr_taxmny_global | curr_taxmny_global | curr_taxmny_global | number(28, 8) |
| 24 | curr_taxmny_group | curr_taxmny_group | curr_taxmny_group | number(28, 8) |
| 25 | curr_taxmny_orig | curr_taxmny_orig | curr_taxmny_orig | number(28, 8) |
| 26 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 27 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 28 | last_v_flag | last_v_flag | last_v_flag | char(1) |
| 29 | memo | memo | memo | varchar2(200) |
| 30 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 31 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 32 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 33 | pay_global | pay_global | pay_global | number(28, 8) |
| 34 | pay_group | pay_group | pay_group | number(28, 8) |
| 35 | pay_mny | pay_mny | pay_mny | number(28, 8) |
| 36 | pay_orig | pay_orig | pay_orig | number(28, 8) |
| 37 | pk_billoid | pk_billoid | pk_billoid | varchar2(50) |
| 38 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 39 | pk_contracttype | pk_contracttype | pk_contracttype | varchar2(20) |  |  | '~' |
| 40 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 41 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 42 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 43 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 44 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 45 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 46 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 47 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 48 | pk_payment | pk_payment | pk_payment | varchar2(20) |  |  | '~' |
| 49 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 50 | pk_promisepsn | pk_promisepsn | pk_promisepsn | varchar2(20) |  |  | '~' |
| 51 | pk_pro_dept | pk_pro_dept | pk_pro_dept | varchar2(20) |  |  | '~' |
| 52 | pk_pro_dept_v | pk_pro_dept_v | pk_pro_dept_v | varchar2(20) |  |  | '~' |
| 53 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 54 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 55 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 56 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 57 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 58 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 59 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 60 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 61 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 62 | plan_teminate_time | plan_teminate_time | plan_teminate_time | char(19) |
| 63 | plan_validate_time | plan_validate_time | plan_validate_time | char(19) |
| 64 | promiseplace | promiseplace | promiseplace | varchar2(40) |
| 65 | promisetime | promisetime | promisetime | char(19) |
| 66 | status_date_after | status_date_after | status_date_after | char(19) |
| 67 | status_date_before | status_date_before | status_date_before | char(19) |
| 68 | tax | tax | tax | number(28, 8) |
| 69 | taxrate | taxrate | taxrate | number(28, 8) |
| 70 | taxtype | taxtype | taxtype | number(38, 0) |
| 71 | tot_calcostmny | tot_calcostmny | tot_calcostmny | number(28, 8) |
| 72 | tot_sld_global | tot_sld_global | tot_sld_global | number(28, 8) |
| 73 | tot_sld_group | tot_sld_group | tot_sld_group | number(28, 8) |
| 74 | tot_sld_mny | tot_sld_mny | tot_sld_mny | number(28, 8) |
| 75 | tot_sld_orig | tot_sld_orig | tot_sld_orig | number(28, 8) |
| 76 | tot_taxsld_global | tot_taxsld_global | tot_taxsld_global | number(28, 8) |
| 77 | tot_taxsld_group | tot_taxsld_group | tot_taxsld_group | number(28, 8) |
| 78 | tot_taxsld_mny | tot_taxsld_mny | tot_taxsld_mny | number(28, 8) |
| 79 | tot_taxsld_orig | tot_taxsld_orig | tot_taxsld_orig | number(28, 8) |
| 80 | transi_type | transi_type | transi_type | varchar2(30) |
| 81 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 82 | verify_global | verify_global | verify_global | number(28, 8) |
| 83 | verify_group | verify_group | verify_group | number(28, 8) |
| 84 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 85 | verify_orig | verify_orig | verify_orig | number(28, 8) |
| 86 | def1 | def1 | def1 | varchar2(101) |
| 87 | def2 | def2 | def2 | varchar2(101) |
| 88 | def3 | def3 | def3 | varchar2(101) |
| 89 | def4 | def4 | def4 | varchar2(101) |
| 90 | def5 | def5 | def5 | varchar2(101) |
| 91 | def6 | def6 | def6 | varchar2(101) |
| 92 | def7 | def7 | def7 | varchar2(101) |
| 93 | def8 | def8 | def8 | varchar2(101) |
| 94 | def9 | def9 | def9 | varchar2(101) |
| 95 | def10 | def10 | def10 | varchar2(101) |
| 96 | def11 | def11 | def11 | varchar2(101) |
| 97 | def12 | def12 | def12 | varchar2(101) |
| 98 | def13 | def13 | def13 | varchar2(101) |
| 99 | def14 | def14 | def14 | varchar2(101) |
| 100 | def15 | def15 | def15 | varchar2(101) |
| 101 | def16 | def16 | def16 | varchar2(101) |
| 102 | def17 | def17 | def17 | varchar2(101) |
| 103 | def18 | def18 | def18 | varchar2(101) |
| 104 | def19 | def19 | def19 | varchar2(101) |
| 105 | def21 | def21 | def21 | varchar2(101) |
| 106 | def22 | def22 | def22 | varchar2(101) |
| 107 | def23 | def23 | def23 | varchar2(101) |
| 108 | def24 | def24 | def24 | varchar2(101) |
| 109 | def25 | def25 | def25 | varchar2(101) |
| 110 | def26 | def26 | def26 | varchar2(101) |
| 111 | def27 | def27 | def27 | varchar2(101) |
| 112 | def28 | def28 | def28 | varchar2(101) |
| 113 | def29 | def29 | def29 | varchar2(101) |
| 114 | def30 | def30 | def30 | varchar2(101) |
| 115 | def31 | def31 | def31 | varchar2(101) |
| 116 | def32 | def32 | def32 | varchar2(101) |
| 117 | def33 | def33 | def33 | varchar2(101) |
| 118 | def34 | def34 | def34 | varchar2(101) |
| 119 | def35 | def35 | def35 | varchar2(101) |
| 120 | def36 | def36 | def36 | varchar2(101) |
| 121 | def37 | def37 | def37 | varchar2(101) |
| 122 | def38 | def38 | def38 | varchar2(101) |
| 123 | def39 | def39 | def39 | varchar2(101) |
| 124 | def40 | def40 | def40 | varchar2(101) |
| 125 | def41 | def41 | def41 | varchar2(101) |
| 126 | def42 | def42 | def42 | varchar2(101) |
| 127 | def43 | def43 | def43 | varchar2(101) |
| 128 | def44 | def44 | def44 | varchar2(101) |
| 129 | def45 | def45 | def45 | varchar2(101) |
| 130 | def46 | def46 | def46 | varchar2(101) |
| 131 | def47 | def47 | def47 | varchar2(101) |
| 132 | def48 | def48 | def48 | varchar2(101) |
| 133 | def49 | def49 | def49 | varchar2(101) |
| 134 | def50 | def50 | def50 | varchar2(101) |
| 135 | def51 | def51 | def51 | varchar2(101) |
| 136 | def52 | def52 | def52 | varchar2(101) |
| 137 | def53 | def53 | def53 | varchar2(101) |
| 138 | def54 | def54 | def54 | varchar2(101) |
| 139 | def55 | def55 | def55 | varchar2(101) |
| 140 | def56 | def56 | def56 | varchar2(101) |
| 141 | def57 | def57 | def57 | varchar2(101) |
| 142 | def58 | def58 | def58 | varchar2(101) |
| 143 | def59 | def59 | def59 | varchar2(101) |
| 144 | def60 | def60 | def60 | varchar2(101) |
| 145 | def120 | def120 | def120 | varchar2(101) |
| 146 | creationtime | creationtime | creationtime | char(19) |
| 147 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 148 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 149 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 150 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 151 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |