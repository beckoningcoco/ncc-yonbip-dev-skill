# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectbuild | pk_projectbuild | pk_projectbuild | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | builfreason | builfreason | builfreason | varchar2(200) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 12 | description | description | description | varchar2(200) |
| 13 | duration | duration | duration | number(38, 0) |
| 14 | estimate_global | estimate_global | estimate_global | number(28, 8) |
| 15 | estimate_group | estimate_group | estimate_group | number(28, 8) |
| 16 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 17 | general_global | general_global | general_global | number(28, 8) |
| 18 | general_group | general_group | general_group | number(28, 8) |
| 19 | general_mny | general_mny | general_mny | number(28, 8) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | oper_date | oper_date | oper_date | char(19) |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_dutier | pk_dutier | pk_dutier | varchar2(20) |  |  | '~' |
| 24 | pk_duty_dept | pk_duty_dept | pk_duty_dept | varchar2(20) |  |  | '~' |
| 25 | pk_duty_dept_v | pk_duty_dept_v | pk_duty_dept_v | varchar2(20) |  |  | '~' |
| 26 | pk_eps | pk_eps | pk_eps | varchar2(20) |  |  | '~' |
| 27 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 30 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 31 | pk_operuser | pk_operuser | pk_operuser | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_parentpro | pk_parentpro | pk_parentpro | varchar2(20) |  |  | '~' |
| 35 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 36 | pk_projectclass | pk_projectclass | pk_projectclass | varchar2(20) |  |  | '~' |
| 37 | pk_projectlib | pk_projectlib | pk_projectlib | varchar2(20) |  |  | '~' |
| 38 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 39 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 40 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 41 | pk_workcalendar | pk_workcalendar | pk_workcalendar | varchar2(20) |  |  | '~' |
| 42 | pk_yearplan_b | pk_yearplan_b | pk_yearplan_b | varchar2(20) |
| 43 | plan_finish_date | plan_finish_date | plan_finish_date | char(19) |
| 44 | plan_start_date | plan_start_date | plan_start_date | char(19) |
| 45 | project_name | project_name | project_name | varchar2(300) |
| 46 | project_name2 | project_name2 | project_name2 | varchar2(300) |
| 47 | project_name3 | project_name3 | project_name3 | varchar2(300) |
| 48 | project_name4 | project_name4 | project_name4 | varchar2(300) |
| 49 | project_name5 | project_name5 | project_name5 | varchar2(300) |
| 50 | project_name6 | project_name6 | project_name6 | varchar2(300) |
| 51 | project_sh_name | project_sh_name | project_sh_name | varchar2(40) |
| 52 | pro_flag | pro_flag | pro_flag | char(1) |
| 53 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 54 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 55 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 56 | saga_status | saga_status | saga_status | number(38, 0) |
| 57 | sharetype | sharetype | sharetype | number(38, 0) |
| 58 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 59 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 60 | src_body_ts | src_body_ts | src_body_ts | char(19) |
| 61 | src_head_ts | src_head_ts | src_head_ts | char(19) |
| 62 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 63 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 64 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 65 | status_date_after | status_date_after | status_date_after | char(19) |
| 66 | status_date_before | status_date_before | status_date_before | char(19) |
| 67 | transi_type | transi_type | transi_type | varchar2(30) |
| 68 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 69 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 70 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 71 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 72 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 73 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 74 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 75 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 76 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 77 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 78 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 79 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 80 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 81 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 82 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 83 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 84 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 85 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 86 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 87 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 88 | creationtime | creationtime | creationtime | char(19) |
| 89 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 90 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 91 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 92 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 93 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |