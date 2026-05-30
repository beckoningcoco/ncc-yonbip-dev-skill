# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mater_plan | pk_mater_plan | pk_mater_plan | char(20) | √ |
| 2 | actpercent_before | actpercent_before | actpercent_before | number(28, 8) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |  |  | '~' |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | buysellflag | buysellflag | buysellflag | varchar2(50) |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 13 | contr_version | contr_version | contr_version | number(28, 8) |
| 14 | last_v_flag | last_v_flag | last_v_flag | char(1) |
| 15 | memo | memo | memo | varchar2(200) |
| 16 | pk_billocode | pk_billocode | pk_billocode | varchar2(40) |
| 17 | pk_billoid | pk_billoid | pk_billoid | varchar2(20) |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 23 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 24 | pk_req_dept | pk_req_dept | pk_req_dept | varchar2(20) |  |  | '~' |
| 25 | pk_req_dept_v | pk_req_dept_v | pk_req_dept_v | varchar2(20) |  |  | '~' |
| 26 | pk_req_maker | pk_req_maker | pk_req_maker | varchar2(20) |  |  | '~' |
| 27 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 28 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 29 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 30 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 31 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 32 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 33 | req_make_date | req_make_date | req_make_date | char(19) |
| 34 | status_date_after | status_date_after | status_date_after | char(19) |
| 35 | status_date_before | status_date_before | status_date_before | char(19) |
| 36 | transi_type | transi_type | transi_type | varchar2(30) |
| 37 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 38 | wbs_status_after | wbs_status_after | wbs_status_after | number(38, 0) |
| 39 | wbs_status_before | wbs_status_before | wbs_status_before | number(38, 0) |
| 40 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 41 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 42 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 43 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 44 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 45 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 46 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 47 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 48 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 49 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 50 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 51 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 52 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 53 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 54 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 55 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 56 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 57 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 58 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 59 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 60 | creationtime | creationtime | creationtime | char(19) |
| 61 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 64 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |