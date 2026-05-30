# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10574.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prepay | pk_prepay | pk_prepay | char(20) | √ |
| 2 | apply_global | apply_global | apply_global | number(28, 8) |  |  | 0 |
| 3 | apply_group | apply_group | apply_group | number(28, 8) |  |  | 0 |
| 4 | apply_mny | apply_mny | apply_mny | number(28, 8) |  |  | 0 |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 15 | curr_prepay_mny | curr_prepay_mny | curr_prepay_mny | number(28, 8) |  |  | 0 |
| 16 | memo | memo | memo | varchar2(200) |
| 17 | pay_global | pay_global | pay_global | number(28, 8) |
| 18 | pay_group | pay_group | pay_group | number(28, 8) |
| 19 | pay_mny | pay_mny | pay_mny | number(28, 8) |
| 20 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 21 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 26 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 27 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 28 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 29 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 30 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 31 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 32 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 33 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 34 | plan_pay_date | plan_pay_date | plan_pay_date | char(19) |
| 35 | prepay_mny_global | prepay_mny_global | prepay_mny_global | number(28, 8) |  |  | 0 |
| 36 | prepay_mny_group | prepay_mny_group | prepay_mny_group | number(28, 8) |  |  | 0 |
| 37 | prepay_prop | prepay_prop | prepay_prop | number(28, 8) |
| 38 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 39 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 40 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 41 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 42 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 43 | supp_transactor | supp_transactor | supp_transactor | varchar2(40) |
| 44 | transi_type | transi_type | transi_type | varchar2(30) |
| 45 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 46 | verify_global | verify_global | verify_global | number(28, 8) |  |  | 0 |
| 47 | verify_group | verify_group | verify_group | number(28, 8) |  |  | 0 |
| 48 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 49 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 50 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 51 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 52 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 53 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 54 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 55 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 56 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 57 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 58 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 59 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 60 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 61 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 62 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 63 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 64 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 65 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 66 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 67 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 68 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |