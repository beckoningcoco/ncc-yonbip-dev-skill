# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskschedule | pk_taskschedule | pk_taskschedule | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |  |  | '~' |
| 9 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 10 | filltime | filltime | filltime | char(19) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | pk_filldept | pk_filldept | pk_filldept | varchar2(20) |  |  | '~' |
| 13 | pk_filldept_v | pk_filldept_v | pk_filldept_v | varchar2(20) |  |  | '~' |
| 14 | pk_fillmaker | pk_fillmaker | pk_fillmaker | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 19 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 20 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 21 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 22 | report_fintsk_flag | report_fintsk_flag | report_fintsk_flag | char(1) |
| 23 | report_kms_flag | report_kms_flag | report_kms_flag | char(1) |
| 24 | status_date_after | status_date_after | status_date_after | char(19) |
| 25 | status_date_before | status_date_before | status_date_before | char(19) |
| 26 | transi_type | transi_type | transi_type | varchar2(30) |
| 27 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 28 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 29 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 30 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 31 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 32 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 33 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 34 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 35 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 36 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 37 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 38 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 39 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 40 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 41 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 42 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 43 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 44 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 45 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 46 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |