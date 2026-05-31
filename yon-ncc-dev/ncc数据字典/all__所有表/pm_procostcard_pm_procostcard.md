# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10665.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_procostcard | pk_procostcard | pk_procostcard | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 11 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(256) |
| 13 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 14 | curr_mny_global | curr_mny_global | curr_mny_global | number(28, 8) |
| 15 | curr_mny_group | curr_mny_group | curr_mny_group | number(28, 8) |
| 16 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 17 | curr_taxmny_global | curr_taxmny_global | curr_taxmny_global | number(28, 8) |
| 18 | curr_taxmny_group | curr_taxmny_group | curr_taxmny_group | number(28, 8) |
| 19 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | operationdate | operationdate | operationdate | char(19) |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_fina_org | pk_fina_org | pk_fina_org | varchar2(20) |  |  | '~' |
| 24 | pk_fina_org_v | pk_fina_org_v | pk_fina_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 29 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 30 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 31 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 32 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 33 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 34 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 35 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 36 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 37 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 38 | status_date_after | status_date_after | status_date_after | char(19) |
| 39 | status_date_before | status_date_before | status_date_before | char(19) |
| 40 | tax | tax | tax | number(28, 8) |
| 41 | transi_type | transi_type | transi_type | varchar2(30) |
| 42 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 43 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 44 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 45 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 46 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 47 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 48 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 49 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 50 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 51 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 52 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 53 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 54 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 55 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 56 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 57 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 58 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 59 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 60 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 61 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 62 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 63 | creationtime | creationtime | creationtime | char(19) |
| 64 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 65 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 66 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 67 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 68 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |