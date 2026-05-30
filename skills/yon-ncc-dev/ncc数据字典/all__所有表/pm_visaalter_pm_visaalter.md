# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter | pk_alter | pk_alter | char(20) | √ |
| 2 | alter_category | alter_category | alter_category | varchar2(20) |  |  | '~' |
| 3 | alter_reason | alter_reason | alter_reason | varchar2(1024) |
| 4 | apply_date | apply_date | apply_date | char(19) |
| 5 | apply_dept | apply_dept | apply_dept | varchar2(20) |  |  | '~' |
| 6 | apply_dept_v | apply_dept_v | apply_dept_v | varchar2(20) |  |  | '~' |
| 7 | apply_person | apply_person | apply_person | varchar2(20) |  |  | '~' |
| 8 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 9 | audittime | audittime | audittime | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billmaketime | billmaketime | billmaketime | char(19) |
| 12 | bill_code | bill_code | bill_code | varchar2(40) |
| 13 | bill_status | bill_status | bill_status | number(38, 0) |
| 14 | bill_type | bill_type | bill_type | varchar2(4) |
| 15 | budget_info | budget_info | budget_info | varchar2(200) |
| 16 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 17 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 18 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 19 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 20 | isref | isref | isref | number(38, 0) |
| 21 | memo | memo | memo | varchar2(1024) |
| 22 | pk_alter_pmcloud | pk_alter_pmcloud | pk_alter_pmcloud | varchar2(50) |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 28 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 29 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 30 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 31 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 32 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 33 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 34 | tax | tax | tax | number(28, 8) |
| 35 | taxmny | taxmny | taxmny | number(28, 8) |
| 36 | transi_type | transi_type | transi_type | varchar2(30) |
| 37 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 38 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 39 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 40 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 41 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 42 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 43 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 44 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 45 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 46 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 47 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 48 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 49 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 50 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 51 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 52 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 53 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 54 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 55 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 56 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 57 | creationtime | creationtime | creationtime | char(19) |
| 58 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 61 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |