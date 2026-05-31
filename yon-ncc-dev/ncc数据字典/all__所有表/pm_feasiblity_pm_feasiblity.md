# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feasiblity | pk_feasiblity | pk_feasiblity | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | background | background | background | varchar2(600) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 12 | construction_scheme | construction_scheme | construction_scheme | varchar2(600) |
| 13 | customer_name | customer_name | customer_name | varchar2(50) |
| 14 | estimate_global | estimate_global | estimate_global | number(28, 8) |
| 15 | estimate_group | estimate_group | estimate_group | number(28, 8) |
| 16 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 17 | feasibility_conclusion | feasibility_conclusion | feasibility_conclusion | varchar2(600) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_eps | pk_eps | pk_eps | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_prepare_dept | pk_prepare_dept | pk_prepare_dept | varchar2(20) |  |  | '~' |
| 25 | pk_prepare_dept_v | pk_prepare_dept_v | pk_prepare_dept_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 28 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 29 | prepare_by | prepare_by | prepare_by | varchar2(20) |  |  | '~' |
| 30 | prepare_date | prepare_date | prepare_date | char(19) |
| 31 | project_name | project_name | project_name | varchar2(300) |
| 32 | project_name2 | project_name2 | project_name2 | varchar2(300) |
| 33 | project_name3 | project_name3 | project_name3 | varchar2(300) |
| 34 | project_name4 | project_name4 | project_name4 | varchar2(300) |
| 35 | project_name5 | project_name5 | project_name5 | varchar2(300) |
| 36 | project_name6 | project_name6 | project_name6 | varchar2(300) |
| 37 | reqduration | reqduration | reqduration | number(38, 0) |
| 38 | req_finish_date | req_finish_date | req_finish_date | char(19) |
| 39 | req_start_date | req_start_date | req_start_date | char(19) |
| 40 | review_conclusion | review_conclusion | review_conclusion | varchar2(200) |
| 41 | risk_solution | risk_solution | risk_solution | varchar2(600) |
| 42 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 43 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 44 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 45 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(50) |
| 46 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 47 | transi_type | transi_type | transi_type | varchar2(30) |
| 48 | def1 | def1 | def1 | varchar2(101) |
| 49 | def2 | def2 | def2 | varchar2(101) |
| 50 | def3 | def3 | def3 | varchar2(101) |
| 51 | def4 | def4 | def4 | varchar2(101) |
| 52 | def5 | def5 | def5 | varchar2(101) |
| 53 | def6 | def6 | def6 | varchar2(101) |
| 54 | def7 | def7 | def7 | varchar2(101) |
| 55 | def8 | def8 | def8 | varchar2(101) |
| 56 | def9 | def9 | def9 | varchar2(101) |
| 57 | def10 | def10 | def10 | varchar2(101) |
| 58 | def11 | def11 | def11 | varchar2(101) |
| 59 | def12 | def12 | def12 | varchar2(101) |
| 60 | def13 | def13 | def13 | varchar2(101) |
| 61 | def14 | def14 | def14 | varchar2(101) |
| 62 | def15 | def15 | def15 | varchar2(101) |
| 63 | def16 | def16 | def16 | varchar2(101) |
| 64 | def17 | def17 | def17 | varchar2(101) |
| 65 | def18 | def18 | def18 | varchar2(101) |
| 66 | def19 | def19 | def19 | varchar2(101) |
| 67 | def20 | def20 | def20 | varchar2(101) |
| 68 | creationtime | creationtime | creationtime | char(19) |
| 69 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 70 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 71 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 72 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 73 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |