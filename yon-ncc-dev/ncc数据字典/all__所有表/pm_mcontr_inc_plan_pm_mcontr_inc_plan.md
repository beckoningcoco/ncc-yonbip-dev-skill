# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income_plan | pk_income_plan | pk_income_plan | char(20) | √ |
| 2 | actu_mny_global | actu_mny_global | actu_mny_global | number(28, 8) |
| 3 | actu_mny_group | actu_mny_group | actu_mny_group | number(28, 8) |
| 4 | actu_mny_org | actu_mny_org | actu_mny_org | number(28, 8) |
| 5 | actu_mny_orig | actu_mny_orig | actu_mny_orig | number(28, 8) |
| 6 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 7 | audittime | audittime | audittime | char(19) |
| 8 | begin_flag | begin_flag | begin_flag | char(1) |  |  | 'N' |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | bill_code | bill_code | bill_code | varchar2(40) |
| 12 | bill_status | bill_status | bill_status | number(38, 0) |
| 13 | bill_type | bill_type | bill_type | varchar2(4) |
| 14 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 15 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 16 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 17 | contr_income_mode | contr_income_mode | contr_income_mode | number(38, 0) |
| 18 | contr_version | contr_version | contr_version | number(38, 0) |
| 19 | deadline | deadline | deadline | char(19) |
| 20 | dispose_dept | dispose_dept | dispose_dept | varchar2(20) |  |  | '~' |
| 21 | dispose_dept_v | dispose_dept_v | dispose_dept_v | varchar2(20) |  |  | '~' |
| 22 | dispose_person | dispose_person | dispose_person | varchar2(20) |  |  | '~' |
| 23 | due_shou_mny | due_shou_mny | due_shou_mny | number(28, 8) |
| 24 | effectbase | effectbase | effectbase | varchar2(20) |  |  | '~' |
| 25 | effectdate | effectdate | effectdate | char(19) |
| 26 | effect_flag | effect_flag | effect_flag | char(1) |  |  | 'N' |
| 27 | finishpercent | finishpercent | finishpercent | number(28, 8) |
| 28 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 29 | iscreatereceive | iscreatereceive | iscreatereceive | char(1) |
| 30 | memo | memo | memo | varchar2(300) |
| 31 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 32 | not_pre_taxmny | not_pre_taxmny | not_pre_taxmny | number(28, 8) |
| 33 | paymentday | paymentday | paymentday | number(38, 0) |
| 34 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 35 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 36 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_mar_contr | pk_mar_contr | pk_mar_contr | varchar2(20) |  |  | '~' |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_paymentch | pk_paymentch | pk_paymentch | varchar2(20) |
| 42 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 43 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 44 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 45 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 46 | pk_transitype | pk_transitype | pk_transitype | varchar2(50) |  |  | '~' |
| 47 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 48 | prepayment_enum | prepayment_enum | prepayment_enum | number(38, 0) |
| 49 | pre_rate | pre_rate | pre_rate | number(28, 8) |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 54 | shou_mny_global | shou_mny_global | shou_mny_global | number(28, 8) |
| 55 | shou_mny_group | shou_mny_group | shou_mny_group | number(28, 8) |
| 56 | shou_mny_org | shou_mny_org | shou_mny_org | number(28, 8) |
| 57 | shou_mny_orig | shou_mny_orig | shou_mny_orig | number(28, 8) |
| 58 | shou_taxmny_global | shou_taxmny_global | shou_taxmny_global | number(28, 8) |
| 59 | shou_taxmny_group | shou_taxmny_group | shou_taxmny_group | number(28, 8) |
| 60 | shou_taxmny_org | shou_taxmny_org | shou_taxmny_org | number(28, 8) |
| 61 | showorder | showorder | showorder | number(38, 0) |
| 62 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 63 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 64 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 65 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 66 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 67 | tax | tax | tax | number(28, 8) |
| 68 | transi_type | transi_type | transi_type | varchar2(30) |
| 69 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 70 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 71 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 72 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 73 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 74 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 75 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 76 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 77 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 78 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 79 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 80 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 81 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 82 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 83 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 84 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 85 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 86 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 87 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 88 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 89 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 90 | creationtime | creationtime | creationtime | char(19) |
| 91 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 92 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 93 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 94 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 95 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |