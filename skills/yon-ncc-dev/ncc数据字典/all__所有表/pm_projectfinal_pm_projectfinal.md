# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectfinal | pk_projectfinal | pk_projectfinal | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 11 | cost_mny | cost_mny | cost_mny | number(28, 8) |  |  | 0 |
| 12 | cost_mny_global | cost_mny_global | cost_mny_global | number(28, 8) |  |  | 0 |
| 13 | cost_mny_group | cost_mny_group | cost_mny_group | number(28, 8) |  |  | 0 |
| 14 | income_mny | income_mny | income_mny | number(28, 8) |  |  | 0 |
| 15 | income_mny_global | income_mny_global | income_mny_global | number(28, 8) |  |  | 0 |
| 16 | income_mny_group | income_mny_group | income_mny_group | number(28, 8) |  |  | 0 |
| 17 | make_date | make_date | make_date | char(19) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_makedept | pk_makedept | pk_makedept | varchar2(20) |  |  | '~' |
| 22 | pk_makedept_v | pk_makedept_v | pk_makedept_v | varchar2(20) |  |  | '~' |
| 23 | pk_maker | pk_maker | pk_maker | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 28 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 29 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 30 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 31 | status_date_after | status_date_after | status_date_after | char(19) |
| 32 | status_date_before | status_date_before | status_date_before | char(19) |
| 33 | transi_type | transi_type | transi_type | varchar2(30) |
| 34 | wbs_status_after | wbs_status_after | wbs_status_after | number(38, 0) |
| 35 | wbs_status_before | wbs_status_before | wbs_status_before | number(38, 0) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |